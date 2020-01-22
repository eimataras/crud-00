package lt.eimantas.crud.controller;

import lt.eimantas.crud.model.CarService;
import lt.eimantas.crud.model.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")


public class CarController {


    @Autowired
    CarService carService;

    @GetMapping("/all")
    public Iterable<CarDTO> getAllCars() {
        return carService.findAll();
    }

    @PostMapping("/add")
    public void addCar(@RequestBody CarDTO car) {
        carService.save(car);
    }

    @PutMapping("/update")
    public void editCar(@RequestBody CarDTO car) {
        carService.save(car);
    }

    @DeleteMapping("/delete")
    public void deleteCar(@RequestParam Integer id) {
        carService.deleteById(id);
    }
}