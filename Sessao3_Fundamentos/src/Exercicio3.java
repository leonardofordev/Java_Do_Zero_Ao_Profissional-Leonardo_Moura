import java.util.Scanner;
import java.lang.Math;

public class Exercicio3 {
    // Criar um programa que leia o peso e a altura do usuário e imprima no console
    // o IMC.
    public static void main(String[] args) {
        // Criar objeto para receber as informações do usuario
        Scanner sc = new Scanner(System.in);
        // Iniciação das variaveis
        double peso, altura;

        // loop para garantir que o usuario informe os valores corretos
        while (true) {
            try {
                System.out.println("Digite a altura: ");
                altura = sc.nextDouble();
                System.out.println("Digire o peso: ");
                peso = sc.nextDouble();

                if (peso <= 0 || altura <= 0) {
                    System.out.println("Valor invalido. a altura e peso não podem ser menos que zero.");
                } else {
                    break;
                }

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente. ");
                sc.next();
            }
        }
        sc.close();
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC %.2f", IMC);
    }
}
