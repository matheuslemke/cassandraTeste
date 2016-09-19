package model;

import java.time.LocalDate;

public class Local
{
	private long idLocal;
	private long ativo;
	private String celular;
	private String cnpj;
	private long codigo;
	private long codigoAgenteReguladoInformante;
	private long codigoAtividadeEconomicaANP;
	private long codigoInstalacaoANP;
	private String contato;
	private LocalDate dataCadastro;
	private LocalDate dataDeRegistroNaJuntaComercial;
	private LocalDate dataDeRegistroNaSefaz;
	private LocalDate dataUltimaAtualizacao;
	private String descricao;
	private String email;
	private String emailEnvioNFE;
	private long escritaContabilRegular;
	private String fax;
	private long idFilial;
	private long idFilialAcerto;
	private long idLocalCobranca;
	private long idParceiro;
	private long idPontoGeografico;
	private String inscricaoEstadual;
	private String inscricaoEstadualSt;
	private String inscricaoMunicipal;
	private String inscricaoProdutorRural;
	private String inscricaoRSP;
	private String inscricaoSuframa;
	private long localProdutorRural;
	private String numeroDAP;
	private long numeroEmpregado;
	private long numeroRegistroJuntaComercial;
	private String numeroRenasem;
	private String pessoaContato;
	private String ramalContato;
	private String razaoSocial;
	private long somenteCobranca;
	private String telefone;
	private LocalDate validadeInscricaoEstadual;

	public long getIdLocal()
	{
		return idLocal;
	}

	public void setIdLocal(long idLocal)
	{
		this.idLocal = idLocal;
	}

	public long getAtivo()
	{
		return ativo;
	}

	public void setAtivo(long ativo)
	{
		this.ativo = ativo;
	}

	public String getCelular()
	{
		return celular;
	}

	public void setCelular(String celular)
	{
		this.celular = celular;
	}

	public String getCnpj()
	{
		return cnpj;
	}

	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}

	public long getCodigo()
	{
		return codigo;
	}

	public void setCodigo(long codigo)
	{
		this.codigo = codigo;
	}

	public long getCodigoAgenteReguladoInformante()
	{
		return codigoAgenteReguladoInformante;
	}

	public void setCodigoAgenteReguladoInformante(long codigoAgenteReguladoInformante)
	{
		this.codigoAgenteReguladoInformante = codigoAgenteReguladoInformante;
	}

	public long getCodigoAtividadeEconomicaANP()
	{
		return codigoAtividadeEconomicaANP;
	}

	public void setCodigoAtividadeEconomicaANP(long codigoAtividadeEconomicaANP)
	{
		this.codigoAtividadeEconomicaANP = codigoAtividadeEconomicaANP;
	}

	public long getCodigoInstalacaoANP()
	{
		return codigoInstalacaoANP;
	}

	public void setCodigoInstalacaoANP(long codigoInstalacaoANP)
	{
		this.codigoInstalacaoANP = codigoInstalacaoANP;
	}

	public String getContato()
	{
		return contato;
	}

	public void setContato(String contato)
	{
		this.contato = contato;
	}

	public LocalDate getDataCadastro()
	{
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro)
	{
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataDeRegistroNaJuntaComercial()
	{
		return dataDeRegistroNaJuntaComercial;
	}

	public void setDataDeRegistroNaJuntaComercial(LocalDate dataDeRegistroNaJuntaComercial)
	{
		this.dataDeRegistroNaJuntaComercial = dataDeRegistroNaJuntaComercial;
	}

	public LocalDate getDataDeRegistroNaSefaz()
	{
		return dataDeRegistroNaSefaz;
	}

	public void setDataDeRegistroNaSefaz(LocalDate dataDeRegistroNaSefaz)
	{
		this.dataDeRegistroNaSefaz = dataDeRegistroNaSefaz;
	}

	public LocalDate getDataUltimaAtualizacao()
	{
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao)
	{
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmailEnvioNFE()
	{
		return emailEnvioNFE;
	}

	public void setEmailEnvioNFE(String emailEnvioNFE)
	{
		this.emailEnvioNFE = emailEnvioNFE;
	}

	public long getEscritaContabilRegular()
	{
		return escritaContabilRegular;
	}

	public void setEscritaContabilRegular(long escritaContabilRegular)
	{
		this.escritaContabilRegular = escritaContabilRegular;
	}

	public String getFax()
	{
		return fax;
	}

	public void setFax(String fax)
	{
		this.fax = fax;
	}

	public long getIdFilial()
	{
		return idFilial;
	}

	public void setIdFilial(long idFilial)
	{
		this.idFilial = idFilial;
	}

	public long getIdFilialAcerto()
	{
		return idFilialAcerto;
	}

	public void setIdFilialAcerto(long idFilialAcerto)
	{
		this.idFilialAcerto = idFilialAcerto;
	}

	public long getIdLocalCobranca()
	{
		return idLocalCobranca;
	}

	public void setIdLocalCobranca(long idLocalCobranca)
	{
		this.idLocalCobranca = idLocalCobranca;
	}

	public long getIdParceiro()
	{
		return idParceiro;
	}

	public void setIdParceiro(long idParceiro)
	{
		this.idParceiro = idParceiro;
	}

	public long getIdPontoGeografico()
	{
		return idPontoGeografico;
	}

	public void setIdPontoGeografico(long idPontoGeografico)
	{
		this.idPontoGeografico = idPontoGeografico;
	}

	public String getInscricaoEstadual()
	{
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual)
	{
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoEstadualSt()
	{
		return inscricaoEstadualSt;
	}

	public void setInscricaoEstadualSt(String inscricaoEstadualSt)
	{
		this.inscricaoEstadualSt = inscricaoEstadualSt;
	}

	public String getInscricaoMunicipal()
	{
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal)
	{
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getInscricaoProdutorRural()
	{
		return inscricaoProdutorRural;
	}

	public void setInscricaoProdutorRural(String inscricaoProdutorRural)
	{
		this.inscricaoProdutorRural = inscricaoProdutorRural;
	}

	public String getInscricaoRSP()
	{
		return inscricaoRSP;
	}

	public void setInscricaoRSP(String inscricaoRSP)
	{
		this.inscricaoRSP = inscricaoRSP;
	}

	public String getInscricaoSuframa()
	{
		return inscricaoSuframa;
	}

	public void setInscricaoSuframa(String inscricaoSuframa)
	{
		this.inscricaoSuframa = inscricaoSuframa;
	}

	public long getLocalProdutorRural()
	{
		return localProdutorRural;
	}

	public void setLocalProdutorRural(long localProdutorRural)
	{
		this.localProdutorRural = localProdutorRural;
	}

	public String getNumeroDAP()
	{
		return numeroDAP;
	}

	public void setNumeroDAP(String numeroDAP)
	{
		this.numeroDAP = numeroDAP;
	}

	public long getNumeroEmpregado()
	{
		return numeroEmpregado;
	}

	public void setNumeroEmpregado(long numeroEmpregado)
	{
		this.numeroEmpregado = numeroEmpregado;
	}

	public long getNumeroRegistroJuntaComercial()
	{
		return numeroRegistroJuntaComercial;
	}

	public void setNumeroRegistroJuntaComercial(long numeroRegistroJuntaComercial)
	{
		this.numeroRegistroJuntaComercial = numeroRegistroJuntaComercial;
	}

	public String getNumeroRenasem()
	{
		return numeroRenasem;
	}

	public void setNumeroRenasem(String numeroRenasem)
	{
		this.numeroRenasem = numeroRenasem;
	}

	public String getPessoaContato()
	{
		return pessoaContato;
	}

	public void setPessoaContato(String pessoaContato)
	{
		this.pessoaContato = pessoaContato;
	}

	public String getRamalContato()
	{
		return ramalContato;
	}

	public void setRamalContato(String ramalContato)
	{
		this.ramalContato = ramalContato;
	}

	public String getRazaoSocial()
	{
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial)
	{
		this.razaoSocial = razaoSocial;
	}

	public long getSomenteCobranca()
	{
		return somenteCobranca;
	}

	public void setSomenteCobranca(long somenteCobranca)
	{
		this.somenteCobranca = somenteCobranca;
	}

	public String getTelefone()
	{
		return telefone;
	}

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}

	public LocalDate getValidadeInscricaoEstadual()
	{
		return validadeInscricaoEstadual;
	}

	public void setValidadeInscricaoEstadual(LocalDate validadeInscricaoEstadual)
	{
		this.validadeInscricaoEstadual = validadeInscricaoEstadual;
	}

}
