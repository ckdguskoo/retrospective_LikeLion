package day15.coffeCafe;

public class CoffeExam extends OverRoding {
    public CoffeExam(String name, int price) {
        super(name, price);
    }

    @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public void setPrice(int price) {
            super.setPrice(price);
        }


        @Override
        public void prepare() {
            System.out.println("커피를 준비합니다");
            System.out.println(getName()+ "를 준비합니다."  );
            System.out.println("가격: " + getPrice() + "원");
        }
    }
