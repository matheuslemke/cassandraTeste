package model;

public class TipoLogradouro
{
	private long idTipoLogradouro;
	private long codigo;
	private String descricao;
	private long idGrupoEmpresarial;

	public long getIdTipoLogradouro()
	{
		return idTipoLogradouro;
	}

	public void setIdTipoLogradouro(long idTipoLogradouro)
	{
		this.idTipoLogradouro = idTipoLogradouro;
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

	public long getIdGrupoEmpresarial()
	{
		return idGrupoEmpresarial;
	}

	public void setIdGrupoEmpresarial(long idGrupoEmpresarial)
	{
		this.idGrupoEmpresarial = idGrupoEmpresarial;
	}

}
