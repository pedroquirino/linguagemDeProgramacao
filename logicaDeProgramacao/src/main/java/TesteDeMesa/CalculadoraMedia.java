package TesteDeMesa;

import java.util.Scanner;
import java.util.Locale;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sub, x, api, p1, e1, e2, calcBase, bonus, nota;

        System.out.println("Insira os valores para cada nota:");
        System.out.print("Digite o valor para SUB: ");
        sub = scanner.nextDouble();

        System.out.print("Digite o valor para X: ");
        x = scanner.nextDouble();

        System.out.print("Digite o valor para API: ");
        api = scanner.nextDouble();

        System.out.print("Digite o valor para P1: ");
        p1 = scanner.nextDouble();

        System.out.print("Digite o valor para E1: ");
        e1 = scanner.nextDouble();

        System.out.print("Digite o valor para E2: ");
        e2 = scanner.nextDouble();
        calcBase = (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);
        if (calcBase > 5.9) {
            bonus = 1.0;
        } else {
            bonus = 0.0;
        }
        nota = (calcBase * 0.5) + (bonus * api * 0.5);

        Locale.setDefault(Locale.US);
        System.out.printf("A NOTA final é: %.2f%n", nota);
        scanner.close();
    }
}