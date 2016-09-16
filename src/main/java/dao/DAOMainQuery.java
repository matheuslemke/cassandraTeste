package dao;

import java.util.List;

import com.datastax.driver.core.Row;

import model.MainQuery;
import util.Constants;

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
		String query = "INSERT INTO mainquery (" + Constants.fieldsMainQuery + ") VALUES (" + mainQuery.getIdLocal()
				+ ", " + mainQuery.getIdEndereco() + ", " + mainQuery.getCodigoLocal() + ", "
				+ mainQuery.getDescricaoLocal() + ", " + mainQuery.getCnpjLocal() + ", " + mainQuery.getIdParceiro()
				+ ", " + mainQuery.getNomeParceiro() + ", " + mainQuery.getCodigoParceiro() + ", "
				+ mainQuery.getIdFlagTipoPessoa() + ", " + mainQuery.getIdGrupoEmpresarial() + ", "
				+ mainQuery.getNumeroMatriculaParceiroAssociado() + ", " + mainQuery.getIdInfoComplementar() + ", "
				+ mainQuery.getCpfPessoaFisica() + ", " + mainQuery.getNumeroEndereco() + ", "
				+ mainQuery.getIdLogradouro() + ", " + mainQuery.getIdLocalidade() + ", "
				+ mainQuery.getDescricaoLogradouro() + ", " + mainQuery.getIdTipoLogradouro() + ", "
				+ mainQuery.getIdCidade() + ", " + mainQuery.getDescricaoTipoLogradouro() + ", "
				+ mainQuery.getDescricaoCidade() + ", " + mainQuery.getIdUnidadeFederativa() + ", "
				+ mainQuery.getSiglaUnidadeFederativa() + ", " + mainQuery.getIdPais() + ", " + mainQuery.getSiglaPais()
				+ ", " + mainQuery.getDescricaoLocalidade() + ");";
		Connector.getSession().execute(query);
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

}
