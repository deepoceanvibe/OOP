package chap01_04enum.basic;

public class CalculateCommand {

    // 이 필드에는 ADD, MINUS, MULTIPLY, DIVIDE 중 하나만 대입 가능
    private CalculateType calculateType;
    private int num1;
    private int num2;

    public CalculateCommand(CalculateType calculateType, int num1, int num2) {
        this.calculateType = calculateType;
        this.num1 = num1;
        this.num2 = num2;
    }

    public CalculateType getCalculateType(){
        return calculateType;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
}
