package br.com.lucas.xyinc.poi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucas.xyinc.poi.exceptions.PointInterestServiceException;
import br.com.lucas.xyinc.poi.model.PointInterest;
import br.com.lucas.xyinc.poi.service.PointInterestService;
import br.com.lucas.xyinc.poi.service.dto.PointInterestProximity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/services/poi")
@Api(value = "Barramento de serviços para Pontos de Interesse (POI)")
@Slf4j
public class PointInterestController {
	
	@Autowired
	private PointInterestService pointInterestService;
	
	/**
	 * Endpoint para registro de POI
	 * 
	 * Registra o POI e retorna status 204 (Serviço executado com sucesso e sem retorno de dados)
	 */
	@ApiOperation(value = "Registrar novo POI")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void saveParameterIndication(@RequestBody PointInterest newPOI) throws PointInterestServiceException {
		log.info("Registrando novo POI: "+newPOI.toString());
		pointInterestService.insertPOI(newPOI);
	}
	
	/**
	 * Endpoint para listagem paginada de POI
	 * 
	 * Lista todos os POI cadastrados e retorna estrutura paginada
	 * @param pageable 
	 * @return 
	 */
	@ApiOperation(value = "Lista todos os POI cadastrados")
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public Page<PointInterest> listAll(Pageable pageable) throws PointInterestServiceException {
		return pointInterestService.findAll(pageable);
	}
	
	/**
	 * Endpoint para listagem paginada de POI por proximidade
	 * 
	 * Lista todos os POI cadastrados com proximidade ao filtro informado e retorna estrutura paginada
	 * @param filter 
	 * @param pageable
	 * @return 
	 */
	@ApiOperation(value = "Lista todos os POI cadastrados")
	@RequestMapping(value = "/listByProximity", method = RequestMethod.GET)
	public Page<PointInterest> listByProximity(PointInterestProximity filter, Pageable pageable) throws PointInterestServiceException {
		return pointInterestService.findByProximity(filter, pageable);
	}
}
