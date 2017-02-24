package test;

import pojo.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by majunsheng on 2017/2/24.
 * 重写Collection.sort 排序
 */
public class test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 =new Student();
        s1.setName("张三");
        s1.setAge(12);
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(10);
        students.add(s1);
        students.add(s2);

        for (Student student :students){
            System.out.println(student.getName()+"---->"+student.getAge());
        }

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                Student s1 =o1;
                Student s2 = o2;
                if(s1.getAge() > s2.getAge()){
                    return 1;
                }
                if (s1.getAge() < s2.getAge()){
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("------------------------------------------------------");
        for (Student student :students){
            System.out.println(student.getName()+"---->"+student.getAge());
        }
    }


}
