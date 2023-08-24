package chap02_03stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachIterationExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        // 익명 함수를 내부에서 받는 반복문을 람다식으로 함
        integerList.stream().forEach(integer -> {
            System.out.println(integer);
        });
    }
}
