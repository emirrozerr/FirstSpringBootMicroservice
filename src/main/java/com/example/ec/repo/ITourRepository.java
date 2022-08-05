package com.example.ec.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.ec.domain.Tour;


public interface ITourRepository extends PagingAndSortingRepository<Tour,Integer> {
    Page<Tour> findByTourPackageCode(@Param("code" )String code,Pageable pageable);
}
