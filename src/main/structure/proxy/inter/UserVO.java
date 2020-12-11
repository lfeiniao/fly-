package main.structure.proxy.inter;

/**
 * @program: flyDesign
 * @description: 用户信息
 * @author: liuyang
 * @create: 2020-12-10 15:54
 **/
public class UserVO {
    private String name;
    private int age;
    private String passwd;
    private long loginTime;
    private String operation;

    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passwd='" + passwd + '\'' +
                ", loginTime=" + loginTime +
                ", operation='" + operation + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public UserVO(String name, int age, String passwd, long loginTime, String operation) {
        this.name = name;
        this.age = age;
        this.passwd = passwd;
        this.loginTime = loginTime;
        this.operation = operation;
    }

}
