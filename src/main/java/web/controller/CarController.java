package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> carList = new ArrayList<>();
        Car lamborghini = new Car("Lamborghini", 2017, "Red");
        Car hummer = new Car("Hummer", 2008, "White");
        Car nissan = new Car("Nissan", 2014, "Blue");
        Car porsche = new Car("Porsche", 2024, "Black");
        Car cadillac = new Car("Cadillac", 2016, "Grey");
        carList.add(lamborghini);
        carList.add(hummer);
        carList.add(nissan);
        carList.add(porsche);
        carList.add(cadillac);
        List<Car> carCount = carService.countCars(carList, count);
        model.addAttribute("carCount", carCount);
        return "cars";
    }

}
