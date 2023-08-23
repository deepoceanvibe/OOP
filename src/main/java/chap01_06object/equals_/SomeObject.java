package chap01_06object.equals_;

import java.util.Objects;

public class SomeObject {
    private int intField;
    private String stringField;

    @Override
    public boolean equals(Object o) {
        // 참조 주소가 같으면 두 개가 완전히 같은 객체라는 뜻
        if (this == o) return true;
        // 유효하지 않은 Object o를 집어넣었다면 이 역시 비교대상이 될 수 없으므로 바로 거짓으로 인식
        if (o == null || getClass() != o.getClass()) return false;
        // 파라미터로 받은 Object는 다형성 원리에 의해서 부모클래스 위치에 SomeObject라는 자식객체를 입력한 상태일 것이므로
        // 먼저 캐스팅을 통해 SomeObject로 환원해준 다음,
        SomeObject that = (SomeObject) o;
        // 환원된 객체와 현재 비교하려는 객체 둘의 intField와 StringField가 같다는게 확인되면 true를 리턴하도록 함.
        return intField == that.intField && Objects.equals(stringField, that.stringField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intField, stringField);
    }

    public SomeObject(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }
    public int getIntField() {
        return intField;
    }
    public String getStringField() {
        return stringField;
    }
}
