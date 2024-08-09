package HOMEWORK.HOMEWORK2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for (int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
