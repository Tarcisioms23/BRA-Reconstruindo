package com.mapfre.brasilseg.models;

public class AssistenciaFakeResponse {
	
	
	ResponseDados dados = new ResponseDados();
	
	public ResponseDados getDados() {
		return dados;
	}

	private String nmSiglaProjeto;

	private Long nrStatus = (long) 0;
	//private Long nrStatus;
	
	private String timestamp;
	
	private String txMensagem ;
	
	
	public void setDados(String protocoloBrasilSeg) {	
		String statuSolicitação;	
		if(protocoloBrasilSeg != null) {
			statuSolicitação = "RECEBIDO";
		}else {
			statuSolicitação = "NAO RECEBIDO";
		}
		this.dados.setStatuSolicitação(statuSolicitação);
		this.dados.setProtocoloBrasilSeg(protocoloBrasilSeg);
	}
	
	
	
	
	
	public String getNmSiglaProjeto() {
		return nmSiglaProjeto;
	}

	public void setNmSiglaProjeto(String nmSiglaProjeto) {
		this.nmSiglaProjeto = nmSiglaProjeto;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTxMensagem() {
		return txMensagem;
	}

	public void setTxMensagem(String txMensagem) {
		this.txMensagem = txMensagem;
	}

	public Long getNrStatus() {
		return nrStatus;
	}

	public void setNrStatus(Long nrStatus) {
		this.nrStatus = nrStatus;
	}

	
			
	
}
