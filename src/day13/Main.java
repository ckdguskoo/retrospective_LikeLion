package day13;

public class Main {

    public static void main(String[] args) {
        Dog dog =new Dog("뽀삐",7);
        Cat cat = new Cat("나비",8);
        dog.makeSound();
        dog.eat();
        dog.wagTail();

        System.out.println();

        cat.makeSound();
        cat.eat();
        cat.groom();
    }
}
