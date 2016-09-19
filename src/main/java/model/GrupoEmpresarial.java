package model;

public class GrupoEmpresarial
{
	private long idGrupoEmpresarial;
	private long codigo;
	private String descricao;
	private long idAdministrador;

	public long getIdGrupoEmpresarial()
	{
		return idGrupoEmpresarial;
	}

	public void setIdGrupoEmpresarial(long idGrupoEmpresarial)
	{
		this.idGrupoEmpresarial = idGrupoEmpresarial;
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

	public long getIdAdministrador()
	{
		return idAdministrador;
	}

	public void setIdAdministrador(long idAdministrador)
	{
		this.idAdministrador = idAdministrador;
	}
}
