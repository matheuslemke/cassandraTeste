package TesteCassandra.TesteCassandra;

//import com.datastax.driver.core.DataType;

public class MainQuery {
	private int id_parceiro;  
	private String nome_parceiro;
	private int codigo_parceiro;
	private int ativo_parceiro;
	private int id_flagtipopessoa ;
	private int id_grupoempresarial ;
	private int id_local ;
	private int codigo_local ;
	private String descricao_local ;
	private String cnpj_local ;
	private int ativo_local ;
	private int numeromatricula_parceiroassociado ;
	private int associado_parceiroassociado ;
	private int id_informacaocomplementar ;
	private String  cpf_pessoafisica ;
	private int id_cidade;
	private String  descricao_cidade ;
	private int id_unidadefederativa ;
	private String  sigla_unidadefederativa ;
	private int id_pais ;
	private String sigla_pais ;
	//private DataType datainicio_enderecolocal;
	//private DataType datafim_enderecolocal;
	private int id_endereco;
	private String numero_endereco ;
	private int id_logradouro ;
	private int id_localidade ;
	private String descricao_logradouro ;
	private int id_tipologradouro ;
	private String descricao_tipologradouro;
	private String descricao_localidade ;
	public int getId_parceiro() {
		return id_parceiro;
	}
	public void setId_parceiro(int id_parceiro) {
		this.id_parceiro = id_parceiro;
	}
	public String getNome_parceiro() {
		return nome_parceiro;
	}
	public void setNome_parceiro(String nome_parceiro) {
		this.nome_parceiro = nome_parceiro;
	}
	public int getCodigo_parceiro() {
		return codigo_parceiro;
	}
	public void setCodigo_parceiro(int codigo_parceiro) {
		this.codigo_parceiro = codigo_parceiro;
	}
	public int getAtivo_parceiro() {
		return ativo_parceiro;
	}
	public void setAtivo_parceiro(int ativo_parceiro) {
		this.ativo_parceiro = ativo_parceiro;
	}
	public int getId_flagtipopessoa() {
		return id_flagtipopessoa;
	}
	public void setId_flagtipopessoa(int id_flagtipopessoa) {
		this.id_flagtipopessoa = id_flagtipopessoa;
	}
	public int getId_grupoempresarial() {
		return id_grupoempresarial;
	}
	public void setId_grupoempresarial(int id_grupoempresarial) {
		this.id_grupoempresarial = id_grupoempresarial;
	}
	public int getId_local() {
		return id_local;
	}
	public void setId_local(int id_local) {
		this.id_local = id_local;
	}
	public int getCodigo_local() {
		return codigo_local;
	}
	public void setCodigo_local(int codigo_local) {
		this.codigo_local = codigo_local;
	}
	public String getDescricao_local() {
		return descricao_local;
	}
	public void setDescricao_local(String descricao_local) {
		this.descricao_local = descricao_local;
	}
	public String getCnpj_local() {
		return cnpj_local;
	}
	public void setCnpj_local(String cnpj_local) {
		this.cnpj_local = cnpj_local;
	}
	public int getAtivo_local() {
		return ativo_local;
	}
	public void setAtivo_local(int ativo_local) {
		this.ativo_local = ativo_local;
	}
	public int getNumeromatricula_parceiroassociado() {
		return numeromatricula_parceiroassociado;
	}
	public void setNumeromatricula_parceiroassociado(int numeromatricula_parceiroassociado) {
		this.numeromatricula_parceiroassociado = numeromatricula_parceiroassociado;
	}
	public int getAssociado_parceiroassociado() {
		return associado_parceiroassociado;
	}
	public void setAssociado_parceiroassociado(int associado_parceiroassociado) {
		this.associado_parceiroassociado = associado_parceiroassociado;
	}
	public int getId_informacaocomplementar() {
		return id_informacaocomplementar;
	}
	public void setId_informacaocomplementar(int id_informacaocomplementar) {
		this.id_informacaocomplementar = id_informacaocomplementar;
	}
	public String getCpf_pessoafisica() {
		return cpf_pessoafisica;
	}
	public void setCpf_pessoafisica(String cpf_pessoafisica) {
		this.cpf_pessoafisica = cpf_pessoafisica;
	}
	public int getId_cidade() {
		return id_cidade;
	}
	public void setId_cidade(int id_cidade) {
		this.id_cidade = id_cidade;
	}
	public String getDescricao_cidade() {
		return descricao_cidade;
	}
	public void setDescricao_cidade(String descricao_cidade) {
		this.descricao_cidade = descricao_cidade;
	}
	public int getId_unidadefederativa() {
		return id_unidadefederativa;
	}
	public void setId_unidadefederativa(int id_unidadefederativa) {
		this.id_unidadefederativa = id_unidadefederativa;
	}
	public String getSigla_unidadefederativa() {
		return sigla_unidadefederativa;
	}
	public void setSigla_unidadefederativa(String sigla_unidadefederativa) {
		this.sigla_unidadefederativa = sigla_unidadefederativa;
	}
	public int getId_pais() {
		return id_pais;
	}
	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}
	public String getSigla_pais() {
		return sigla_pais;
	}
	public void setSigla_pais(String sigla_pais) {
		this.sigla_pais = sigla_pais;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public String getNumero_endereco() {
		return numero_endereco;
	}
	public void setNumero_endereco(String numero_endereco) {
		this.numero_endereco = numero_endereco;
	}
	public int getId_logradouro() {
		return id_logradouro;
	}
	public void setId_logradouro(int id_logradouro) {
		this.id_logradouro = id_logradouro;
	}
	public int getId_localidade() {
		return id_localidade;
	}
	public void setId_localidade(int id_localidade) {
		this.id_localidade = id_localidade;
	}
	public String getDescricao_logradouro() {
		return descricao_logradouro;
	}
	public void setDescricao_logradouro(String descricao_logradouro) {
		this.descricao_logradouro = descricao_logradouro;
	}
	public int getId_tipologradouro() {
		return id_tipologradouro;
	}
	public void setId_tipologradouro(int id_tipologradouro) {
		this.id_tipologradouro = id_tipologradouro;
	}
	public String getDescricao_tipologradouro() {
		return descricao_tipologradouro;
	}
	public void setDescricao_tipologradouro(String descricao_tipologradouro) {
		this.descricao_tipologradouro = descricao_tipologradouro;
	}
	public String getDescricao_localidade() {
		return descricao_localidade;
	}
	public void setDescricao_localidade(String descricao_localidade) {
		this.descricao_localidade = descricao_localidade;
	}
		
}
