package model;

public class Localidade
{
	private long idLocalidade;
	private long idCidade;
	private long codigo;
	private String descricao;

	public long getIdLocalidade()
	{
		return idLocalidade;
	}

	public void setIdLocalidade(long idLocalidade)
	{
		this.idLocalidade = idLocalidade;
	}

	public long getIdCidade()
	{
		return idCidade;
	}

	public void setIdCidade(long idCidade)
	{
		this.idCidade = idCidade;
	}

	public long getCodigo()
	{
		return codigo;
	}

	public void setCodigo(long codigo)
	{
		this.codigo = codigo;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

}
