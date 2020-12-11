package main.structure.proxy.invocation;

import main.structure.proxy.inter.IUserController;
import main.structure.proxy.inter.UserController;

import java.lang.reflect.Proxy;

/**
 * @program: flyDesign
 * @description: 基于反射的动态代理
 * java 提供的有动态代理
 * @author: liuyang
 * @create: 2020-12-10 17:42
 **/
public class DynamicProxy {

    public IUserController createUserControllerProxy(){
        UserController userController = new UserController();
        ClassLoader classLoader = userController.getClass().getClassLoader();
        Class<?>[] interfaces = userController.getClass().getInterfaces();
        IUserController userControllerProxy = (IUserController)Proxy.newProxyInstance(classLoader, interfaces, new UserControllerHandler(userController));
        return userControllerProxy;
    }
}
