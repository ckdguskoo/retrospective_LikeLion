package day14.abstractExam.Restaurant;

public class RestaurantReservation extends Reservation {
    @Override
    protected void makeReservation() {
        System.out.println("레스토랑 예약이 완료되었습니다");
    }

    @Override
    protected void modifyReservation() {
        System.out.println("예약시간이"+ getDateTime()+"으로 변경되었습니다");
    }

    @Override
    protected void cancelReservation() {
        System.out.println("예약이 취소되었습니다.");
    }
}
