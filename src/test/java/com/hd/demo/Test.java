package com.hd.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        List list= Arrays.asList(10,11,12,14);
        set.addAll(list);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int i = iterator.next() % 10;
            if(i==1 || i==2){
                System.out.println(iterator.next());
            }
        }
    }

}
