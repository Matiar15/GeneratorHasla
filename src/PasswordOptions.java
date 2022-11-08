import java.util.ArrayList;
import java.util.Objects;
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
        while (true) {
            try {
                isLowerCased(scanner);
                isUpperCased(scanner);
                isSymbolical(scanner);
                isNumbers(scanner);
                getPassword(passwordLength, options);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Niestety podane parametry nie wystarczyły, aby stworzyć hasło\nCzy chcesz stworzyć" +
                        " hasło ponownie?(Tak/Nie): ");
                if (!Objects.equals(scanner.nextLine(), "Tak")) {
                    System.out.println("W takim razie żegnaj!");
                    break;
                }
            }
        }
    }

    private int makePasswordLength(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Wprowadź długość hasła (4-22 znaków): ");
                int passwordLength = scanner.nextInt();
                scanner.nextLine();
                pauseLine();
                if (passwordLength >= 4 && passwordLength <= 22) return passwordLength;
                System.out.println("Wprowadź wymaganą ilość znaków: ");
            } catch (Exception e) {
                System.out.println("Nie wpisałeś liczby, wprowadź długość hasła jeszcze raz: ");
                pauseLine();
                scanner.next();
            }
        }
    }

    private void isLowerCased(Scanner scanner) {
        choice("Czy chcesz posiadać małe litery w swoim haśle?(Tak/Nie): ", scanner, options, passwordData.lowerCaseLetters);
    }

    private void isUpperCased(Scanner scanner) {
        choice("Czy chcesz posiadać wielkie litery w swoim haśle?(Tak/Nie): ", scanner, options, passwordData.upperCaseLetters);
    }

    private void isSymbolical(Scanner scanner) {
        choice("Czy chcesz posiadać symbole w swoim haśle?(Tak/Nie): ", scanner, options, passwordData.symbols);
    }

    public void isNumbers(Scanner scanner) {
        choice("Czy chcesz posiadać numery w swoim haśle?(Tak/Nie): ", scanner, options, passwordData.numbers);
    }

    private void choice(String text, Scanner scanner, ArrayList<String> list, String data) {
        System.out.println(text);
        if (scanner.nextLine().equalsIgnoreCase("Tak")) list.add(data);
        pauseLine();
    }

    private void getPassword(int passwordLength, ArrayList<String> options) {
        for (int i = 0; i < passwordLength; i++) {
            String choice = options.get(random.nextInt(options.size()));
            password[i] = Character.toString(choice.charAt(random.nextInt(choice.length())));
        }
        passwordString = String.join("", password);
        System.out.printf("Twoje hasło to: " + "\"%s\"", passwordString);
    }
    
    private void pauseLine() {
        System.out.println("------------------------------------------------------");
    }
}
