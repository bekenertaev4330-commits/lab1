import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min;
        String choice;

        System.out.println("Сан енгізіңіз:");
        min = scanner.nextInt();

        do {
            System.out.println("Тағы сан енгізіңіз:");
            number = scanner.nextInt();

            if (number < min) {
                min = number;
            }

            scanner.nextLine();
            System.out.println("Жалғастыру? (yes/no):");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Ең кіші сан: " + min);
    }
}