package br.com.lucas.xyinc.poi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.lucas.xyinc.poi.model.PointInterest;
import br.com.lucas.xyinc.poi.service.dto.PointInterestProximity;

@RepositoryRestResource(collectionResourceRel = "poi", path = "poi")
public interface PointInterestRepository  extends PagingAndSortingRepository<PointInterest, Long>, JpaSpecificationExecutor<PointInterest> {

	@Query(value = "SELECT poi FROM PointInterest poi "
			     + "WHERE SQRT((poi.posX - :#{#filter.posX})*(poi.posX - :#{#filter.posX}) + (poi.posY - :#{#filter.posY})*(poi.posY - :#{#filter.posY})) <= :#{#filter.raio}")
	Page<PointInterest> findByProximity(PointInterestProximity filter, Pageable pageable);
	
}