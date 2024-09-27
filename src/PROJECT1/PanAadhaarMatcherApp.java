package PROJECT1;

import java.util.Scanner;

public class PanAadhaarMatcherApp {
    public static void main(String[] args) {
        AadhaarService aadhaarService=new AadhaarService();
        PanService panService=new PanService();
        System.out.println("enter Aadhaar number :");
        Scanner sc=new Scanner(System.in);
        String aadhaarNumber=sc.nextLine();
        Aadhaar aadhaar=aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan=panService.getPanByAadhaarNumber(aadhaarNumber);
        if(aadhaar!=null && pan!=null){
            System.out.println("Aadhaar details"+aadhaar);
            System.out.println("Pan Details"+pan);
        }else{
            System.out.println("details not matched");
        }

    }
}
