package HOMEWORK.LOGICAL_PROGRAMS;


import java.util.*;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter shoe name");
        String s=sc.nextLine();
//        if(s.equals("Nike")){
//            System.out.println("Just do it");
//        }else if(s.equals("Adidas")){
//            System.out.println("Impossible is nothing");
//        } else if (s.equals("Puma")) {
//            System.out.println("Forever Faster");
//        } else if (s.equals("Reebok")) {
//            System.out.println("I am What I am");
//        }//can also be written in switch
        switch (s){
            case "Nike":
                System.out.println("just do it");
                break;
            case "Puma":
                System.out.println("Forever faster");
                break;
            default:
                System.out.println("enter correct shoe name");

        }
    }
}
