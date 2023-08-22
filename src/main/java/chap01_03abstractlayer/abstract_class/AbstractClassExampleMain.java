package chap01_03abstractlayer.abstract_class;

public class AbstractClassExampleMain {
    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                System.out.println("AbstractClass abstractMethod");
            }
        };

        abstractClass.implementedMethod();
        abstractClass.abstractMethod();
    }
}
