package dao;

import com.datastax.driver.core.Row;
import com.datastax.driver.core.UDTValue;

import model.MainQuery;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class MainQueryInitializer
{

	public void initializeMainQuery()
	{
		List<Row> listEnderecoLocal = Connector.getSession()
				.execute("SELECT datainicio, datafim, id_local, id_endereco FROM enderecolocal;").all();
		Row local, parceiro, parceiroAssociado, infoComplementar, pessoaFisica, endereco, logradouro, tipoLogradouro,
				cidade, unidadeFederativa, pais, localidade;
		long idLocal = 0, idEndereco = 0, idParceiro = 0, idFlagTipoPessoa = 0, idInfoComplementar, idLogradouro = 0,
				idLocalidade = 0, idTipoLogradouro = 0, idCidade = 0, idUnidadeFederativa = 0, idPais = 0;

		DAOMainQuery dao = new DAOMainQuery();

		for (Row enderecoLocal : listEnderecoLocal)
		{
			if (isDataValid(enderecoLocal))
			{
				MainQuery mainQuery = new MainQuery();

				mainQuery.setIdLocal(enderecoLocal.getLong(2));
				mainQuery.setIdEndereco(enderecoLocal.getLong(3));

				local = getUniqueRow(
						"SELECT codigo, descricao, cnpj, id_parceiro FROM local WHERE ativo = 1 AND id_local = "
								+ idLocal + ";");
				mainQuery.setCodigoLocal(local.getLong(0));
				mainQuery.setDescricaoLocal(local.getString(1));
				mainQuery.setCnpjLocal(local.getLong(2));
				mainQuery.setIdParceiro(local.getLong(3));

				// Essa lista só tem 1 registro ou é nula por causa dos filtros
				parceiro = getUniqueRow(
						"SELECT nome, codigo, id_flagtipopessoa, id_grupoempresarial FROM parceiro WHERE id_parceiro = "
								+ idParceiro + " AND id_grupoempresarial = 1 AND ativo = 1 ALLOW FILTERING;");
				if (parceiro != null)
				{
					mainQuery.setNomeParceiro(parceiro.getString(0));
					mainQuery.setCodigoParceiro(parceiro.getLong(1));
					mainQuery.setIdFlagTipoPessoa(parceiro.getLong(2));
					mainQuery.setIdGrupoEmpresarial(parceiro.getLong(3));

					idInfoComplementar = 0;

					if (idFlagTipoPessoa != 174)
					{
						// Definição de matricula = parceiroassociado.matricula
						parceiroAssociado = getUniqueRow(
								"SELECT numeromatricula FROM parceiroassociado WHERE associado = 1 AND id_parceiro = "
										+ idParceiro + " ALLOW FILTERING;");
						mainQuery.setNumeroMatriculaParceiroAssociado(parceiroAssociado.getLong(0));
						// Definir CPF
						infoComplementar = getUniqueRow(
								"SELECT id_informacaocomplementar FROM informacaocomplementar WHERE id_parceiro = "
										+ idParceiro + " ;");
						mainQuery.setIdInfoComplementar(infoComplementar.getLong(0));
						pessoaFisica = getUniqueRow("SELECT cpf FROM pessoafisica WHERE id_informacaocomplementar = "
								+ idInfoComplementar + " ;");
						mainQuery.setCpfPessoaFisica(pessoaFisica.getLong(0));
					}

					endereco = getUniqueRow(
							"SELECT numero, id_logradouro, id_localidade FROM endereco WHERE id_endereco = "
									+ idEndereco + " ;");
					mainQuery.setNumeroEndereco(endereco.getString(0));
					mainQuery.setIdLogradouro(endereco.getLong(1));
					mainQuery.setIdLocalidade(endereco.getLong(2));

					logradouro = getUniqueRow(
							"SELECT descricao, id_tipologradouro, id_cidade FROM logradouro WHERE id_logradouro = "
									+ idLogradouro + " ;");
					mainQuery.setDescricaoLogradouro(logradouro.getString(0));
					mainQuery.setIdTipoLogradouro(logradouro.getLong(1));
					mainQuery.setIdCidade(logradouro.getLong(2));

					tipoLogradouro = getUniqueRow("SELECT descricao FROM tipologradouro WHERE id_tipologradouro = "
							+ idTipoLogradouro + " ;");
					mainQuery.setDescricaoTipoLogradouro(tipoLogradouro.getString(0));

					cidade = getUniqueRow(
							"SELECT descricao, id_unidadefederativa FROM cidade WHERE id_cidade = " + idCidade + " ;");
					mainQuery.setDescricaoCidade(cidade.getString(0));
					mainQuery.setIdUnidadeFederativa(cidade.getLong(1));

					unidadeFederativa = getUniqueRow(
							"SELECT sigla, id_pais FROM unidadefederativa WHERE id_unidadefederativa = "
									+ idUnidadeFederativa + " ;");
					mainQuery.setSiglaUnidadeFederativa(unidadeFederativa.getString(0));
					mainQuery.setIdPais(unidadeFederativa.getLong(1));

					pais = getUniqueRow("SELECT sigla FROM pais WHERE id_pais = " + idPais + " ;");
					mainQuery.setSiglaPais(pais.getString(0));

					localidade = getUniqueRow(
							"SELECT descricao FROM localidade WHERE id_localidade = " + idLocalidade + " ;");

					mainQuery.setDescricaoLocalidade(localidade.getString(0));
					dao.insert();
				}
			}
		}
	}

	@SuppressWarnings("deprecation")
	public boolean isDataValid(Row enderecoLocal)
	{
		LocalDate localDateHoje = LocalDate.now();
		Date dataHoje = new Date(localDateHoje.getYear() - 1900, localDateHoje.getMonthValue() - 1,
				localDateHoje.getDayOfMonth());

		UDTValue dataInicioSelected = enderecoLocal.getUDTValue(0);
		int diaInicio = dataInicioSelected.getInt(0);
		int mesInicio = dataInicioSelected.getInt(1);
		int anoInicio = dataInicioSelected.getInt(2);

		UDTValue dataFimSelected = enderecoLocal.getUDTValue(1);
		int diaFim = dataFimSelected.getInt(0);
		int mesFim = dataFimSelected.getInt(1);
		int anoFim = dataFimSelected.getInt(2);

		Date dataInicio = new Date(anoInicio - 1900, mesInicio - 1, diaInicio);
		Date dataFim = new Date(anoFim - 1900, mesFim - 1, diaFim);

		if (dataInicio.compareTo(dataHoje) <= 0 && (dataFim == null || dataFim.compareTo(dataHoje) >= 0))
			return true;
		return false;
	}

	public Row getUniqueRow(String query)
	{
		List<Row> list = Connector.getSession().execute(query).all();
		return list.get(0);
	}
}
