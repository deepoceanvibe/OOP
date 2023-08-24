package chap02_02ecap.prev_code;



// 최종 리팩토링 코드
// 근본적으로 코드실행중에 유효성을 검사하는것은 if문을 계속 양산합니다.
//따라서 생성 시점에 아예 유효성을 검사해버리는것이 더 좋음
public class CalculateCommand {
    private CalculateType calculateType;
    private int num1;
    private int num2;

    public CalculateCommand(CalculateType calculateType, int num1, int num2){
        if (calculateType == null) {
            throw new RuntimeException("CalculateType은 필수값 입니다.");
        }

        if (calculateType == CalculateType.DIVIDE && num2 == 0 ) {
            throw new RuntimeException("0으로 나눌 수 없습니다.");
        }

        this.calculateType = calculateType;
        this.num1 = num1;
        this.num2 = num2;
    }

    public CalculateType getCalculateType() {
        return calculateType;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
