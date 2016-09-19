package model;

//import com.datastax.driver.core.DataType;

public class MainQuery
{
	private long idLocal = 0;
	private long idEndereco = 0;
	private long codigoLocal = 0;
	private String descricaoLocal;
	private String cnpjLocal;
	private long idParceiro = 0;
	private String nomeParceiro;
	private long codigoParceiro = 0;
	private long idFlagTipoPessoa = 0;
	private long idGrupoEmpresarial = 0;
	private long numeroMatriculaParceiroAssociado = 0;
	private long idInfoComplementar = 0;
	private String cpfPessoaFisica;
	private String numeroEndereco;
	private long idLogradouro = 0;
	private long idLocalidade = 0;
	private String descricaoLogradouro;
	private long idTipoLogradouro = 0;
	private long idCidade = 0;
	private String descricaoTipoLogradouro;
	private String descricaoCidade;
	private long idUnidadeFederativa = 0;
	private String siglaUnidadeFederativa;
	private long idPais = 0;
	private String siglaPais;
	private String descricaoLocalidade;

	public long getIdLocal()
	{
		return (long) idLocal;
	}

	public long getIdEndereco()
	{
		return (long) idEndereco;
	}

	public long getCodigoLocal()
	{
		return (long) codigoLocal;
	}

	public String getDescricaoLocal()
	{
		if (descricaoLocal == null)
			return "null";
		return "'" + descricaoLocal + "'";
	}

	public String getCnpjLocal()
	{
		if (cnpjLocal == null)
			return "null";
		return "'" + cnpjLocal + "'";
	}

	public long getIdParceiro()
	{
		return (long) idParceiro;
	}

	public String getNomeParceiro()
	{
		if (nomeParceiro == null)
			return "null";
		return "'" + nomeParceiro + "'";
	}

	public long getCodigoParceiro()
	{
		return (long) codigoParceiro;
	}

	public long getIdFlagTipoPessoa()
	{
		return (long) idFlagTipoPessoa;
	}

	public long getIdGrupoEmpresarial()
	{
		return (long) idGrupoEmpresarial;
	}

	public long getNumeroMatriculaParceiroAssociado()
	{
		return (long) numeroMatriculaParceiroAssociado;
	}

	public long getIdInfoComplementar()
	{
		return (long) idInfoComplementar;
	}

	public String getCpfPessoaFisica()
	{
		if (cpfPessoaFisica == null)
			return "null";
		return "'" + cpfPessoaFisica + "'";
	}

	public String getNumeroEndereco()
	{
		if (numeroEndereco == null)
			return "null";
		return "'" + numeroEndereco + "'";
	}

	public long getIdLogradouro()
	{
		return (long) idLogradouro;
	}

	public long getIdLocalidade()
	{
		return (long) idLocalidade;
	}

	public String getDescricaoLogradouro()
	{
		if (descricaoLogradouro == null)
			return "null";
		return "'" + descricaoLogradouro + "'";
	}

	public long getIdTipoLogradouro()
	{
		return (long) idTipoLogradouro;
	}

	public long getIdCidade()
	{
		return (long) idCidade;
	}

	public String getDescricaoTipoLogradouro()
	{
		if (descricaoTipoLogradouro == null)
			return "null";
		return "'" + descricaoTipoLogradouro + "'";
	}

	public String getDescricaoCidade()
	{
		if (descricaoCidade == null)
			return "null";
		return "'" + descricaoCidade + "'";
	}

	public long getIdUnidadeFederativa()
	{
		return (long) idUnidadeFederativa;
	}

	public String getSiglaUnidadeFederativa()
	{
		if (siglaUnidadeFederativa == null)
			return "null";
		return "'" + siglaUnidadeFederativa + "'";
	}

	public long getIdPais()
	{
		return (long) idPais;
	}

	public String getSiglaPais()
	{
		if (siglaPais == null)
			return "null";
		return "'" + siglaPais + "'";
	}

	public String getDescricaoLocalidade()
	{
		if (descricaoLocalidade == null)
			return "null";
		return "'" + descricaoLocalidade + "'";
	}

	public void setIdLocal(long idLocal)
	{
		this.idLocal = idLocal;
	}

	public void setIdEndereco(long idEndereco)
	{
		this.idEndereco = idEndereco;
	}

	public void setCodigoLocal(long codigoLocal)
	{
		this.codigoLocal = codigoLocal;
	}

	public void setDescricaoLocal(String descricaoLocal)
	{
		this.descricaoLocal = descricaoLocal;
	}

	public void setCnpjLocal(String cnpjLocal)
	{
		this.cnpjLocal = cnpjLocal;
	}

	public void setIdParceiro(long idParceiro)
	{
		this.idParceiro = idParceiro;
	}

	public void setNomeParceiro(String nomeParceiro)
	{
		this.nomeParceiro = nomeParceiro;
	}

	public void setCodigoParceiro(long codigoParceiro)
	{
		this.codigoParceiro = codigoParceiro;
	}

	public void setIdFlagTipoPessoa(long idFlagTipoPessoa)
	{
		this.idFlagTipoPessoa = idFlagTipoPessoa;
	}

	public void setIdGrupoEmpresarial(long idGrupoEmpresarial)
	{
		this.idGrupoEmpresarial = idGrupoEmpresarial;
	}

	public void setNumeroMatriculaParceiroAssociado(long numeroMatriculaParceiroAssociado)
	{
		this.numeroMatriculaParceiroAssociado = numeroMatriculaParceiroAssociado;
	}

	public void setIdInfoComplementar(long idInfoComplementar)
	{
		this.idInfoComplementar = idInfoComplementar;
	}

	public void setCpfPessoaFisica(String cpfPessoaFisica)
	{
		this.cpfPessoaFisica = cpfPessoaFisica;
	}

	public void setNumeroEndereco(String numeroEndereco)
	{
		this.numeroEndereco = numeroEndereco;
	}

	public void setIdLogradouro(long idLogradouro)
	{
		this.idLogradouro = idLogradouro;
	}

	public void setIdLocalidade(long idLocalidade)
	{
		this.idLocalidade = idLocalidade;
	}

	public void setDescricaoLogradouro(String descricaoLogradouro)
	{
		this.descricaoLogradouro = descricaoLogradouro;
	}

	public void setIdTipoLogradouro(long idTipoLogradouro)
	{
		this.idTipoLogradouro = idTipoLogradouro;
	}

	public void setIdCidade(long idCidade)
	{
		this.idCidade = idCidade;
	}

	public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro)
	{
		this.descricaoTipoLogradouro = descricaoTipoLogradouro;
	}

	public void setDescricaoCidade(String descricaoCidade)
	{
		this.descricaoCidade = descricaoCidade;
	}

	public void setIdUnidadeFederativa(long idUnidadeFederativa)
	{
		this.idUnidadeFederativa = idUnidadeFederativa;
	}

	public void setSiglaUnidadeFederativa(String siglaUnidadeFederativa)
	{
		this.siglaUnidadeFederativa = siglaUnidadeFederativa;
	}

	public void setIdPais(long idPais)
	{
		this.idPais = idPais;
	}

	public void setSiglaPais(String siglaPais)
	{
		this.siglaPais = siglaPais;
	}

	public void setDescricaoLocalidade(String descricaoLocalidade)
	{
		this.descricaoLocalidade = descricaoLocalidade;
	}

}
