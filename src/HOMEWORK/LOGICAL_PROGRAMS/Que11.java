package HOMEWORK.LOGICAL_PROGRAMS;
//Patterns
public class Que11 {
    public static void main(String[] args) {
//PATTERN 1
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //PATTTERN 2
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //PATTERN 3
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //PATTERN 4
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //PATTERN 5
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//PATTERN 6
        for(int i=1;i<=5;i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //PATTERN 7
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            int number=1;
            for(int k=0;k<=i;k++){
            System.out.print(number+" ");
            number=number*(i-k)/(k+1);}
            System.out.println();
        }

    }
}
