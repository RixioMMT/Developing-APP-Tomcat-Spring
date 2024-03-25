package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> countCars(List<Car> carList, int count) throws ArrayIndexOutOfBoundsException {
        if (count <= 0 || carList == null) {
            throw new ArrayIndexOutOfBoundsException("Incorrect count or list size");
        }
        else if (count < 5) {
            return carList.subList(0, Math.min(count, carList.size()));
        }
        else {
            return carList;
        }
    }
}
