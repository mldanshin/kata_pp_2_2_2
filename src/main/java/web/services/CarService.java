package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();

        cars.add(new Car("BMW", "2000", "Red"));
        cars.add(new Car("Ford", "2010", "Green"));
        cars.add(new Car("GAZ", "1990", "Red"));
        cars.add(new Car("UAZ", "2020", "Black"));
        cars.add(new Car("BMW", "2015", "Black"));
    }

    public List<Car> getList(int count) {
        if (count > 5) {
            count = 5;
        }

        return cars.subList(0, count);
    }

    public List<Car> getList() {
        return cars;
    }

    public int count() {
        return cars.size();
    }
}
