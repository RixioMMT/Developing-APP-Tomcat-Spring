package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> countCars(List<Car> carList, int count);
}
