package com.exam.exam.entity;
import lombok. Getter;
import lombok. Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private String manufacturer;
    @Setter
    @Getter
    private Integer year;
    @Setter
    @Getter
    private String model;
    @Setter
    @Getter
    private String color;
    @Setter
    @Getter
    private String body;
    @Setter
    @Getter
    private String fuel;

    public Car(Long id, String name, String breed,String origin)
    {
        this.manufacturer = manufacturer;
        this.year = year;
        this.model = model;
        this.color = color;
        this.body = body;
        this.fuel = fuel;
    }

    public Car()
    {}

}
