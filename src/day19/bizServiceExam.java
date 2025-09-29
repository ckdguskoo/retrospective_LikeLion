package day19;

public class bizServiceExam {
    public static void main(String[] args) {
        BizService bizService = new BizService();
        bizService.bizMethod(3);
        try {
            bizService.bizMethod(0);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
