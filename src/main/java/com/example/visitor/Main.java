package com.example.visitor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());*/

//        String key="bflwbaejbfew";
//        key=key.substring(0,2);
//        System.out.println(key);

        /*Integer a=1111;
        String b="";
        String str="a_baa_da_aa";
        String[] strs = str.split("_");
        System.out.println(strs.toString());
        for (int i = 1; i <strs.length ; i++) {
            if(i>1){
                b += strs[i].substring(0, 1).toUpperCase() + strs[i].substring(1);
            }else {
                b=strs[i];
            }
        }
        System.out.println(b);*/

        /*String timestamp = "2019-06-19 15:26:49.0";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date date = null;
        try {
            date = format.parse(timestamp);
            long time = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(format2.format(date));*/

        String key="creDate";
        System.out.println(key.endsWith("Date"));
    }
}
