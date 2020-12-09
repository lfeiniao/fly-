package main.java.singleton;

/**
 * @program: flyDesign
 * @description: 饿汉式
 * @author: liuyang
 * @create: 2020-12-09 10:17
 **/
public class SingletonEL {
    private static final SingletonEL singleton = new SingletonEL();

    private SingletonEL(){};

    public static SingletonEL getInstance(){
        return singleton;
    }
    public void sayHello(){
        System.out.println("hello I am SingletonEL");
    }

}
