package main.java.singleton;

/**
 * @program: flyDesign
 * @description:
 * @author: liuyang
 * @create: 2020-12-09 10:54
 **/
public class MainSingleton {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.sayHello();

        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        instance1.sayHello();

        SingletonEL instance2 = SingletonEL.getInstance();
        instance2.sayHello();


        SingletonLazy instance3 = SingletonLazy.getInstance();
        instance3.sayHello();
    }
}
