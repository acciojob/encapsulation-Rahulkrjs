package com.driver;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //obj.name = "Rahul";
        //System.out.println(obj.name);
        // 'name' has private access in 'com.driver.RWOnly'

        obj.setName("Rahul");

        System.out.println(obj.getName());
    }
  
}