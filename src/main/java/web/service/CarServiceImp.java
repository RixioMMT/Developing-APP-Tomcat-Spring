package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> countCars(int count) {
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
        if (count < 5) {
            return carList.subList(0, Math.min(count, carList.size()));
        }
        else {
            return carList;
        }
    }
}
