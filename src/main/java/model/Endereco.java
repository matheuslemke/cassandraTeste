package model;

public class Endereco
{
	private long idEndereco;
	private String caixaPostal;
	private String cep;
	private String complemento;
	private long idLocalidade;
	private long idLogradouro;
	private String numero;

	public long getIdEndereco()
	{
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco)
	{
		this.idEndereco = idEndereco;
	}

	public String getCaixaPostal()
	{
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal)
	{
		this.caixaPostal = caixaPostal;
	}

	public String getCep()
	{
		return cep;
	}

	public void setCep(String cep)
	{
		this.cep = cep;
	}

	public String getComplemento()
	{
		return complemento;
	}

	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}

	public long getIdLocalidade()
	{
		return idLocalidade;
	}

	public void setIdLocalidade(long idLocalidade)
	{
		this.idLocalidade = idLocalidade;
	}

	public long getIdLogradouro()
	{
		return idLogradouro;
	}

	public void setIdLogradouro(long idLogradouro)
	{
		this.idLogradouro = idLogradouro;
	}

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

}