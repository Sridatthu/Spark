package HOMEWORK.LOGICAL_PROGRAMS;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter factorial number");
        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println("factorial is"+fac);
    }
}
