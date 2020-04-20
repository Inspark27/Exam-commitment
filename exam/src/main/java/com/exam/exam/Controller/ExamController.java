package com.exam.exam.Controller;
import com.exam.exam.ExamRepo.ExamRepo;
import com.exam.exam.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ExamController {

    @Autowired
    ExamRepo examRepo;

    @RequestMapping("/exam")
    public ResponseEntity<List<Car>>
    getAllDogs(){
        System.out.println("DATABASE LOADED");
        List<Car> list = (List<Car>)examRepo.findAll();

        return new ResponseEntity<List<Car>>(list, HttpStatus.OK);
    }

}

