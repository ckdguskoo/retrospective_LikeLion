package day16.game;

public class Mage implements GameCharacter {
    @Override
    public void attack() {
        System.out.println("마법사가 마법공격을합니다");
    }

    @Override
    public void useSkill() {
        System.out.println("마법사가 파이어볼 스킬을 사용합니다");
    }

    public static void main(String[] args) {
        Mage m = new Mage();
        m.attack();
        m.useSkill();
    }
}
