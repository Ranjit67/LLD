package Genaric;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        // Pair pair = new Pair<Dog>();

        // List<Dog> dog = pair.setSecond(new Dog());
        // for (Dog ele : dog) {
        // ele.check();
        // }

        // Thread t = new Thread(() -> System.out.println("hello world"));
        // t.start();
        List<Integer> s1 = List.of(2, 1, 4, 5);
        s1.stream();

        Stream<Integer> s = s1.stream();
        System.out.println(s.limit(4).count());
        Stream s3 = s1.stream().filter((item) -> item % 2 == 0);
        System.out.println(s3.collect(Collectors.toList()));
        // s1.forEach((i) -> System.out.println(i));

    }

}
