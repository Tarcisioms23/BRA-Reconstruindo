package com.mapfre.brasilseg.models;

public class TResponseAutoServicoPutTeste {

	TResponseAutoServicoTeste response = new TResponseAutoServicoTeste();
	private String total_items = "1";
	CancelarAssistencia data = new CancelarAssistencia();
	
	
	@SuppressWarnings("null")
	public void setResponseCode(Long Code) {	
		
	if (Code != null || Code != 0) {
		this.response.setCode((long) 0);
		this.response.setMessage("successful operation");
	}
		
	}
	
	public void setTotal_items(String total_items) {
		this.total_items = total_items;
	}
	
	public void setData(CancelarAssistencia data) {
		this.data = data;
	}
	
	
	public String getTotal_items() {
		return total_items;
	}
	
	public TResponseAutoServicoTeste getResponse() {
		return response;
	}

	public CancelarAssistencia getData() {
		return data;
	}

	

	
	
}
