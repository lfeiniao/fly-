package main.create.factory.abs;

import main.create.factory.BYDCar;
import main.create.factory.Car;

/**
 * @program: flyDesign
 * @description: BYD公司
 * BYD公司除了生产汽车还生产冰箱空调
 * 抽象工厂，就是在工厂方法的基础上，让一个工厂生产多种产品
 *
 * @author: liuyang
 * @create: 2020-12-10 11:35
 **/
public class BYDCompany implements ICompanyFactory {
    @Override
    public Car crateCar() {
        return new BYDCar();
    }

    @Override
    public Icebox createIcebox() {
        return new BYDIcebox();
    }
}
