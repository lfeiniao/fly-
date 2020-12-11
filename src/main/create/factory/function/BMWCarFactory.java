package main.create.factory.function;

import main.create.factory.BMWCar;
import main.create.factory.Car;

/**
 * @program: flyDesign
 * @description: 宝马工厂
 * @author: liuyang
 * @create: 2020-12-10 11:04
 **/
public class BMWCarFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new BMWCar();
    }
}
