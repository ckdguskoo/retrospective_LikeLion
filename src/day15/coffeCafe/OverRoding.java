package day15.coffeCafe;

public class OverRoding {

        private String name;
        private int price;

    public OverRoding(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void prepare() {
            System.out.println("음료를 준비합니다.");
            System.out.println("음료명: " + name);
            System.out.println("가격: " + price + "원");
        }
    }




