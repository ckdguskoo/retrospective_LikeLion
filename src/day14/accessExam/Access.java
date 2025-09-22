package day14.accessExam;

public class Access {
    //문제: 다음 요구사항에 맞는 접근 제한자를 사용하여 BankAccount 클래스를 구현하세요.
    //
    //계좌번호와 계좌주는 조회만 가능하고 변경 불가능 (getter/setter 문제)
    //잔액은 클래스 내부에서만 직접 접근 가능
    //입금과 출금은 누구나 사용 가능
    //이자율은 같은 패키지 내의 클래스만 접근 가능
    //계좌 상태 검사는 이 클래스를 상속한 클래스만 접근 가능

    //계좌번호(accountNumber)
    //계좌주(ownerName)
    //잔액(balance)
    //이자율(interestRate)

    private int accountNumber;
    private String ownerName;
    private int balance;
    protected int interestRate;

    public Access(int accountNumber, String ownerName, int balance, int interestRate) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    private void checkAccountStatus(){
        System.out.println(balance);
    }
}
