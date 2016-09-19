package model;

import java.time.LocalDate;

public class ParceiroAssociado
{
	private long idParceiroAssociado;
	private long associado;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private LocalDate dataPedidoDemissao;
	private long idEmpresa;
	private long idMotivoDesligamento;
	private long idParceiro;
	private long idTipoDemissao;
	private long numeroCotas;
	private long numeroMatricula;

	public long getIdParceiroAssociado()
	{
		return idParceiroAssociado;
	}

	public void setIdParceiroAssociado(long idParceiroAssociado)
	{
		this.idParceiroAssociado = idParceiroAssociado;
	}

	public long getAssociado()
	{
		return associado;
	}

	public void setAssociado(long associado)
	{
		this.associado = associado;
	}

	public LocalDate getDataAdmissao()
	{
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao)
	{
		this.dataAdmissao = dataAdmissao;
	}

	public LocalDate getDataDemissao()
	{
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao)
	{
		this.dataDemissao = dataDemissao;
	}

	public LocalDate getDataPedidoDemissao()
	{
		return dataPedidoDemissao;
	}

	public void setDataPedidoDemissao(LocalDate dataPedidoDemissao)
	{
		this.dataPedidoDemissao = dataPedidoDemissao;
	}

	public long getIdEmpresa()
	{
		return idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa)
	{
		this.idEmpresa = idEmpresa;
	}

	public long getIdMotivoDesligamento()
	{
		return idMotivoDesligamento;
	}

	public void setIdMotivoDesligamento(long idMotivoDesligamento)
	{
		this.idMotivoDesligamento = idMotivoDesligamento;
	}

	public long getIdParceiro()
	{
		return idParceiro;
	}

	public void setIdParceiro(long idParceiro)
	{
		this.idParceiro = idParceiro;
	}

	public long getIdTipoDemissao()
	{
		return idTipoDemissao;
	}

	public void setIdTipoDemissao(long idTipoDemissao)
	{
		this.idTipoDemissao = idTipoDemissao;
	}

	public long getNumeroCotas()
	{
		return numeroCotas;
	}

	public void setNumeroCotas(long numeroCotas)
	{
		this.numeroCotas = numeroCotas;
	}

	public long getNumeroMatricula()
	{
		return numeroMatricula;
	}

	public void setNumeroMatricula(long numeroMatricula)
	{
		this.numeroMatricula = numeroMatricula;
	}

}