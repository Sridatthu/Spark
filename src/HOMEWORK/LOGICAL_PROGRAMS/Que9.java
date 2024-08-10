package HOMEWORK.LOGICAL_PROGRAMS;

import java.util.Scanner;

//ARMSTRONG NUMBER
public class Que9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println(arm(n));
    }
    public  static boolean arm(int n){
        int sum=0;
        int ans=n;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        if(sum==ans){
            return true;
        }
        return false;
    }
}
