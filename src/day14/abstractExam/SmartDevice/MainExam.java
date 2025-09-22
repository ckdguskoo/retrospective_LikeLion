package day14.abstractExam.SmartDevice;

import java.util.Scanner;

public class MainExam {
    public static void main(String[] args) {
        SmartWatchExam smartWatchExam = new SmartWatchExam();

        Scanner scanner = new Scanner(System.in);

        System.out.println("기기 ID를 등록해주세요");
        smartWatchExam.setDeviceId(scanner.nextLine());
        System.out.println("현재 배터리 잔량을 입력해 주세요");
        smartWatchExam.setBatteryLevel(scanner.nextLine());






        smartWatchExam.connect();
        smartWatchExam.checkBattery();
        smartWatchExam.sendDate();

    }
}
