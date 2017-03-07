package pojo;

/**
 * Created by majunsheng on 2017/2/24.
 */
public class Student extends Person{

    private  String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String GetInvoke(){
        return "通过反射调用";
    }

    public String getStudent(String name , int age){
        return "反射调用有参：name:" + name + "  age:" + age;
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
}
