import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5)
                .stream()
                .filter(x -> x > 2)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}