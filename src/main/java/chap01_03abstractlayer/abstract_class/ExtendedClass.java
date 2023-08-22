package chap01_03abstractlayer.abstract_class;

public class ExtendedClass extends AbstractClass{

    // 부모쪽에서 선언만  되고 실행문을 따로 정의하지 않았기 때문에 반드시 구현해야 함.
    @Override
    public void abstractMethod() {
        System.out.println("ExtendedClass abstractMethod");
    }
}
