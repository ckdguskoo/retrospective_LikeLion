package day16.game;

public class Warrior implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("전사가 검으로 공격합니다");
    }

    @Override
    public void useSkill() {
        System.out.println("전사가 방패로 막기 스킬을 사용합니다");
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.useSkill();
    }
}
