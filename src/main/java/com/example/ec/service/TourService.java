package com.example.ec.service;

import org.springframework.stereotype.Service;

import com.example.ec.repo.ITourPackageRepository;
import com.example.ec.repo.ITourRepository;
import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import com.example.ec.domain.Difficulty;
import com.example.ec.domain.Region;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TourService {
    private ITourRepository tourRepoistory;
    private ITourPackageRepository tourPackageRepository;

    public Tour createTour(String title , String description , String blurb , Integer price , String duration , String bullets,String keyword, String tourPackageName , Difficulty difficulty , Region region){

        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName)
        .orElseThrow(() -> new RuntimeException("Tour Package does not exist " + tourPackageName));

        return tourRepoistory.save(new Tour(title, description, blurb, price, duration, bullets, keyword, tourPackage, region, difficulty));
        
    }

    public long total(){return tourRepoistory.count();}
    
    
}
