package day16.travle;

public class BeachVacationPlanner implements TravelPlanner{
    @Override
    public void planTrip(String destination) {
        System.out.println("여행지를 "+destination+"로 설정합니다");
    }

    @Override
    public void setDuration(int duration) {
        System.out.println("여행기간을 "+duration+"일로 성정합니다.");
    }

    @Override
    public void getTravelTips() {
        System.out.println("자외선 차단제와 수영복을 꼭 준비하세요.");
    }

    public static void main(String[] args) {
        BeachVacationPlanner beachVacationPlanner = new BeachVacationPlanner();
        beachVacationPlanner.planTrip("발리");
        beachVacationPlanner.setDuration(7);
        beachVacationPlanner.getTravelTips();
        TravelPlanner.calculateBudget(10,"일반여행");
    }
}
