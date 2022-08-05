package com.example.ec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;


@Data
@Entity
public class Tour {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="description",length = 2000)
    private String description;

    @Column(name="blurb",length = 2000)
    private String blurb;

    @Column(name="price")
    private Integer price;

    @Column(name="duration")
    private String duration;

    @Column(name="bullets",length = 2000)
    private String bullets;

    @Column(name="keyword")
    private String keyword;

    @ManyToOne
    private TourPackage tourPackage;

    @Column(name="region")
    @Enumerated
    private Region region;

    @Column(name="difficulty")
    @Enumerated
    private Difficulty difficulty;

    public Tour(String title, String description, String blurb, Integer price, String duration, String bullets,
            String keyword, TourPackage tourPackage, Region region, Difficulty difficulty) {
        this.title = title;
        this.description = description;
        this.blurb = blurb;
        this.price = price;
        this.duration = duration;
        this.bullets = bullets;
        this.keyword = keyword;
        this.tourPackage = tourPackage;
        this.region = region;
        this.difficulty = difficulty;
    }

    public Tour() {
    }

    
    
    


}
