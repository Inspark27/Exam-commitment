package com.exam.exam.Controller;
import com.exam.exam.entity.Car;
import com.exam.exam.ExamRepo.ExamRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class Repos {

    @Autowired
    private ExamRepo CarRepo;

    private Car car;
    Car saveCar = CarRepo.save(car);
   
}

