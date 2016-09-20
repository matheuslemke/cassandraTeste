package util;

import java.util.List;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import dao.Connector;
import model.MainQuery;

public class Querier
{
	public Querier()
	{

	}

	public Row selectUniqueRow(String[] fields, String fromAndId, long value)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fields.length; i++)
		{
			sb.append(fields[i]);
			if (i != fields.length - 1)
				sb.append(", ");
		}
		List<Row> list = Connector.getSession()
				.execute(QueryBuilder.select(sb.toString()).from(fromAndId)
						.where(QueryBuilder.eq("id_" + fromAndId, value)).setConsistencyLevel(ConsistencyLevel.ALL))
				.all();

		if (!list.isEmpty())
			return list.get(0);
		return null;
	}

	public Row selectUniqueRow(String[] fields, String fromAndId, String value)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < fields.length; i++)
		{
			sb.append(fields[i]);
			if (i != fields.length - 1)
				sb.append(", ");
		}
		List<Row> list = Connector.getSession()
				.execute(QueryBuilder.select(sb.toString()).from(fromAndId)
						.where(QueryBuilder.eq("id_" + fromAndId, value)).setConsistencyLevel(ConsistencyLevel.ALL))
				.all();

		if (!list.isEmpty())
			return list.get(0);
		return null;
	}

	public String insert(MainQuery mainQuery)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO mainquery (");
		sb.append(Constants.fieldsMainQuery);
		sb.append(") VALUES (");
		sb.append(mainQuery.getIdLocal());
		sb.append(", ");
		sb.append(mainQuery.getIdEndereco());
		sb.append(", ");
		sb.append(mainQuery.getCodigoLocal());
		sb.append(", ");
		sb.append(mainQuery.getDescricaoLocal());
		sb.append(", ");
		sb.append(mainQuery.getCnpjLocal());
		sb.append(", ");
		sb.append(mainQuery.getIdParceiro());
		sb.append(", ");
		sb.append(mainQuery.getNomeParceiro());
		sb.append(", ");
		sb.append(mainQuery.getCodigoParceiro());
		sb.append(", ");
		sb.append(mainQuery.getIdFlagTipoPessoa());
		sb.append(", ");
		sb.append(mainQuery.getIdGrupoEmpresarial());
		sb.append(", ");
		sb.append(mainQuery.getNumeroMatriculaParceiroAssociado());
		sb.append(", ");
		sb.append(mainQuery.getIdInfoComplementar());
		sb.append(", ");
		sb.append(mainQuery.getNumeroEndereco());
		sb.append(", ");
		sb.append(mainQuery.getIdLogradouro());
		sb.append(", ");
		sb.append(mainQuery.getIdLocalidade());
		sb.append(", ");
		sb.append(mainQuery.getDescricaoLogradouro());
		sb.append(", ");
		sb.append(mainQuery.getIdTipoLogradouro());
		sb.append(", ");
		sb.append(mainQuery.getIdCidade());
		sb.append(", ");
		sb.append(mainQuery.getDescricaoTipoLogradouro());
		sb.append(", ");
		sb.append(mainQuery.getDescricaoCidade());
		sb.append(", ");
		sb.append(mainQuery.getIdUnidadeFederativa());
		sb.append(", ");
		sb.append(mainQuery.getSiglaUnidadeFederativa());
		sb.append(", ");
		sb.append(mainQuery.getIdPais());
		sb.append(", ");
		sb.append(mainQuery.getSiglaPais());
		sb.append(", ");
		sb.append(mainQuery.getDescricaoLocalidade());
		sb.append(");");
		return sb.toString();
	}

	public Row getUniqueRow(String query)
	{
		List<Row> list = Connector.getSession().execute(query).all();
		if (!list.isEmpty())
			return list.get(0);
		return null;
	}
}
