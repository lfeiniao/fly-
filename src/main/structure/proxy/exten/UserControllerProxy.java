package main.structure.proxy.exten;

import main.structure.proxy.inter.UserVO;

/**
 * @program: flyDesign
 * @description: 代理类
 * @author: liuyang
 * @create: 2020-12-10 17:06
 **/
public class UserControllerProxy extends UserController {

    @Override
    public UserVO login(String name, String passwd)  {
        long startTime = System.currentTimeMillis();
        UserVO user = super.login(name, passwd);
        try {
            Thread.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long loginTime = endTime - startTime;
        user.setLoginTime(loginTime);
        return user;
    }

    @Override
    public UserVO register(String telphone, String passwd)  {
        long startTime = System.currentTimeMillis();
        UserVO user = super.register(telphone,passwd);
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long loginTime = endTime - startTime;
        user.setLoginTime(loginTime);
        return user;
    }
}
