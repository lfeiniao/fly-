package main.create.build;

/**
 * @program: flyDesign
 * @description: MainBuilder
 * 让这个对象的属性都是完整的，在进行构建
 * 当参数过多时，或者需要 这种逻辑校验时
 * @author: liuyang
 * @create: 2020-12-10 14:24
 **/
public class MainBuilder {
    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder();
        Student student = studentBuilder.age(888).name("刘阿姨那个").build();
        System.out.println(student);
    }
}
