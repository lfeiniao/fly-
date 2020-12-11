package main.create.factory.function;

import main.create.factory.Benz;
import main.create.factory.Car;

/**
 * @program: flyDesign
 * @description: 奔驰工厂
 * @author: liuyang
 * @create: 2020-12-10 11:05
 **/
public class BenzFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
