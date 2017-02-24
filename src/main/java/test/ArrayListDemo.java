package test;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by majunsheng on 2017/2/24.
 * Array数组排序
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        String name[] ={"李","张","王","麻","宋"};
        //根据汉字的拼音字母排序 sort-升序  reverse-降序
        Arrays.sort(name, Collator.getInstance(Locale.CANADA));

        System.out.println(Arrays.toString(name));

    }
}
