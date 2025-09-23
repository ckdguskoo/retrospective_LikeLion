package day15.parent;

public class Child extends ParentExma{
    @Override
    void sayHello() {
        super.sayHello();
    }

    void sayHi() {
        System.out.println("Hi from Child!");
    }

    public static void main(String[] args) {
        ParentExma p = new Child();
        p.sayHello();
        //p.sayHi();

        Child child = (Child)p;
        child.sayHi();

    }
}
