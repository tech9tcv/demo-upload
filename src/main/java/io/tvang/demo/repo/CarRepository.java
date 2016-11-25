package io.tvang.demo.repo;

import org.springframework.data.repository.CrudRepository;

import io.tvang.demo.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {
  // this should only have CRUD ops

}
