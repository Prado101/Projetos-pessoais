package projeto.primeiro.projeto01;
import java.util.Scanner;



public class aula02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Dolar = 5.45;
        double Euro = 6.35;
        double Libra = 7.32;
        double Peso = 0.0040;

        System.out.println("Digite a moeda que você quer converter do real: (Dolar, Euro, Libra ou Peso)");
        String moeda = sc.nextLine();

        System.out.println("Digite o valor em reias que você quer converter:");
        double valor = sc.nextDouble();

        switch (moeda) {
            case "Dolar":
                System.out.printf("R$ %.2f equivalem a US$ %.2f\n", valor, (valor / Dolar));
                break;

            case "Euro":
                System.out.printf("R$ %.2f equivalem a € %.2f\n", valor,(valor / Euro));
                break;

            case "Libra":
                System.out.printf("R$ %.2f equivalem a £ %.2f\n", valor,(valor / Libra));
                break;
            case "Peso":
                System.out.printf("R$ %.2f equivalem a $ %.2f Pesos\n", valor,(valor / Peso));
                break;
        }
        sc.close();
    }
    }
