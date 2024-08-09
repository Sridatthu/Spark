package OOPS;
class A{
 int v=10;
    void m() {
        int a = 10;
        System.out.println("parent");
    }

}
class B extends A{
    @Override
    void m(){
        System.out.println("child");
    }
}
public class Test {
    public static void main(String[] args) {
        A a=new A();
        a.m();
        B b=new B();
        System.out.println(b.v);


    }
}
