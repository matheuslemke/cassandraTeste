package dao;

import java.util.List;

import com.datastax.driver.core.Row;

import model.EnderecoLocal;
import util.Constants;
import util.UtilierUDT;

public class DAOEnderecoLocal
{
	private EnderecoLocal enderecoLocal;

	public DAOEnderecoLocal(EnderecoLocal enderecoLocal)
	{
		super();
		this.enderecoLocal = enderecoLocal;
	}

	public EnderecoLocal getEnderecoLocal()
	{
		return enderecoLocal;
	}

	public void setEnderecoLocal(EnderecoLocal enderecoLocal)
	{
		this.enderecoLocal = enderecoLocal;
	}

	public void insert()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO enderecolocal ");
		sb.append(Constants.fieldsEnderecoLocal);
		sb.append(" VALUES (");
		sb.append(enderecoLocal.getIdEnderecoLocal());
		sb.append(", ");
		sb.append(UtilierUDT.toData(enderecoLocal.getDataFim()));
		sb.append(", ");
		sb.append(UtilierUDT.toData(enderecoLocal.getDataInicio()));
		sb.append(", ");
		sb.append(enderecoLocal.getIdEndereco());
		sb.append(", ");
		sb.append(enderecoLocal.getIdLocal());
		sb.append(");");
		Connector.getSession().execute(sb.toString());

		DAOMainQuery daoMQ = new DAOMainQuery();
		daoMQ.insertCascade(enderecoLocal);
	}

	public List<Row> selectAll()
	{
		String query = "SELECT * FROM enderecolocal;";
		return Connector.getSession().execute(query).all();
	}
}
