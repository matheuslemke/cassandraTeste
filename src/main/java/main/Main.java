package main;

import dao.Connector;
import dao.MainQueryInitializer;

public class Main
{

	public static void main(String[] args)
	{
		Connector.buildSession();

		MainQueryInitializer init = new MainQueryInitializer();
		init.initializeMainQuery();

		// System.out.println(Connector.getSession()
		// .execute("SELECT descricao, id_unidadefederativa FROM cidade WHERE
		// id_cidade = " + (long) 9568609 + ";")
		// .all());

		Connector.closeSession();
	}

}
