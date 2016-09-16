package dao;

import java.util.List;

import com.datastax.driver.core.Row;

public class DAOEnderecoLocal
{
	public List<Row> selectAll()
	{
		String query = "SELECT * FROM enderecolocal;";
		return Connector.getSession().execute(query).all();
	}
}
