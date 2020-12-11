package main.create.singleton;

/**
 * @program: flyDesign
 * @description: 懒汉式
 * @author: liuyang
 * @create: 2020-12-09 10:23
 **/
public class SingletonLazy {
    private  static SingletonLazy singleton;
    private SingletonLazy(){};
    public static  synchronized  SingletonLazy getInstance(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
    public void sayHello(){
        System.out.println("hello I am SingletonLazy");
    }
}
