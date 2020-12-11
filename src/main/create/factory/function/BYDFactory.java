package main.create.factory.function;

import main.create.factory.BYDCar;
import main.create.factory.Car;

/**
 * @program: flyDesign
 * @description: 比亚迪工厂
 * @author: liuyang
 * @create: 2020-12-10 11:06
 **/
public class BYDFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new BYDCar();
    }
}
