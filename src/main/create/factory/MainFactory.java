package main.create.factory;

import main.create.factory.abs.CompanyFactory;
import main.create.factory.abs.ICompanyFactory;
import main.create.factory.function.CarFactory;

/**
 * @program: flyDesign
 * @description: 工厂模式
 * @author: liuyang
 * @create: 2020-12-10 11:07
 **/
public class MainFactory {
    public static void main(String[] args) {
        //简单工厂，if
        Car bmw = SimpleFactory.createCar("BMW");
        bmw.sayHello();

        //简单工厂，map容器
        Car byd = SimpleFactory2.createCar("BYD");
        byd.sayHello();

        //工厂方法
        Car benz = CarFactory.getFactory("Benz").createCar();
        benz.sayHello();

        //抽象工厂
        ICompanyFactory bydCompany = CompanyFactory.getFactory("BYD");
        bydCompany.crateCar().sayHello();
        bydCompany.createIcebox().IceFood();

    }
}
