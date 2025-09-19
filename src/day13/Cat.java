package day13;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        System.out.println(getName()+"가 야옹 하고 웁니다");
    }
    public void eat(){
        System.out.println(getName()+"가 츄르를 먹습니다");
    }
    public void groom(){
        System.out.println(getName()+"가 그루밍을 합니다");
    }
}
