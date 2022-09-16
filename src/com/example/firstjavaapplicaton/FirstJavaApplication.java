package com.example.firstjavaapplicaton;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FirstJavaApplication {
    public static void main(String[] args){
        Random rand=new Random();

        ArrayList<Integer> list = new ArrayList<Integer>();

        int [] frequency={2,3,4,5,6,7,8,9,10,11,12};
        int sum=0;
        int value1=0;
        int value2=0;

        for(int i=0;i<36000000;i++){
            value1=1+rand.nextInt(6);
            value2=1+rand.nextInt(6);
            sum=value1+value2;
            list.add(sum);
        }
        for(int i=0;i<frequency.length;i++) {
            System.out.printf("%d.  ",frequency[i]);
            System.out.println(Collections.frequency(list, frequency[i]));
        }
    }
}