package chap02_02ecap.setter_code;


import chap02_02ecap.ecap_code.CalculateType;

// 최종 리팩토링 코드
// 근본적으로 코드실행중에 유효성을 검사하는것은 if문을 계속 양산합니다.
//따라서 생성 시점에 아예 유효성을 검사해버리는것이 더 좋음
public class CalculateCommand {
    private CalculateType calculateType;
    private int num1;
    private int num2;

    public void setCalculateType(CalculateType calculateType){
        this.calculateType = calculateType;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

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

    // 기존 getter 삭제
    // 그럼에도 불구하고 어쨌든 연산 결과를 만들어서 돌려주긴 해야 함
    public int getCalculateResult() {
        CalculateType calculateType = this.calculateType;
        int num1 = this.num1;
        int num2 = this.num2;

        // 생성자에서 이미 유효성 검사가 완료되었고 setter가 없으므로 값이 변경되지 않았음도 보장되므로 바로 연산 가능
        int result = calculateType.calculate(num1, num2);
        return result;
    }
}
