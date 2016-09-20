package main;

import dao.Connector;
import dao.DAOMainQuery;

public class Main
{

	public static void main(String[] args)
	{
		Connector.buildSession();

		DAOMainQuery dao = new DAOMainQuery();
		// dao.init();

		System.out.println(dao.selectAll());

		Connector.closeSession();

	}

}
