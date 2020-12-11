package main.create.singleton;

/**
 * @program: flyDesign
 * @description:
 * @author: liuyang
 * @create: 2020-12-09 10:54
 **/
public class MainSingleton {
    public static void main(String[] args) {
        //基于枚举实现
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.sayHello();


        //基于双重校验锁实现
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        instance1.sayHello();

        //饿汉式单例
        SingletonEL instance2 = SingletonEL.getInstance();
        instance2.sayHello();


        //懒汉式单例
        SingletonLazy instance3 = SingletonLazy.getInstance();
        instance3.sayHello();
    }
}
