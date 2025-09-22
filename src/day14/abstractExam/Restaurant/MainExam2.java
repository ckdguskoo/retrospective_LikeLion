package day14.abstractExam.Restaurant;

import java.util.Scanner;

public class MainExam2 {
    public static void main(String[] args) {
        RestaurantReservation restaurantReservation = new RestaurantReservation();
        restaurantReservation.makeReservation();
        Scanner input = new Scanner(System.in);
        System.out.println("예약을 수정합니다");
        System.out.println("원하시는 날짜를 선택해주세요");
        restaurantReservation.setDateTime(input.nextLine());
        restaurantReservation.modifyReservation();
        restaurantReservation.cancelReservation();
    }
}
