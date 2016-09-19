package dao;

import java.util.List;

import com.datastax.driver.core.Row;

public class Selector
{
	public static Row getUniqueRow(String query)
	{
		List<Row> list = Connector.getSession().execute(query).all();
		if (!list.isEmpty())
			return list.get(0);
		return null;
	}
}
