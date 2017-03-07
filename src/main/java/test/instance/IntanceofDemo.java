package test.instance;

import pojo.Person;
import pojo.Student;

/**
 * Created by majunsheng on 2017/3/7.
 * instanceof运算符用法
 * 运算符是双目运算符,左面的操作元是一个对象,右面是一个类.当
 * 左面的对象是右面的类创建的对象时,该运算符运算的结果是true,否则是false
 *
 * 说明:(1)一个类的实例包括本身的实例,以及所有直接或间接子类的实例
 * (2)instanceof左边操作元显式声明的类型与右边操作元必须是同种类或右边是左边父类的继承关系,
 * (3)不同的继承关系下,编译出错
 */
public class IntanceofDemo {
    public static void main(String[] args) {
        instanceofTest(new Student());


        //isInstance示例
        //Class类的isInstance(Object obj)方法，
        // obj是被测试的对象，如果obj是调用这个方法的class或接口 的实例，则返回true。
        String s = new String();
        System.out.println(String.class.isInstance(s));
    }


    //instanceof运算符用法
    public static void instanceofTest(Person p){
        if (p instanceof Student) System.out.println("p是类Student的实例！");
        if (p instanceof Person) System.out.println("p是类Person的实例！");
        //if (p instanceof Postgraduate) System.out.println("p是类Student的实例！");
        if (p instanceof Object) System.out.println("p是类Object的实例！");
    }
}
