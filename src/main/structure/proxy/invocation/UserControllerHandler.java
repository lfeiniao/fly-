package main.structure.proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: flyDesign
 * @description: Java动态代理
 * @author: liuyang
 * @create: 2020-12-10 18:21
 **/
public class UserControllerHandler implements InvocationHandler {

    private Object target;

    public UserControllerHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I can do something before");
        Object result = method.invoke(target, args);
        System.out.println("I can do something after");
        return result;
    }
}
