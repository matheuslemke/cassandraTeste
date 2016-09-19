package util;

import java.util.List;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import dao.Connector;

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
}
