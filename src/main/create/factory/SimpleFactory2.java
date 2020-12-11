package main.create.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: flyDesign
 * @description: 简单工厂
 * 所有的产品，实现同一个接口，工厂类返回对应的产品
 * 返回类型为接口类
 * @author: liuyang
 * @create: 2020-12-10 10:37
 **/
public class SimpleFactory2 {
    private  static  final  Map<String, Car> carMap = new HashMap<>();
    static{
        carMap.put("Benz", new Benz());
        carMap.put("BMW", new BMWCar());
        carMap.put("BYD", new BYDCar());
    }
    public static Car createCar(String carName){
        return carMap.get(carName);
    }
}
