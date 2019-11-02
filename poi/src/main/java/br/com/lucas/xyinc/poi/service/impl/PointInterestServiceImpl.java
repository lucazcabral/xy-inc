package br.com.lucas.xyinc.poi.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.lucas.xyinc.poi.exceptions.PointInterestServiceException;
import br.com.lucas.xyinc.poi.model.PointInterest;
import br.com.lucas.xyinc.poi.repository.PointInterestRepository;
import br.com.lucas.xyinc.poi.service.PointInterestService;
import br.com.lucas.xyinc.poi.service.dto.PointInterestProximity;

@Service
@Transactional
public class PointInterestServiceImpl implements PointInterestService {
	
	@Autowired
	PointInterestRepository pointInterestRepository;

	@Override
	public void insertPOI(PointInterest poi) throws PointInterestServiceException {
		pointInterestRepository.save(poi);
	}

	@Override
	public Page<PointInterest> findAll(Pageable pageable) throws PointInterestServiceException {
		Page<PointInterest> listPOI = pointInterestRepository.findAll(pageable);
		return listPOI;
	}

	@Override
	public Page<PointInterest> findByProximity(PointInterestProximity filter, Pageable pageable)
			throws PointInterestServiceException {
		Page<PointInterest> listPOI = pointInterestRepository.findByProximity(filter, pageable);
		return listPOI;
	}
}
