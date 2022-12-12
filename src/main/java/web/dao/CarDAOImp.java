package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImp implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Car1", 1, "V1"));
        cars.add(new Car("Car2", 2, "V2"));
        cars.add(new Car("Car3", 3, "V3"));
        cars.add(new Car("Car4", 4, "V4"));
        cars.add(new Car("Car5", 5, "V5"));
    }

    @Override
    public List<Car> printCars(int count) {
        List<Car> list = new ArrayList<>();
        if (count <= 5) {
            for (int i = 0; i < count; i++) {
                list.add(cars.get(i));
            }
            return list;
        }
        return cars;
    }
}
