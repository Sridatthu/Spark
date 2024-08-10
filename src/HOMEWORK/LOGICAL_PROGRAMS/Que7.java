package HOMEWORK.LOGICAL_PROGRAMS;

public class Que7 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        //also using formula for between specifed value N/2[2a +(N-1)*d]
        //where a=start,N=lastnumber,d=differnce
        // for natural numbers (n*(n+1))/2

        System.out.println(sum);
    }
}
