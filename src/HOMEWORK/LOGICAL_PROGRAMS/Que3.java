package HOMEWORK.LOGICAL_PROGRAMS;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter person age");
        int age=sc.nextInt();
        System.out.println("enter person salary");
        double salary=sc.nextDouble();
        if(age<30 && salary>100000){
            System.out.println("elgible for marriage");
        }else{
            System.out.println("not eligible for marriage");
        }
    }
}
