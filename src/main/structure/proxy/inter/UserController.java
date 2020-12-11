package main.structure.proxy.inter;

/**
 * @program: flyDesign
 * @description: 用户接口
 * @author: liuyang
 * @create: 2020-12-10 15:51
 **/
public class UserController implements IUserController{
    @Override
    public UserVO login(String name, String passwd) {
        System.out.println("I am loginning");
        return new UserVO(name,19, passwd, 0, "login" );
    }

    @Override
    public UserVO register(String telphone, String passwd) {
        System.out.println("I am registering");
        return new UserVO(telphone,19, passwd, 0, "register" );
    }
}
