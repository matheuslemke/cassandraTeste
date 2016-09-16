package TesteCassandra.TesteCassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class CassandraMainQuery{
	private Cluster cluster;
	private Session session;
	
	public void Conection(String local, String Keyspace){
		
		cluster = Cluster.builder().addContactPoint(local).build();
		session = cluster.connect(Keyspace);
		
	}
	
	public void insertMainQuery (){
		String query = "";
		ResultSet result = session.execute(query);
	}
	
	public void selectAllMainQuery (){
		String query = "";
		ResultSet result = session.execute(query);
		
	}
	
	public void deleteMainQuery (String field, String whereCondition){
		String query = "";
		ResultSet result = session.execute(query);
		
	}
	public void updateMainQuery (String field, String whereCondition){
		String query = "";
		ResultSet result = session.execute(query);
		
	}
	
	
	
}
