package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private static int count;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++count, "LADA", "Russia"));
        cars.add(new Car(++count, "OPEL", "Germany"));
        cars.add(new Car(++count, "RENAULT", "France"));
        cars.add(new Car(++count, "LEXUS", "Japan"));
        cars.add(new Car(++count, "DODGE", "USA"));

    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getNumbersCar(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}


