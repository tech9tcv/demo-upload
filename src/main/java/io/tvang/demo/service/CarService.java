package io.tvang.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import io.tvang.demo.model.Car;
import io.tvang.demo.repo.CarRepository;

@Service
public class CarService {
  // this has all business logics and validations

  @Autowired
  private CarRepository carRepository;

  public void create(Car car) {
    carRepository.save(car);
  }

  public Car read(Integer id) {
    return carRepository.findOne(id);
  }

  public List<Car> getAll() {
//    List<Car> cars = new ArrayList<>();
//    Iterable<Car> iterable = carRepository.findAll();
//    Iterator<Car> it = iterable.iterator();
//    while (it.hasNext()) {
//      Car car = it.next();
//      cars.add(car);
//    }
//    return cars;
    return StreamSupport.stream(carRepository.findAll().spliterator(), false)
        .collect(Collectors.toList());
  }

  public void update(Car car) {
    carRepository.save(car);
  }

  public void delete(Integer id) {
    carRepository.delete(id);
  }

}
