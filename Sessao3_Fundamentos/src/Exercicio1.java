import java.util.Scanner;

public class Exercicio1 {
    // Criar um programa que leia a temperatura em Fahrenheit e converta para
    // Celsius
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        double tFahrenheit;
        // Mensagem solicitando a temperatura em Fahrenheit
        System.out.println("Digite a temperatura em Fahrenheit: ");

        // Loop para garantir que o usuário insira um valor numérico válido
        while (true) {
            try {
                // Lê o valor inserido pelo usuário
                tFahrenheit = sc.nextDouble();
                // Se o valor for lido com sucesso, sai do loop
                break;
            } catch (Exception e) {
                // Caso ocorra uma exceção (entrada inválida), exibe uma mensagem de erro
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        // Converte a temperatura de Fahrenheit para Celsius
        double tCelsius = (tFahrenheit - 32) / 1.8;

        System.out.println("Temperatura em Fahrenheit: " + tFahrenheit + " F");
        System.out.println("Temperatura em Celsius: " + tCelsius + " C");
        sc.close();
    }

}