package dao;

import com.datastax.driver.core.Row;
import com.datastax.driver.core.UDTValue;

import model.MainQuery;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MainQueryInitializer
{

	public void initializeMainQuery()
	{
		List<Row> listEnderecoLocal = Connector.getSession()
				.execute("SELECT datainicio, datafim, id_local, id_endereco FROM enderecolocal;").all();
		Row local, parceiro, parceiroAssociado, infoComplementar, pessoaFisica, endereco, logradouro, tipoLogradouro,
				cidade, unidadeFederativa, pais, localidade;
		int i = -1, cidadesNulas = 0, paisesNulos = 0, enderecosNulos = 0, ufNulas = 0, localidadesNulas = 0,
				logradourosNulos = 0, infoComplNulas = 0, pessoasFisicasNulas = 0, locaisNulos = 0, parceirosNulos = 0;
		DAOMainQuery dao = new DAOMainQuery();
		MainQuery mainQuery;

		for (Row enderecoLocal : listEnderecoLocal)
		{
			i++;
			if (i % 100 == 0)
			{
				System.out.println();
				System.err.println("EnderecoLocal " + i);
				// System.err.println("COUNT = "
				// + Connector.getSession().execute("SELECT count(*) FROM
				// mainquery ALLOW FILTERING;").all());
				System.out.println();
			}
			if (i > 56900)
			{
				// if (isDataValid(enderecoLocal))
				// {
				mainQuery = new MainQuery();

				mainQuery.setIdLocal(enderecoLocal.getLong(2));
				mainQuery.setIdEndereco(enderecoLocal.getLong(3));

				local = getUniqueRow(
						"SELECT codigo, descricao, cnpj, id_parceiro FROM local WHERE ativo = 1 AND id_local = "
								+ mainQuery.getIdLocal() + " ALLOW FILTERING;");
				if (local != null)
				{
					mainQuery.setCodigoLocal(local.getLong(0));
					mainQuery.setDescricaoLocal(local.getString(1).replace("'", ""));
					mainQuery.setCnpjLocal(local.getString(2));
					mainQuery.setIdParceiro(local.getLong(3));

					// Essa lista só tem 1 registro ou é nula por causa dos
					// filtros
					parceiro = getUniqueRow(
							"SELECT nome, codigo, id_flagtipopessoa, id_grupoempresarial FROM parceiro WHERE id_parceiro = "
									+ mainQuery.getIdParceiro()
									+ " AND id_grupoempresarial = 1 AND ativo = 1 ALLOW FILTERING;");

					if (parceiro != null)
					{
						mainQuery.setNomeParceiro(parceiro.getString(0).replace("'", ""));
						mainQuery.setCodigoParceiro(parceiro.getLong(1));
						mainQuery.setIdFlagTipoPessoa(parceiro.getLong(2));
						mainQuery.setIdGrupoEmpresarial(parceiro.getLong(3));

						if (mainQuery.getIdFlagTipoPessoa() != 174)
						{
							// Definição de matricula =
							// parceiroassociado.matricula
							parceiroAssociado = getUniqueRow(
									"SELECT numeromatricula FROM parceiroassociado WHERE associado = 1 AND id_parceiro = "
											+ mainQuery.getIdParceiro() + " ALLOW FILTERING;");
							if (parceiroAssociado != null)
							{
								mainQuery.setNumeroMatriculaParceiroAssociado(parceiroAssociado.getLong(0));
								// Definir CPF
								infoComplementar = getUniqueRow(
										"SELECT id_informacaocomplementar FROM informacaocomplementar WHERE id_parceiro = "
												+ mainQuery.getIdParceiro() + " ;");
								if (infoComplementar != null)
								{
									mainQuery.setIdInfoComplementar(infoComplementar.getLong(0));
									pessoaFisica = getUniqueRow(
											"SELECT cpf FROM pessoafisica WHERE id_informacaocomplementar = "
													+ mainQuery.getIdInfoComplementar() + " ;");
									if (pessoaFisica != null)
									{
										mainQuery.setCpfPessoaFisica(pessoaFisica.getString(0));
									} else
									{
										System.out.println("Mais uma pessoaFisica Nula");
										pessoasFisicasNulas++;
									}
								} else
								{
									System.out.println("Mais uma infoComplementar Nula");
									infoComplNulas++;
								}
							}
						}

						endereco = getUniqueRow(
								"SELECT numero, id_logradouro, id_localidade FROM endereco WHERE id_endereco = "
										+ mainQuery.getIdEndereco() + " ;");
						if (endereco != null)
						{
							mainQuery.setNumeroEndereco(endereco.getString(0));
							mainQuery.setIdLogradouro(endereco.getLong(1));
							mainQuery.setIdLocalidade(endereco.getLong(2));

							logradouro = getUniqueRow(
									"SELECT descricao, id_tipologradouro, id_cidade FROM logradouro WHERE id_logradouro = "
											+ mainQuery.getIdLogradouro() + " ;");
							if (logradouro != null)
							{
								mainQuery.setDescricaoLogradouro(logradouro.getString(0).replace("'", ""));
								mainQuery.setIdTipoLogradouro(logradouro.getLong(1));
								mainQuery.setIdCidade(logradouro.getLong(2));

								tipoLogradouro = getUniqueRow(
										"SELECT descricao FROM tipologradouro WHERE id_tipologradouro = "
												+ mainQuery.getIdTipoLogradouro() + " ;");
								if (tipoLogradouro != null)
									mainQuery.setDescricaoTipoLogradouro(tipoLogradouro.getString(0));

								String queryCidade = "SELECT descricao, id_unidadefederativa FROM cidade WHERE id_cidade = "
										+ (Long) mainQuery.getIdCidade() + ";";
								cidade = getUniqueRow(queryCidade);
								if (cidade != null)
								{
									mainQuery.setDescricaoCidade(cidade.getString(0).replace("'", ""));
									mainQuery.setIdUnidadeFederativa(cidade.getLong(1));

									unidadeFederativa = getUniqueRow(
											"SELECT sigla, id_pais FROM unidadefederativa WHERE id_unidadefederativa = "
													+ (Long) mainQuery.getIdUnidadeFederativa() + " ;");
									if (unidadeFederativa != null)
									{
										mainQuery.setSiglaUnidadeFederativa(unidadeFederativa.getString(0));
										mainQuery.setIdPais(unidadeFederativa.getLong(1));

										String queryPais = "SELECT sigla FROM pais WHERE id_pais = "
												+ (Long) mainQuery.getIdPais() + " ;";
										pais = getUniqueRow(queryPais);
										if (pais != null)
										{
											mainQuery.setSiglaPais(pais.getString(0));

											localidade = getUniqueRow(
													"SELECT descricao FROM localidade WHERE id_localidade = "
															+ mainQuery.getIdLocalidade() + " ;");
											if (localidade != null)
											{
												mainQuery.setDescricaoLocalidade(
														localidade.getString(0).replace("'", ""));
												dao.setMainQuery(mainQuery);
												dao.insert();
											} else
											{
												mainQuery.setDescricaoLocalidade("''");
												dao.setMainQuery(mainQuery);
												dao.insert();
												System.err.println("LOCALIDADE com ID = " + mainQuery.getIdLocalidade()
														+ ". Foi inserido mesmo assim com descricao nula");
												localidadesNulas++;
											}
										} else
										{
											System.out.println("Mais um pais Nulo");
											paisesNulos++;
										}
									} else
									{
										System.out.println("Mais uma uf Nula");
										ufNulas++;
									}

								} else
								{
									System.out.println("Mais uma cidade Nula");
									cidadesNulas++;
								}
							} else
							{
								System.out.println("Mais um logradouro Nula");
								logradourosNulos++;
							}
						} else
						{
							System.out.println("Mais um endereco Nulo");
							enderecosNulos++;
						}
					} else
					{
						System.out.println("Parceiro null");
						parceirosNulos++;
					}
				} else
				{
					System.err.println("Local null ID = " + mainQuery.getIdLocal());
					locaisNulos++;
				}
				// } else
				// System.out.println("Data inv");
			}
		}
		List<Integer> nulos = new LinkedList<Integer>();
		nulos.add(cidadesNulas);
		nulos.add(paisesNulos);
		nulos.add(enderecosNulos);
		nulos.add(ufNulas);
		nulos.add(localidadesNulas);
		nulos.add(logradourosNulos);
		nulos.add(infoComplNulas);
		nulos.add(pessoasFisicasNulas);
		nulos.add(locaisNulos);
		nulos.add(parceirosNulos);
		System.out.println(nulos);
	}

	@SuppressWarnings("deprecation")
	private boolean isDataValid(Row enderecoLocal)
	{
		LocalDate localDateHoje = LocalDate.now();
		Date dataHoje = new Date(localDateHoje.getYear() - 1900, localDateHoje.getMonthValue() - 1,
				localDateHoje.getDayOfMonth());

		UDTValue dataInicioSelected = enderecoLocal.getUDTValue(0);
		int diaInicio = dataInicioSelected.getInt(0);
		int mesInicio = dataInicioSelected.getInt(1);
		int anoInicio = dataInicioSelected.getInt(2);

		UDTValue dataFimSelected = enderecoLocal.getUDTValue(1);
		int diaFim;
		int mesFim;
		int anoFim;
		Date dataFim;

		if (dataFimSelected == null)
			dataFim = null;
		else
		{
			diaFim = dataFimSelected.getInt(0);
			mesFim = dataFimSelected.getInt(1);
			anoFim = dataFimSelected.getInt(2);
			dataFim = new Date(anoFim - 1900, mesFim - 1, diaFim);
		}

		Date dataInicio = new Date(anoInicio - 1900, mesInicio - 1, diaInicio);

		if (dataInicio.compareTo(dataHoje) <= 0 && (dataFim == null || dataFim.compareTo(dataHoje) >= 0))
			return true;
		return false;
	}

	private Row getUniqueRow(String query)
	{
		List<Row> list = Connector.getSession().execute(query).all();
		if (!list.isEmpty())
			return list.get(0);
		return null;
	}

	private Row getUniqueRow(String query, String debug)
	{
		List<Row> list = Connector.getSession().execute(query).all();
		if (!list.isEmpty())
		{
			System.out.println(debug + list);
			return list.get(0);
		}
		return null;
	}
}
