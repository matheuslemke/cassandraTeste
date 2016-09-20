package dao;

import java.util.List;

import com.datastax.driver.core.Row;

import model.EnderecoLocal;
import model.MainQuery;
import util.Querier;

public class DAOMainQuery
{
	private MainQuery mainQuery;

	public DAOMainQuery(MainQuery mainQuery)
	{
		this.mainQuery = mainQuery;
	}

	public DAOMainQuery()
	{
		super();
	}

	public void insert()
	{
		Querier querier = new Querier();
		String query = querier.insert(mainQuery);
		Connector.getSession().execute(query);
		System.out.println(query);
	}

	public List<Row> selectAll()
	{
		String query = "SELECT * FROM mainquery;";
		return Connector.getSession().execute(query).all();
	}

	public MainQuery getMainQuery()
	{
		return mainQuery;
	}

	public void setMainQuery(MainQuery mainQuery)
	{
		this.mainQuery = mainQuery;
	}

	public void init()
	{
		List<Row> listEnderecoLocal = Connector.getSession()
				.execute("SELECT datainicio, datafim, id_local, id_endereco FROM enderecolocal;").all();

		int i = 0;
		EnderecoLocal el = new EnderecoLocal();

		for (Row enderecoLocal : listEnderecoLocal)
		{
			if (i % 100 == 0)
				System.err.println("\nEnderecoLocal " + i + "\n");

			el.setIdLocal(enderecoLocal.getLong(2));
			el.setIdEndereco(enderecoLocal.getLong(3));
			this.insertCascade(el);
			i++;
		}
	}

	public void insertCascade(EnderecoLocal enderecoLocal)
	{
		Row local, parceiro, parceiroAssociado, infoComplementar, pessoaFisica, endereco, logradouro, tipoLogradouro,
				cidade, unidadeFederativa, pais, localidade;
		Querier querier = new Querier();
		MainQuery mainQuery = new MainQuery();
		mainQuery.setIdLocal(enderecoLocal.getIdLocal());
		mainQuery.setIdEndereco(enderecoLocal.getIdEndereco());
		local = querier
				.getUniqueRow("SELECT codigo, descricao, cnpj, id_parceiro FROM local WHERE ativo = 1 AND id_local = "
						+ mainQuery.getIdLocal() + " ALLOW FILTERING;");
		if (local != null)
		{
			mainQuery.setCodigoLocal(local.getLong(0));
			mainQuery.setDescricaoLocal(local.getString(1).replace("'", ""));
			mainQuery.setCnpjLocal(local.getString(2));
			mainQuery.setIdParceiro(local.getLong(3));

			// Essa lista só tem 1 registro ou é nula por causa dos
			// filtros
			parceiro = querier.getUniqueRow(
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
					parceiroAssociado = querier.getUniqueRow(
							"SELECT numeromatricula FROM parceiroassociado WHERE associado = 1 AND id_parceiro = "
									+ mainQuery.getIdParceiro() + " ALLOW FILTERING;");
					if (parceiroAssociado != null)
					{
						mainQuery.setNumeroMatriculaParceiroAssociado(parceiroAssociado.getLong(0));
						// Definir CPF
						infoComplementar = querier.getUniqueRow(
								"SELECT id_informacaocomplementar FROM informacaocomplementar WHERE id_parceiro = "
										+ mainQuery.getIdParceiro() + " ;");
						if (infoComplementar != null)
						{
							mainQuery.setIdInfoComplementar(infoComplementar.getLong(0));
							pessoaFisica = querier
									.getUniqueRow("SELECT cpf FROM pessoafisica WHERE id_informacaocomplementar = "
											+ mainQuery.getIdInfoComplementar() + " ;");
							if (pessoaFisica != null)
							{
								mainQuery.setCpfPessoaFisica(pessoaFisica.getString(0));
							} else
								System.out.println("PessoaFisica Nula");
						} else
							System.out.println("InfoComplementar Nula");
					}
				}

				endereco = querier
						.getUniqueRow("SELECT numero, id_logradouro, id_localidade FROM endereco WHERE id_endereco = "
								+ mainQuery.getIdEndereco() + " ;");
				if (endereco != null)
				{
					mainQuery.setNumeroEndereco(endereco.getString(0));
					mainQuery.setIdLogradouro(endereco.getLong(1));
					mainQuery.setIdLocalidade(endereco.getLong(2));

					logradouro = querier.getUniqueRow(
							"SELECT descricao, id_tipologradouro, id_cidade FROM logradouro WHERE id_logradouro = "
									+ mainQuery.getIdLogradouro() + " ;");
					if (logradouro != null)
					{
						mainQuery.setDescricaoLogradouro(logradouro.getString(0).replace("'", ""));
						mainQuery.setIdTipoLogradouro(logradouro.getLong(1));
						mainQuery.setIdCidade(logradouro.getLong(2));

						tipoLogradouro = querier
								.getUniqueRow("SELECT descricao FROM tipologradouro WHERE id_tipologradouro = "
										+ mainQuery.getIdTipoLogradouro() + " ;");
						if (tipoLogradouro != null)
							mainQuery.setDescricaoTipoLogradouro(tipoLogradouro.getString(0));

						String queryCidade = "SELECT descricao, id_unidadefederativa FROM cidade WHERE id_cidade = "
								+ (Long) mainQuery.getIdCidade() + ";";
						cidade = querier.getUniqueRow(queryCidade);
						if (cidade != null)
						{
							mainQuery.setDescricaoCidade(cidade.getString(0).replace("'", ""));
							mainQuery.setIdUnidadeFederativa(cidade.getLong(1));

							unidadeFederativa = querier.getUniqueRow(
									"SELECT sigla, id_pais FROM unidadefederativa WHERE id_unidadefederativa = "
											+ (Long) mainQuery.getIdUnidadeFederativa() + " ;");
							if (unidadeFederativa != null)
							{
								mainQuery.setSiglaUnidadeFederativa(unidadeFederativa.getString(0));
								mainQuery.setIdPais(unidadeFederativa.getLong(1));

								String queryPais = "SELECT sigla FROM pais WHERE id_pais = "
										+ (Long) mainQuery.getIdPais() + " ;";
								pais = querier.getUniqueRow(queryPais);
								if (pais != null)
								{
									mainQuery.setSiglaPais(pais.getString(0));

									localidade = querier
											.getUniqueRow("SELECT descricao FROM localidade WHERE id_localidade = "
													+ mainQuery.getIdLocalidade() + " ;");
									if (localidade != null)
									{
										mainQuery.setDescricaoLocalidade(localidade.getString(0).replace("'", ""));
										this.setMainQuery(mainQuery);
										this.insert();
									} else
										mainQuery.setDescricaoLocalidade("''");
									this.setMainQuery(mainQuery);
									this.insert();
									System.err.println("LOCALIDADE com ID = " + mainQuery.getIdLocalidade()
											+ ". Foi inserido mesmo assim com descricao nula");
								} else
									System.out.println("Pais Nulo");
							} else
								System.out.println("Uf Nula");
						} else
							System.out.println("Cidade Nula");
					} else
						System.out.println("Logradouro Nula");
				} else
					System.out.println("Endereco Nulo");
			} else
				System.out.println("Parceiro null");
		} else
			System.err.println("Local null ID = " + mainQuery.getIdLocal());
	}

}
