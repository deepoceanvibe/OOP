package chap02_01lessif.early_return;

import chap02_01lessif.many_if.CalculateCommand;
import chap02_01lessif.many_if.CalculateType;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;


        // but, 모든 로직에 검사를 다 집어넣어서 가독성이 안좋음
        // early return은 핵심 로직 수행 전에 아예 리턴구문과 함께 앞쪽에 검사로직을 배치하는 것이다.
        // return이 실행되는 순간 메서드는 종료되기 때문에 핵심 로직을 불완전한 상태로 수행하지 않는다.

        if (calculateType == null) {
            return result;
        }

        if (calculateType.equals(CalculateType.DIVIDE) && num2 == 0) {
            throw new RuntimeException("0으로 나눌 수 없습니다.");
        }


        if (calculateType.equals(CalculateType.ADD)) {
            result = num1 + num2;
        } else if (calculateType.equals(CalculateType.MINUS)) {
            result = num1 - num2;
        } else if (calculateType.equals(CalculateType.MULTIPLY)) {
            result = num1 * num2;
        } else if (calculateType.equals(CalculateType.DIVIDE)) {
            result = num1 / num2;
        }
        return result;
    }
}
