package HOMEWORK.HOMEWORK2;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        int fac=1;
        for(int i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println("fact ="+fac);
    }
}
