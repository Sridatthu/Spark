package HOMEWORK.HOMEWORK2;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("enter 10 numbers");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("odd numbers");
        for(int i=0;i<10;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("even numbers");
        for(int i=0;i<10;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
