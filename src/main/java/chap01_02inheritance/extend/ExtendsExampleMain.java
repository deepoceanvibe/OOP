package chap01_02inheritance.extend;

public class ExtendsExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent();   // 부모타입 변수에 부모타입 객체대입
        Parent parentTypeChild = new Child();   // 부모타입 변수에 자식타입객체 대입 (다형성)
        Child child = new Child();  // 자식타입 변수에 자식타입 객체대입

        parent.someMethod();
        parentTypeChild.someMethod();
//      부모타입 변수에 자식타입꺼 호출하면 부모쪽만 호출됨
//      parentTypeChild.anotherMethod();

        child.someMethod();
        child.anotherMethod();
    }
}
