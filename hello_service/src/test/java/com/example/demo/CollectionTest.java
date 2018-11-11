package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        for (String temp    : list){
//            if ("2".equals(temp)){
//                list.remove(temp);
//            }
//        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String temp = it.next();
            if ("2".equals(temp)){
                it.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void list2ArrayTest(){
        List<String> list = new ArrayList<>(2);
        list.add("1");
        list.add("2");
        String[] array = new String[list.size()+1];
        array = list.toArray(array);
        System.out.println(array);
    }
}
