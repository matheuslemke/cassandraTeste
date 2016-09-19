package dao;

import java.util.Date;
import java.util.List;

import com.datastax.driver.core.Row;

import model.Endereco;
import model.Local;
import util.Constants;
import util.UDTConversor;

public class DAOEnderecoLocal
{
	public void insert(long idEnderecoLocal, Date dataFim, Date dataInicio, Endereco endereco, Local local)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO enderecolocal ");
		sb.append(Constants.fieldsEnderecoLocal);
		sb.append(" VALUES (");
		sb.append(idEnderecoLocal);
		sb.append(", ");
		sb.append(UDTConversor.toData(dataFim));
		sb.append(", ");
		sb.append(UDTConversor.toData(dataInicio));
		sb.append(", ");
		sb.append(endereco.getIdEndereco());
		sb.append(", ");
		sb.append(local.getIdLocal());
		sb.append(");");
		Connector.getSession().execute(sb.toString());
	}

	public List<Row> selectAll()
	{
		String query = "SELECT * FROM enderecolocal;";
		return Connector.getSession().execute(query).all();
	}
}
