package main.structure.proxy;

import main.structure.proxy.inter.IUserController;
import main.structure.proxy.inter.UserController;
import main.structure.proxy.inter.UserControllerProxy;
import main.structure.proxy.inter.UserVO;
import main.structure.proxy.invocation.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @program: flyDesign
 * @description: 代理模式
 * @author: liuyang
 * @create: 2020-12-10 16:46
 **/
public class MainProxy {
    public static void main(String[] args) {
        //基于接口的实现.组合
        UserControllerProxy userControllerProxy = new UserControllerProxy(new UserController());
        UserVO loginUserVO = userControllerProxy.login("A", "34");
        System.out.println(loginUserVO);
        UserVO registerUserVO = userControllerProxy.register("18202744018", "342");
        System.out.println(registerUserVO);

        //基于继承的实现
        main.structure.proxy.exten.UserControllerProxy userControllerProxy1 = new main.structure.proxy.exten.UserControllerProxy();
        UserVO login = userControllerProxy1.login("ABA", "ABA");
        System.out.println(login);
        UserVO register = userControllerProxy1.register("1778627", "adf");
        System.out.println(register);

        //java 动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        IUserController userControllerProxy2 = dynamicProxy.createUserControllerProxy();
        userControllerProxy2.login("dyna", "34");
        userControllerProxy2.register("dynamic", "dynamic");
    }
}
