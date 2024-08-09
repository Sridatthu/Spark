package HOMEWORK.HOMEWORK2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("present");
                break;
            }
        }
    }
}
