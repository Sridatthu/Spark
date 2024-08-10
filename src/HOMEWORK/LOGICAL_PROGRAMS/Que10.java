package HOMEWORK.LOGICAL_PROGRAMS;

public class Que10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean prime(int n){
            int i=2;
            while(i*i<=n){
                if(n%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }

}
