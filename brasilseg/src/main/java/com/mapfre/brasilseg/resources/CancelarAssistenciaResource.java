package com.mapfre.brasilseg.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapfre.brasilseg.models.AssistenciaFakeResponse;
import com.mapfre.brasilseg.models.CancelarAssistencia;

import com.mapfre.brasilseg.models.TResponseAutoServicoPutTeste;
import com.mapfre.brasilseg.repository.CancelaAssistenciaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping(value="/api/1.0")
@Api(value = "API REST CANCELAMENTO ASSISTENCIAS")
@CrossOrigin(origins = "*") //Liberar todos os dominios pode acessar a api http//:dominio
public class CancelarAssistenciaResource {
	
	@Autowired
	CancelaAssistenciaRepository cancelaAssistenciaRepository;
	
	@GetMapping("/cancelarAssistencias")
	@ApiOperation(value = "lista de Cancela Assistencia")
	public List<CancelarAssistencia> ListaCancelAssistencia(){
		return cancelaAssistenciaRepository.findAll();	
	}
	
	@GetMapping(value ="/cancelarAssistencia/{id}")
	@ApiOperation(value = "busca unico")
	public CancelarAssistencia BuscaIdCancelAssistencia(@PathVariable(value= "id")long id) {
		return cancelaAssistenciaRepository.findById(id);
	}
	
	@PostMapping("/cancelarAssistencia")
	@ApiOperation(value = "Metodo salva assistencia cancelada")
	public CancelarAssistencia SalvaCancelAssistencia (@RequestBody CancelarAssistencia cancelarAssistencia) {
		return cancelaAssistenciaRepository.save(cancelarAssistencia);
		
	}
	
	@PutMapping(value = "/cancelarAssistencia")
	@ApiOperation(value = "Metodo atualiza assistencia cancelada")
	public CancelarAssistencia alterarCancelAssistencia (@RequestBody CancelarAssistencia cancelarAssistencia) {
		return cancelaAssistenciaRepository.save(cancelarAssistencia);
		
	}
	
	@DeleteMapping(value = "/cancelarAssistencia")
	@ApiOperation(value = "Metodo deleta assistencia cancelada")
	public String deletaCancelAssistencia (@RequestBody CancelarAssistencia cancelarAssistencia) {
		 cancelaAssistenciaRepository.delete(cancelarAssistencia);
		 return "Deletado: " + cancelarAssistencia.getId();
	}
	
	
	
	
	@PostMapping("/cancelarAssistencia/{idService}")
	@ApiOperation(value = "Metodo Correto assistencia cancelada")
	public ResponseEntity<AssistenciaFakeResponse> PostBrasilSegCancelar (@RequestBody CancelarAssistencia cancelarAssistencia, @PathVariable String idService){
		cancelaAssistenciaRepository.save(cancelarAssistencia);
		AssistenciaFakeResponse response = new AssistenciaFakeResponse();
		
		response.setDados(cancelarAssistencia.getProtocoloBrasilSeg());
		response.setTimestamp(cancelarAssistencia.getDtCancelamento());
		//response.setNrStatus(cancelarAssistencia.getId());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
				}
	
	
	
	@PutMapping(value = "/cancelarAssistencia/{idService}")
	@ApiOperation(value = "Testando saida do Auto Servico assistencia cancelada")
	public ResponseEntity<TResponseAutoServicoPutTeste> PutBrasilSegCancelar (@RequestBody CancelarAssistencia cancelarAssistencia, @PathVariable String idService){
		cancelaAssistenciaRepository.save(cancelarAssistencia);
		TResponseAutoServicoPutTeste response = new TResponseAutoServicoPutTeste();
		response.setResponseCode(cancelarAssistencia.getId());
		response.setData(cancelarAssistencia);
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	
}
