package chap02_02ecap.ecap_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {

        // 클라이언트는 연산 결과를 달라고만 주문하면 됨.
        // ***(중요) 결합도가 낮아짐 = 다른 클래스 호출 구문 개수 줄어든다는 뜻과 동일

        int result = calculateCommand.getCalculateResult();
        return result;
    }
}
