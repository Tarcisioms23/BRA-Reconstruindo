package com.mapfre.brasilseg.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CANCELA")
public class CancelarAssistencia implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String protocoloBrasilSeg;
	private String dtCancelamento;
    private String motivoCancelamento;
    private String pedidoCancelamento;
    private String origemCancelamento;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProtocoloBrasilSeg() {
		return protocoloBrasilSeg;
	}
	public void setProtocoloBrasilSeg(String protocoloBrasilSeg) {
		this.protocoloBrasilSeg = protocoloBrasilSeg;
	}
	public String getDtCancelamento() {
		return dtCancelamento;
	}
	public void setDtCancelamento(String dtCancelamento) {
		this.dtCancelamento = dtCancelamento;
	}
	public String getMotivoCancelamento() {
		return motivoCancelamento;
	}
	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}
	public String getPedidoCancelamento() {
		return pedidoCancelamento;
	}
	public void setPedidoCancelamento(String pedidoCancelamento) {
		this.pedidoCancelamento = pedidoCancelamento;
	}
	public String getOrigemCancelamento() {
		return origemCancelamento;
	}
	public void setOrigemCancelamento(String origemCancelamento) {
		this.origemCancelamento = origemCancelamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
