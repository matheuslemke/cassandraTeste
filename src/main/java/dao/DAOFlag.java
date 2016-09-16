package dao;

import java.util.List;

import com.datastax.driver.core.Row;

public class DAOFlag
{
	public List<Row> selectAll()
	{
		String query = "SELECT * FROM flag;";
		return Connector.getSession().execute(query).all();
	}
}
