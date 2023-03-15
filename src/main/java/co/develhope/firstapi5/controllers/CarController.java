package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarDTO car;
    public List<CarDTO> listCars= new ArrayList<>();



     @GetMapping (value = "/list_cars")
       public String getCar(){
           return listCars.toString();
       }


    @PostMapping (value = "/create_car")
    public void newCar(@RequestParam(value = "id", required = true) String id,
                       @RequestParam(value = "model", required = true) String model,
                       @RequestParam(value = "price", required = false) double price){
         CarDTO car= new CarDTO(id, model, price);
         listCars.add(car);
    }






}
