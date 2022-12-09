package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    CarDAO carDAO;

    @Override
    public List<Car> printCars(int count) {
        return carDAO.printCars(count);
    }
}
