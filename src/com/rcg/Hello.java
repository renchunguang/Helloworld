package com.rcg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author RenChunguang
 * @date 2022-08-10 19:36
 */
public class Hello {

    public static void main(String[] args) {

        //if:   flag.if;    flag.else
        boolean flag = true;
        if (flag) {

        }
        if (!flag) {

        }
        //for/while:    fori;   flag.while
        for (int i = 0; i < 10; i++) {
            
        }
        while (flag) {

        }
        //.var:帮助生成变量:   new String().var/alt+enter
        String s = new String();
        ArrayList<Object> arrayList = new ArrayList<>();
        //sout/"Hello World".sout
        System.out.println("Hello");
        System.out.println("Hello World");
        //try:  int num = 10/0;.try
        try {
            int num = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //List: list.for;   list.fori;  list.forr
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        for (Integer integer : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //  list.iterator.var;  iterator.hasNext().while;   iterator.next().sout
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }

    //return 10.return
    public int test(){
        return 10;
    }

}
