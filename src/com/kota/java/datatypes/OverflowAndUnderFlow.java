package com.kota.java.datatypes;

public class OverflowAndUnderFlow {
    public static void main(String[] args) {
        System.out.println("Max value of an int : " + Integer.MAX_VALUE);
        System.out.println("Min value of an int : " + Integer.MIN_VALUE);
        System.out.println("###Overflow incase of int data types#######");

        System.out.println("Add 1 to Max value of an int : " + (Integer.MAX_VALUE+1) );
        System.out.println("Add 2 to Max value of an int : " + (Integer.MIN_VALUE+2) );

        System.out.println("###Underflow incase of int data types####### ");

        System.out.println("Substract 1 from Min value of an int : " + (Integer.MIN_VALUE-1) );
        System.out.println("Substract 2 from Min value of an int : " + (Integer.MIN_VALUE-2) );

        System.out.println("###Overflow incase of non-int data types#######");

        //with integer data types, if we increase the value by 1, we reach min.value of resepective int data type

        System.out.println(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE); // true
        /*
        This is because a double value has only a limited number of significant bits.
        If we increase the value of a large double value by only one, we do not change any of the significant bits.
        Therefore, the value stays the same.
         */
        System.out.println(Double.MAX_VALUE + 1 == Double.MAX_VALUE); // true

        System.out.println(Float.MAX_VALUE*2 == Float.POSITIVE_INFINITY); //true
    }
}
