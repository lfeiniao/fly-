package main.structure.proxy.inter;

/**
 * @program: flyDesign
 * @description: 用户登录代理类
 * @author: liuyang
 * @create: 2020-12-10 16:35
 **/
public class UserControllerProxy implements IUserController{
    private UserController userController;

    public UserControllerProxy(UserController userController){
        this.userController = userController;
    }

    @Override
    public UserVO login(String name, String passwd)  {
        long startTime = System.currentTimeMillis();
        UserVO user = userController.login(name, passwd);
        try {
            Thread.sleep(66);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long loginTime = endTime - startTime;
        user.setLoginTime(loginTime);
        return user;
    }

    @Override
    public UserVO register(String telphone, String passwd)   {
        long startTime = System.currentTimeMillis();
        UserVO user = userController.register(telphone,passwd);
        try {
            Thread.sleep(77);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long loginTime = endTime - startTime;
        user.setLoginTime(loginTime);
        return user;
    }
}
