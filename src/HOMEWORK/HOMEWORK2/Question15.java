package HOMEWORK.HOMEWORK2;

import java.util.*;

public class Question15 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i<c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
