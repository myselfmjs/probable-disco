package test;

import pojo.Student;

import java.util.*;

/**
 * Created by majunsheng on 2017/2/27.
 * Map的遍历
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String,Student>();
        Student s1 = new Student("张三",21);
        Student s2 = new Student("李四",22);
        Student s3 = new Student("王五",22);
        map.put("one",s1);
        map.put("two",s2);
        map.put("two",s3);

        //判断此映射是否包含指定键的映射
        System.out.println(map.containsKey("two"));
        //判断此映射是否包含键-值映射关系(是否为空)
        System.out.println(map.isEmpty());


        Iterator<Map.Entry<String, Student>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Student> entry = iterator.next();
            System.out.println(entry.getKey()+"......."+entry.getValue().getName());
        }

        MapRepetition();
    }

    //利用Map统计
    public static void MapRepetition(){

        int array[] = {0,1,2,3,4,4,3,2,1,2,3,1,4,2,1,3,2,1,4,1};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i :array){
            Integer t = map.get(i);
            map.put(i,t==null? 1:t+1);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("array中："+entry.getKey()+"出现的次数:"+entry.getValue());
        }

       /* List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(4);
        intList.add(4);
        intList.add(4);
        intList.add(5);
        for (int i :intList){
            System.out.println("intList.....:"+i);
        }*/

/*
       //数组转list
        Integer intArray[] = new Integer[]{1,2,3,4,5,4,3,1,2};
        List list = Arrays.asList(intArray);
       for (Object i : list){
           System.out.println(i+"......");
       }*/

    }
}
