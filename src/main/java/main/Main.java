package main;

import java.util.List;

import com.datastax.driver.core.Row;

import dao.Connector;
import dao.DAOFlag;

public class Main
{

	public static void main(String[] args)
	{
		Connector.buildSession();

		DAOFlag daoFlag = new DAOFlag();
		List<Row> list = daoFlag.selectAll();

		System.out.println(list.size());

		Connector.closeSession();
	}

}
