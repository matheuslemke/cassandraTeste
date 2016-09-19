package model;

public class Pais
{
	private long idPais;
	private String codigoAnp;
	private String codigoSiscomex;
	private String descricao;
	private long idGrupoEmpresarial;
	private String nacionalidade;
	private String sigla;

	public long getIdPais()
	{
		return idPais;
	}

	public void setIdPais(long idPais)
	{
		this.idPais = idPais;
	}

	public String getCodigoAnp()
	{
		return codigoAnp;
	}

	public void setCodigoAnp(String codigoAnp)
	{
		this.codigoAnp = codigoAnp;
	}

	public String getCodigoSiscomex()
	{
		return codigoSiscomex;
	}

	public void setCodigoSiscomex(String codigoSiscomex)
	{
		this.codigoSiscomex = codigoSiscomex;
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

	public String getNacionalidade()
	{
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade)
	{
		this.nacionalidade = nacionalidade;
	}

	public String getSigla()
	{
		return sigla;
	}

	public void setSigla(String sigla)
	{
		this.sigla = sigla;
	}

}
