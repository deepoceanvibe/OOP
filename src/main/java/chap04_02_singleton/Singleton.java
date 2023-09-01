package chap04_02_singleton;


// 메모리 과부하로 인한 서버가 터질 수 있을 때, 싱글톤 패턴을 사용한다.
public class Singleton {

    // 1. 싱글톤 클래스는 자기 자신 타입을 멤버변수로 가지게 한다.
    // static을 설정해서 공용변수로 만들고, 바로 생성자를 호출해 대입받게 한다.
    private static Singleton instance;

    // 2. 생성자를 private로 막아서 외부에서 인스턴스를 생성하는 것을 막는다.
    // 이러면 위와 같이 자기 클래스 내부에서만 생성자를 호출할 수 있게 된다.
    private Singleton() {}

    // 3. getInstance() 와 같이, 이미 생성된 instance 멤버변수를 리턴해주는 메서드를 추가작성한다.
    // 이 때, instance가 생성된 적이 없다면, 생성자를 호출해서 instance에 대입해주는 로직을 추가한다.
    // 객체 없이 호출해야 되기 때문에 static을 붙여야함!
    public static Singleton getInstance() {

        // 최초 호출시에 객체를 단 한번 생성해줌. 이후로는 instance가 null일 수 없으므로 생성자 호출 안함.
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
