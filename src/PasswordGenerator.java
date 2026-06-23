import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Генератор паролей ===");

        // Нужно задать длину пароля (число);
        System.out.println("Введите длину пароля: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера;

        // Нужно ли использовать спецсимволы? (да/нет);
        System.out.println("использовать спецсимволы? (да/нет): ");
        String useSpecial = scanner.nextLine();

        // Будут ли цифры в пароле? (да/нет);
        System.out.println("Использовать цифры в пароле? (да/нет): ");
        String useNumber = scanner.nextLine();

        // Генерируем пароль;
        String password = generatePassword(length, useSpecial, useNumber, random);

        // Выводим результат;
        System.out.println("Ваш пароль: " + password);
    }

    public static String generatePassword(int length, String useSpecial, String useNumber, Random random) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String special = "!@#$%&*";

        if (useSpecial.equalsIgnoreCase("да")) {
            letters += special;
        }

        if (useNumber.equalsIgnoreCase("да")) {
            letters += numbers;
        }
        String password = "";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(letters.length());
            password += letters.charAt(index);

        }
        return password;
    }
}
