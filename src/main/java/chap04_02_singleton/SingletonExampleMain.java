package chap04_02_singleton;

public class SingletonExampleMain {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance(); // 최초생성
        Singleton s2 = Singleton.getInstance(); // 이미생성된객체정보받기
        Singleton s3 = Singleton.getInstance(); // 이미생성된객체정보받기

        System.out.println("s1 reference address : " + s1);
        System.out.println("s1 reference address : " + s2);
        System.out.println("s1 reference address : " + s3);
    }
}
