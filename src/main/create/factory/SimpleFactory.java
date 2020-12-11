package main.create.factory;

/**
 * @program: flyDesign
 * @description: 简单工厂
 * 所有的产品，实现同一个接口，工厂类返回对应的产品
 * 返回类型为接口类
 * 使用if 实现
 * @author: liuyang
 * @create: 2020-12-10 10:37
 **/
public class SimpleFactory {
    public static Car createCar(String carName){
        if("Benz".equals(carName)){
            return new Benz();
        }else if("BMW".equals(carName)){
            return new BMWCar();
        }else if("BYD".equals(carName)){
            return new BYDCar();
        }else{
            throw new IllegalArgumentException("不支持的车型");
        }
    }

}
