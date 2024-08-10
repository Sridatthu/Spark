package HOMEWORK.LOGICAL_PROGRAMS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
