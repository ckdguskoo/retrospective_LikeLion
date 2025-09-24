package day16.travle;

public interface TravelPlanner {
    public void planTrip(String destination);
    public void setDuration(int duration);

    default void getTravelTips(){
        System.out.println("여권을 확인하고, 환전을 미리 준비하세요.");
    }
    static void calculateBudget(int days, String travelStyle){
        int result = 0;
        switch (travelStyle){
            case "럭셔리여행":
                result = days*500000;
                break;
            case "일반여행":
                result = days*200000;
                break;
            case "백패킹":
                result = days*100000;
                break;
            case "당일치기":
                result = days*50000;
                break;
       }
        System.out.println(days+"일 "+travelStyle+" 예산경비는 "+result+"입니다.");
    }
}
