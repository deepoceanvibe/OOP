package chap01_03abstractlayer.interface_;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        SomeInterface someInterface = new ImplementsClass();
        AnotherInterface anotherInterface = new ImplementsClass();

        someInterface.someMethod();
        anotherInterface.anotherMethod();

        ImplementsClass implementsClass = new ImplementsClass();

        implementsClass.someMethod();
        implementsClass.anotherMethod();

    }
}
