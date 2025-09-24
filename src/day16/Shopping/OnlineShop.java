package day16.Shopping;

public interface OnlineShop {
    public void buy(String item);
    public void returnItem(String item);
    default public void getDeliveryInfo(){
        System.out.println("3일정도 소요됩니다.");
    }
    static void getShippingFee(int price){
        if (price > 50000){
            System.out.println("무료배송입니다.");
        }else {
            System.out.println("3000원의 배송비가 부가됩니다.");
        }
    }
}
