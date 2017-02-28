package test.Order;

import java.util.Arrays;

/**
 * Created by majunsheng on 2017/2/28.
 * 排序
 */
public class OrderDemo {

    public static void main(String[] args) {
        //随机生成20个数
        int len = 20;
        int arr[] = new int[len];
        for(int i=0; i<len; i++){
            int v =(int) (Math.random() * 100);
            arr[i] = v;
        }
        System.out.print("arr没有排序前：");
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        //快速排序
        sort(arr);
        //选择排序
        select(arr);
        //冒泡排序
        bubble(arr);

    }

    //快速排序
    public static void sort(int arr[]){
        Arrays.sort(arr);
        System.out.print('\n' + "arr快速排序后：");
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    //选择排序
    public static void select(int arr[]){
        int temp=0;
        for(int i=0; i<arr.length; i++){
            int min = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
           if(min!=i){
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
           }
        }
        System.out.print('\n' + "arr选择排序后：");
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    //冒泡排序
    public static void bubble(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
           /* System.out.print('\n'+"第" + (i + 1) + "次排序结果：");
            for(int k =0; k<arr.length; k++) {
                System.out.print(arr[k]+" ");
            }*/
        }
        System.out.print("\n" + "arr冒泡排序后：");
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
