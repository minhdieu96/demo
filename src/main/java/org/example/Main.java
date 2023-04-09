package org.example;

public class Main {
    static int toanCuc= 0;
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        System.out.println("Tong hai so tu nhien la: ");
//        System.out.println(plusTwoNumber(12,2));
//        System.out.println("Hieu hai so tu nhien la: ");
//        System.out.println(minusTwoNumber(12,2));
        System.out.println("Tong ba so tu nhien la: ");
        System.out.println(plusThreeNumber(12,2,3));
        System.out.println(showName1("Dieu", "Quang Tri"));
        showName("Loan");

    }
    /*
        Day la method tinh tong hai so tu nhien
        huhiohjhjohj
     */
    public static int plusTwoNumber(int num1, int num2){
        // Tong hai so tu nhien = num1 + num2
        int sum = num1 + num2;
        toanCuc = sum;
        // Tra ve ket qua
        return sum;
    }
    // tru hai so tu nhien = num1 - num2
    public static int minusTwoNumber(int num1, int num2){
        int minus = num1 - num2;
        // Tra ve ket qua
        return minus;
    }
    public static int plusThreeNumber (int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
       // return sum;
        return sum;
    }
    private static void showName(String name){
        String a = "Her name is: ";
        System.out.println(a+name);
    }

    private static String showName1(String name, String city){
        String a = "Her name is: " + name + " and she from: " + city;
        return a;
    }
}