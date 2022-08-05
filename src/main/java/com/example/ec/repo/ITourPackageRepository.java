package com.example.ec.repo;





import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;

import com.example.ec.domain.TourPackage;

//@RepositoryRestResource(collectionResourceRel = "packages" , path = "packages")
public interface ITourPackageRepository extends CrudRepository<TourPackage , String>{
    Optional<TourPackage> findByName(String name);

}
