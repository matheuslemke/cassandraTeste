package model;

import java.util.Date;

public class EnderecoLocal
{
	private long idEnderecoLocal;
	private Date dataFim;
	private Date dataInicio;
	private long idEndereco;
	private long idLocal;

	public long getIdEnderecoLocal()
	{
		return idEnderecoLocal;
	}

	public void setIdEnderecoLocal(long idEnderecoLocal)
	{
		this.idEnderecoLocal = idEnderecoLocal;
	}

	public Date getDataFim()
	{
		return dataFim;
	}

	public void setDataFim(Date dataFim)
	{
		this.dataFim = dataFim;
	}

	public Date getDataInicio()
	{
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio)
	{
		this.dataInicio = dataInicio;
	}

	public long getIdEndereco()
	{
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco)
	{
		this.idEndereco = idEndereco;
	}

	public long getIdLocal()
	{
		return idLocal;
	}

	public void setIdLocal(long idLocal)
	{
		this.idLocal = idLocal;
	}

}
