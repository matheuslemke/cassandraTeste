package model;

//import com.datastax.driver.core.DataType;

public class MainQuery
{
	private long idLocal;
	private long idEndereco;
	private long codigoLocal;
	private String descricaoLocal;
	private long cnpjLocal;
	private long idParceiro;
	private String nomeParceiro;
	private long codigoParceiro;
	private long idFlagTipoPessoa;
	private long idGrupoEmpresarial;
	private long numeroMatriculaParceiroAssociado;
	private long idInfoComplementar;
	private long cpfPessoaFisica;
	private String numeroEndereco;
	private long idLogradouro;
	private long idLocalidade;
	private String descricaoLogradouro;
	private long idTipoLogradouro;
	private long idCidade;
	private String descricaoTipoLogradouro;
	private String descricaoCidade;
	private long idUnidadeFederativa;
	private String siglaUnidadeFederativa;
	private long idPais;
	private String siglaPais;
	private String descricaoLocalidade;

	public long getIdLocal()
	{
		return idLocal;
	}

	public void setIdLocal(long idLocal)
	{
		this.idLocal = idLocal;
	}

	public long getIdEndereco()
	{
		return idEndereco;
	}

	public void setIdEndereco(long idEndereco)
	{
		this.idEndereco = idEndereco;
	}

	public long getCodigoLocal()
	{
		return codigoLocal;
	}

	public void setCodigoLocal(long codigoLocal)
	{
		this.codigoLocal = codigoLocal;
	}

	public String getDescricaoLocal()
	{
		return descricaoLocal;
	}

	public void setDescricaoLocal(String descricaoLocal)
	{
		this.descricaoLocal = descricaoLocal;
	}

	public long getCnpjLocal()
	{
		return cnpjLocal;
	}

	public void setCnpjLocal(long cnpjLocal)
	{
		this.cnpjLocal = cnpjLocal;
	}

	public long getIdParceiro()
	{
		return idParceiro;
	}

	public void setIdParceiro(long idParceiro)
	{
		this.idParceiro = idParceiro;
	}

	public String getNomeParceiro()
	{
		return nomeParceiro;
	}

	public void setNomeParceiro(String nomeParceiro)
	{
		this.nomeParceiro = nomeParceiro;
	}

	public long getCodigoParceiro()
	{
		return codigoParceiro;
	}

	public void setCodigoParceiro(long codigoParceiro)
	{
		this.codigoParceiro = codigoParceiro;
	}

	public long getIdFlagTipoPessoa()
	{
		return idFlagTipoPessoa;
	}

	public void setIdFlagTipoPessoa(long idFlagTipoPessoa)
	{
		this.idFlagTipoPessoa = idFlagTipoPessoa;
	}

	public long getIdGrupoEmpresarial()
	{
		return idGrupoEmpresarial;
	}

	public void setIdGrupoEmpresarial(long idGrupoEmpresarial)
	{
		this.idGrupoEmpresarial = idGrupoEmpresarial;
	}

	public long getNumeroMatriculaParceiroAssociado()
	{
		return numeroMatriculaParceiroAssociado;
	}

	public void setNumeroMatriculaParceiroAssociado(long numeroMatriculaParceiroAssociado)
	{
		this.numeroMatriculaParceiroAssociado = numeroMatriculaParceiroAssociado;
	}

	public long getIdInfoComplementar()
	{
		return idInfoComplementar;
	}

	public void setIdInfoComplementar(long idInfoComplementar)
	{
		this.idInfoComplementar = idInfoComplementar;
	}

	public long getCpfPessoaFisica()
	{
		return cpfPessoaFisica;
	}

	public void setCpfPessoaFisica(long cpfPessoaFisica)
	{
		this.cpfPessoaFisica = cpfPessoaFisica;
	}

	public String getNumeroEndereco()
	{
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco)
	{
		this.numeroEndereco = numeroEndereco;
	}

	public long getIdLogradouro()
	{
		return idLogradouro;
	}

	public void setIdLogradouro(long idLogradouro)
	{
		this.idLogradouro = idLogradouro;
	}

	public long getIdLocalidade()
	{
		return idLocalidade;
	}

	public void setIdLocalidade(long idLocalidade)
	{
		this.idLocalidade = idLocalidade;
	}

	public String getDescricaoLogradouro()
	{
		return descricaoLogradouro;
	}

	public void setDescricaoLogradouro(String descricaoLogradouro)
	{
		this.descricaoLogradouro = descricaoLogradouro;
	}

	public long getIdTipoLogradouro()
	{
		return idTipoLogradouro;
	}

	public void setIdTipoLogradouro(long idTipoLogradouro)
	{
		this.idTipoLogradouro = idTipoLogradouro;
	}

	public long getIdCidade()
	{
		return idCidade;
	}

	public void setIdCidade(long idCidade)
	{
		this.idCidade = idCidade;
	}

	public String getDescricaoTipoLogradouro()
	{
		return descricaoTipoLogradouro;
	}

	public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro)
	{
		this.descricaoTipoLogradouro = descricaoTipoLogradouro;
	}

	public String getDescricaoCidade()
	{
		return descricaoCidade;
	}

	public void setDescricaoCidade(String descricaoCidade)
	{
		this.descricaoCidade = descricaoCidade;
	}

	public long getIdUnidadeFederativa()
	{
		return idUnidadeFederativa;
	}

	public void setIdUnidadeFederativa(long idUnidadeFederativa)
	{
		this.idUnidadeFederativa = idUnidadeFederativa;
	}

	public String getSiglaUnidadeFederativa()
	{
		return siglaUnidadeFederativa;
	}

	public void setSiglaUnidadeFederativa(String siglaUnidadeFederativa)
	{
		this.siglaUnidadeFederativa = siglaUnidadeFederativa;
	}

	public long getIdPais()
	{
		return idPais;
	}

	public void setIdPais(long idPais)
	{
		this.idPais = idPais;
	}

	public String getSiglaPais()
	{
		return siglaPais;
	}

	public void setSiglaPais(String siglaPais)
	{
		this.siglaPais = siglaPais;
	}

	public String getDescricaoLocalidade()
	{
		return descricaoLocalidade;
	}

	public void setDescricaoLocalidade(String descricaoLocalidade)
	{
		this.descricaoLocalidade = descricaoLocalidade;
	}

}
