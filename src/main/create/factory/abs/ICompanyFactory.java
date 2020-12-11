package main.create.factory.abs;

import main.create.factory.Car;

/**
 * @program: flyDesign
 * @description: 工厂接口
 * 工厂既能制作，汽车，也能制作冰箱
 * @author: liuyang
 * @create: 2020-12-10 11:37
 **/
public interface ICompanyFactory {

    Car crateCar();

    Icebox createIcebox();

}
