package io.tvang.demo.upload.web.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import io.tvang.demo.model.Car;
import io.tvang.demo.service.CarService;

@RestController
public class CarCtrl extends AbstractCtrl {
  // this allows your webform to do your CRUD operations

  @Autowired
  private CarService carService;

  @RequestMapping(path="/api/car", method = RequestMethod.POST)
  public String create(@RequestBody  Car car) {
    carService.create(car);
    return "{\"result\": \"good\"}";
  }

  @RequestMapping(path="/api/car", method = RequestMethod.GET)
  public List<Car> getAll() {
    return carService.getAll();
  }

  @RequestMapping(path="/api/car", method = RequestMethod.PUT)
  public String update(@RequestBody Car car) {
    carService.update(car);
    return "{\"result\": \"good\"}";
  }

  @RequestMapping(path="/api/car/{id}", method = RequestMethod.DELETE)
  public String delete(@PathVariable("id") Integer id) {
    carService.delete(id);
    return "{\"result\": \"good\"}";
  }
}
