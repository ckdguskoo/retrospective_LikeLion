package day13;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println(getName() +"가 멍멍 짖습니다");
    }
    public void eat(){
        System.out.println(getName()+"가 강아지껌을 먹습니다");
    }
    public void wagTail(){
        System.out.println(getName()+"가 꼬리를 흔듭니다");
    }
}