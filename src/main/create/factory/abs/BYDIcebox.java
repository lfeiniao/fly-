package main.create.factory.abs;

/**
 * @program: flyDesign
 * @description: 比亚迪冰箱
 * @author: liuyang
 * @create: 2020-12-10 11:44
 **/
public class BYDIcebox implements Icebox {
    @Override
    public void IceFood() {
        System.out.println("I am BYDIcebox, I can Ice food");
    }
}
