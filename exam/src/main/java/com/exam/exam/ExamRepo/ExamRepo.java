package com.exam.exam.ExamRepo;
import com.exam.exam.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface  ExamRepo extends CrudRepository<Car, Long> {

}
