package br.com.lucas.xyinc.poi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.lucas.xyinc.poi.exceptions.PointInterestServiceException;
import br.com.lucas.xyinc.poi.model.PointInterest;
import br.com.lucas.xyinc.poi.service.dto.PointInterestProximity;

public interface PointInterestService {
	// Serviço para inserção de ponto de interesse
	void insertPOI(PointInterest poi) throws PointInterestServiceException;

	// Serviço paginado para listar todos os pontos de interesse
	Page<PointInterest> findAll(Pageable pageable) throws PointInterestServiceException;

	// Serviço paginado para listar os pontos de interesse por filtro de proximidade
	Page<PointInterest> findByProximity(PointInterestProximity filter, Pageable pageable) throws PointInterestServiceException;
}
