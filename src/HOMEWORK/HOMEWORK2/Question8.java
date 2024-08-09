package HOMEWORK.HOMEWORK2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum/n);
    }
}
