package main;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import dao.Connector;
import dao.MainQueryInitializer;
import util.Querier;

public class Main
{

	public static void main(String[] args)
	{
		Connector.buildSession();

		MainQueryInitializer init = new MainQueryInitializer();
		init.initializeMainQuery();

		// System.out.println(Connector.getSession()
		// .execute(QueryBuilder.select("id_local").from("local").setConsistencyLevel(ConsistencyLevel.ALL))
		// .all());

		// System.out.println(Connector.getSession().execute("SELECT * FROM
		// local;").all());
		// Querier q = new Querier();
		// System.out.println(q.selectUniqueRow(new String[] { "nome" },
		// "parceiro", "'LECIO DORS'"));

		Connector.closeSession();

	}

}
