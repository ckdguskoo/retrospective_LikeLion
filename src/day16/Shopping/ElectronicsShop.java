package day16.Shopping;

public class ElectronicsShop implements OnlineShop {
    @Override
    public void buy(String item) {
        System.out.println("전자제품 쇼핑몰에서" + item + "을 구매합니다.");
    }

    @Override
    public void returnItem(String item) {
        System.out.println("전자제품 쇼핑몰에서" + item + "을 반품합니다.");
    }

    @Override
    public void getDeliveryInfo() {
        System.out.println("전자제품 쇼핑몰의 배송 정보: 1주일 소요");

    }

    public static void main(String[] args) {
        ElectronicsShop shop = new ElectronicsShop();
        shop.buy("스마트폰");
        shop.getDeliveryInfo();
        shop.returnItem("tv");
        OnlineShop.getShippingFee(800000);

    }
}
