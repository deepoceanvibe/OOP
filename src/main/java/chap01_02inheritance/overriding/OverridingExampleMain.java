package chap01_02inheritance.overriding;

public class OverridingExampleMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent parentTypeChild = new Child();

        parent.someMethod();
        parentTypeChild.someMethod();       // 오버라이딩된 메서드는 부모타입으로도 자식메서드 호출 가능
    }
}