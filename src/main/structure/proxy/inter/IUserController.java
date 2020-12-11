package main.structure.proxy.inter;

/**
 * @program: flyDesign
 * @description: 接口
 * @author: liuyang
 * @create: 2020-12-10 15:53
 **/
public interface IUserController {
    UserVO login(String name, String passwd) ;
    UserVO register(String telphone, String passwd)  ;
}
