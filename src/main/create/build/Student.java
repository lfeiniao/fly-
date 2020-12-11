package main.create.build;

/**
 * @program: flyDesign
 * @description: 学生个人信息
 * @author: liuyang
 * @create: 2020-12-10 14:12
 **/
public class Student {
    private String name;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    Student(StudentBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class StudentBuilder{
        private String name;
        private int age;
        private String address;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public Student build(){
            if(this.name == null || this.name.trim().equals("")){
                throw  new IllegalArgumentException("姓名不能为空");
            }
            if(age > 120 || age < 0){
                throw new IllegalArgumentException("年龄参数错误");
            }
            return new Student(this);
        }

    }
}
