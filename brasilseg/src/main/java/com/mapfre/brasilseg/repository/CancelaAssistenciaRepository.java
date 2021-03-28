package com.mapfre.brasilseg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapfre.brasilseg.models.CancelarAssistencia;

public interface CancelaAssistenciaRepository extends JpaRepository<CancelarAssistencia, Long> {

	
	CancelarAssistencia findById(long id);

}
