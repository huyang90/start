package com.hy.java.base;

import java.util.Random;

/**
 * @outhor huyang
 * @create 2020/08/12 17:47
 */
public class Main {
    public static void main(String[] args) {
        Integer integer = new Integer(2);
        boolean primitive = integer.getClass().isPrimitive();
        System.out.println(primitive);

        int a = 2;
        boolean primitive1 = Integer.valueOf(2).getClass().isPrimitive();
        System.out.println(primitive1);

        boolean primitive2 = Integer.class.isPrimitive();
        System.out.println(primitive2);

    }

    public static String createRandName() {
        String sources = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 8; j++)
        {
            flag.append(sources.charAt(rand.nextInt(62)) + "");
        }
        return flag.toString();
    }

}
