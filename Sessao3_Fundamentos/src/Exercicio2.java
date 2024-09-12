import java.util.Scanner;

public class Exercicio2 {
    /*
     * Criar um programa que leia a temperatura em Celsius e converta para
     * Fahrenheit.
     */
    public static void main(String[] args) {
        // cria um objeto para ler a entrada do usuario
        Scanner sc = new Scanner(System.in);
        double TCelsius;

        // Mensagem solicitando a temperatura em celsius
        System.out.println("Insira a temperatura em Celsius: ");

        // Loop para garantir que o usuario irá inserir um valor correto
        while (true) {
            try {
                TCelsius = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        sc.close();
        // Formula para calcular a temperatura de Celsius para Fahrenheit
        double tFahrenheit = (1.8 * TCelsius) + 32;

        System.out.println("Temperatura em Celsius: " + TCelsius + " C");
        System.out.println("Temperatura Em Fahrenheit: " + tFahrenheit + " f");

    }
}
