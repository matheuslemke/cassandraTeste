package dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

import util.Constants;

public class Connector
{
	private static Cluster cluster;
	private static Session session;

	public static void buildSession()
	{
		setCluster(Cluster.builder().addContactPoint(Constants.seed).build());
		setSession(cluster.connect(Constants.keyspaceName));
	}

	public static Session getSession()
	{
		return session;
	}

	public static void setSession(Session session)
	{
		Connector.session = session;
	}

	public static Cluster getCluster()
	{
		return cluster;
	}

	public static void setCluster(Cluster cluster)
	{
		Connector.cluster = cluster;
	}

	public static void closeSession()
	{
		getSession().close();
		getCluster().close();
	}

}
