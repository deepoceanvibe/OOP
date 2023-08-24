package chap02_03stream.map;

import java.util.ArrayList;
import java.util.List;

public class MapExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        // stream 람다를 써서 처리
        List<Integer> x10IntegerList = integerList.stream().map
                (integer -> integer * 10).toList();
    }
}
