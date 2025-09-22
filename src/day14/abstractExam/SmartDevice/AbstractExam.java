package day14.abstractExam.SmartDevice;

public abstract class AbstractExam {
    private String deviceId;
    private String manufacturer;
    private String batteryLevel;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    public String getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(String batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    protected  abstract void connect ();
    protected abstract void sendDate();
    protected abstract void checkBattery();
}
