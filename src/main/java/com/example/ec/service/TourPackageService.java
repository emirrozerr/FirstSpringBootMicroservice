package com.example.ec.service;

import org.springframework.stereotype.Service;

import com.example.ec.domain.TourPackage;
import com.example.ec.repo.ITourPackageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TourPackageService {
    private ITourPackageRepository tourPackageRepository;


    public TourPackage createTourPackage(String code, String name) {

        return tourPackageRepository.findByName(code)
        .orElse(tourPackageRepository.save(new TourPackage(code , name)));
    }

    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total(){ return tourPackageRepository.count();}



}
