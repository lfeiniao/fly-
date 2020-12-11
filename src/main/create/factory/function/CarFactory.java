package main.create.factory.function;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: flyDesign
 * @description: 工厂方法的工厂方法
 * @author: liuyang
 * @create: 2020-12-10 11:17
 **/
public class CarFactory {

    private  static  final Map<String, ICarFactory> carMap = new HashMap<>();
    static{
        carMap.put("Benz", new BenzFactory());
        carMap.put("BMW", new BMWCarFactory());
        carMap.put("BYD", new BYDFactory());
    }
    public static ICarFactory getFactory(String carName){
        return carMap.get(carName);
    }
}
