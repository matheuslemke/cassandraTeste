package TesteCassandra.TesteCassandra;

import java.util.List;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// query
		String query = "SELECT id_parceiro, ativo, nome FROM parceiro ;";

		// Creating Cluster object
		Cluster cluster = Cluster.builder().addContactPoint("10.30.51.58").build();
		//System.out.println(cluster.getClusterName()); // To get Cluster Name
		//System.out.println(cluster.getDriverVersion()); // To get Driver Version
		//System.out.println(cluster.getConfiguration()); // To get cluster Configurations
		//System.out.println(cluster.getMetadata());// To get Cluster Metadata
		//System.out.println(cluster.getMetrics());// To get Metrics associated with cluster.

		// Creating Session object
		Session session = cluster.connect("\"CassandraTeste1\"");

		// Executing the query
		ResultSet result1 = session.execute(query);
		// getUsersAllDetails(session);
		System.out.println("teste imprimir todos users");
		List<Row> r= result1.all();
		System.out.println(r.size());
		System.out.println(result1.all());
		// System.out.println("teste imprimir lista todos users");
		 //r= result1.all();
		System.out.println(r.size());
		System.out.println(r.get(0).toString());
		System.out.println("Xdrfxfd");
		System.out.println(r.get(0).getString(2));	
		

	}
}
