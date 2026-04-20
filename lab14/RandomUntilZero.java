import java.util.Random;

public class RandomUntilZero {
    public static void main(String[] args) {
        Random random = new Random();
        int num;

        do {
            num = random.nextInt(10); // 0-9
            System.out.println(num);
        } while (num != 0);

        System.out.println("0 шықты, тоқтады");
    }
}