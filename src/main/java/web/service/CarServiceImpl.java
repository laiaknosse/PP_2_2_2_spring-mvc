package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("asd", 1996, "asd"));
        carList.add(new Car("sad", 1992, "sad"));
        carList.add(new Car("dsa", 1991, "dsa"));
        carList.add(new Car("das", 1988, "das"));
        carList.add(new Car("sda", 2001, "sda"));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count <= 0 || count > carList.size())
            return carList;
        return carList.stream().limit(count).toList();
    }
}
