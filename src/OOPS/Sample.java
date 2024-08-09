package OOPS;
interface Dog{
    int legs=4;
default void print(){
    System.out.println("Dog");
}
void hello();

}
class Cat implements Dog{
    @Override
    public void print() {
        Dog.super.print();
        //cannot have the separte calling for the two print methods
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}

public class Sample {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.hello();
        c.print();
        Dog d=new Cat();
        d.hello();
        d.print();
        System.out.println(Cat.legs);
    }
}
