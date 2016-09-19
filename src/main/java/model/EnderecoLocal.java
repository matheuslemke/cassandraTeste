package model;

import java.time.LocalDate;

public class EnderecoLocal
{
	private long idEnderecoLocal;
	private LocalDate dataFim;
	private LocalDate dataInicio;
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

	public LocalDate getDataFim()
	{
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim)
	{
		this.dataFim = dataFim;
	}

	public LocalDate getDataInicio()
	{
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio)
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
