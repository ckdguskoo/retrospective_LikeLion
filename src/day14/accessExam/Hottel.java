package day14.accessExam;

public class Hottel {
    //문제: 다음 요구사항에 맞는 접근 제한자를 사용하여 HotelRoom 클래스를 구현하세요.
    //
    //객실번호는 조회만 가능하고 변경 불가능 (getter/setter 문제)
    //객실 상태는 호텔매니저 클래스만 변경 가능
    //기본 정보는 누구나 조회 가능
    //청소 기록은 클래스 내부에서만 관리
    //비품 목록은 같은 패키지 내에서만 접근 가능
    //
    //필드
    //객실번호(roomNumber)
    //객실타입(roomType)
    //객실상태(roomStatus)
    //청소기록(cleaningRecord)
    //비품목록(supplies)

    private String roomNumber;
    protected String roomStatus;
    private String cleaningRecord;
    protected String supplies;

    public Hottel(String roomNumber, String roomStatus, String cleaningRecord, String supplies) {
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.cleaningRecord = cleaningRecord;
        this.supplies = supplies;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }
}
