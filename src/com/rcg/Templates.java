package com.rcg;

import com.rcg.bean.Customer;

import java.util.ArrayList;

/**
 * @author RenChunguang
 * @date 2022-08-10 23:36
 */
public class Templates {
    /**
     * IDEA中代码模板所处位置：settings - Editor - live Templates / postfix completion
     */

    //5.prsf
    private static final Customer CUST = new Customer();

    //1.psvm/main
    public static void main(String[] args) {
        //2.sout/soutp/soutm/soutv/xxx.sout
        System.out.println("hello");
        //3.fori/iter/forr/xxx.for
        String[] arr = {"1", "2", "3"};
        for (int i = 0; i < arr.length; i++) {

        }
        for (String s : arr) {
            
        }
        ArrayList list = new ArrayList<>();
        for (Object o : list) {
            
        }
        //4.ifn/inn/xxx.nn/xxx.null
        if (list == null) {

        }
        if (list != null) {

        }

    }


}

