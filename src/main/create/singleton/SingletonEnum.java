package main.create.singleton;

/**
 * @program: flyDesign
 * @description: 枚举
 * @author: liuyang
 * @create: 2020-12-09 10:47
 **/
public enum SingletonEnum {
    //TODO 不太懂这种模式
    INSTANCE;
    public long getId(){
        return  3;
    }
    public void sayHello(){
        System.out.println("hello I am SingletonEnum");
    }
}
