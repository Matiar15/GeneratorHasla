import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class PasswordOptions {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    PasswordData passwordData = new PasswordData();
    int passwordLength = makePasswordLength(scanner);
    String passwordString;
    ArrayList<String> options = new ArrayList<>();
    String[] password = new String[passwordLength];
    public void allPwordOptions() {
        isLowerCased(scanner);
        isUpperCased(scanner);
        isSymbolical(scanner);
        isNumbers(scanner);
        for (int i = 0; i < passwordLength; i++) {
            String choice = options.get(random.nextInt(options.size()));
            password[i] = Character.toString(choice.charAt(random.nextInt(choice.length())));
        }
        passwordString = String.join("", password);
        System.out.println(passwordString);
    }

    public int makePasswordLength(Scanner scanner) {
        System.out.println("Wprowadź długość hasła: ");
        int passwordLength = scanner.nextInt();
        scanner.nextLine();
        return passwordLength;
    }
    public void isLowerCased(Scanner scanner) {
        System.out.println("Czy chcesz posiadać małe litery w swoim haśle?(Tak/Nie): ");
        if (scanner.nextLine().equalsIgnoreCase("Tak")) options.add(passwordData.lowerCaseLetters);
    }
    public void isUpperCased(Scanner scanner) {
        System.out.println("Czy chcesz posiadać wielkie litery w swoim haśle?(Tak/Nie): ");
        if (scanner.nextLine().equalsIgnoreCase("Tak")) options.add(passwordData.upperCaseLetters);
    }
    public void isSymbolical(Scanner scanner) {
        System.out.println("Czy chcesz posiadać małe litery w swoim haśle?(Tak/Nie): ");
        if (scanner.nextLine().equalsIgnoreCase("Tak")) options.add(passwordData.symbols);
    }
    public void isNumbers(Scanner scanner) {
        System.out.println("Czy chcesz posiadać małe litery w swoim haśle?(Tak/Nie): ");
        if (scanner.nextLine().equalsIgnoreCase("Tak")) options.add(passwordData.numbers);
    }
}
