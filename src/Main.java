import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze \nPodaj pierwszą cyfrę?");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj drugą cyfrę?");
        double number2 = scanner.nextDouble();
        System.out.println("Możliwe opcje: \n1 - dodawanie \n2 - odejmowanie \n3 - mnozenie \n4 - dzielenie");
        System.out.println("Wybierz opcję:");
        int opcja = scanner.nextInt();
        switch (opcja) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Niepoprawna opcja");
        }
    }
}