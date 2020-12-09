package main.java.singleton;

/**
 * @program: flyDesign
 * @description: 双重校验
 * @author: liuyang
 * @create: 2020-12-09 10:29
 **/
public class SingletonDoubleCheck {
    private  static SingletonDoubleCheck singleton;
    private SingletonDoubleCheck(){};
    public static  SingletonDoubleCheck getInstance(){
        if(singleton == null){
            synchronized (SingletonDoubleCheck.class){
                if(singleton == null){
                    singleton = new SingletonDoubleCheck();
                }
            }
        }
        return singleton;
    }
    public void sayHello(){
        System.out.println("hello I am SingletonDoubleCheck");
    }
}
