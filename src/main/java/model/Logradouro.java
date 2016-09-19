package model;

public class Logradouro
{
	private long idLogradouro;
	private long idCidade;
	private long idTipoLogradouro;
	private String descricao;
	private long codigo;

	public long getIdLogradouro()
	{
		return idLogradouro;
	}

	public void setIdLogradouro(long idLogradouro)
	{
		this.idLogradouro = idLogradouro;
	}

	public long getIdCidade()
	{
		return idCidade;
	}

	public void setIdCidade(long idCidade)
	{
		this.idCidade = idCidade;
	}

	public long getIdTipoLogradouro()
	{
		return idTipoLogradouro;
	}

	public void setIdTipoLogradouro(long idTipoLogradouro)
	{
		this.idTipoLogradouro = idTipoLogradouro;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public long getCodigo()
	{
		return codigo;
	}

	public void setCodigo(long codigo)
	{
		this.codigo = codigo;
	}
}
