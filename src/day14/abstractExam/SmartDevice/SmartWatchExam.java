package day14.abstractExam.SmartDevice;

public class SmartWatchExam extends AbstractExam {

    @Override
    protected void connect() {
        System.out.println(getDeviceId()+"스마트워치가 연결되었습니다.");
    }

    @Override
    protected void sendDate() {
        System.out.println("심박수와 걸음 수 데이터를 전송합니다.");
    }

    @Override
    protected void checkBattery() {
        System.out.println("현재 배터리 : "+ getBatteryLevel()+"%");
    }
}
