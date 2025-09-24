package day16.Shopping;

public class ClothingShop implements OnlineShop{
    @Override
    public void buy(String item) {
        System.out.println(item+" 상품을 구매합니다");
    }

    @Override
    public void returnItem(String item) {
        System.out.println( item +"을 반품 합니다");
    }

    @Override
    public void getDeliveryInfo() {
        System.out.println("2일정도 소요됩니다");
        
    }

    public static void main(String[] args) {
        ClothingShop shop = new ClothingShop();
        shop.buy("티셔츠");
        shop.getDeliveryInfo();
        shop.returnItem("반바지");
        OnlineShop.getShippingFee(30000);
    }
}
