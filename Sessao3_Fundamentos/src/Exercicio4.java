import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
    /*
     * Criar um programa que leia um valor e apresente os resultados ao quadrado e
     * ao cubo do valor.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor inteiro: ");

        // loop para garantir que o usuario ele vai digitar o valor correto
        while (true) {
            try {
                x = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente");
                sc.next();
            }
        }

        int quadrado = (int) Math.pow(x, 2);
        int cubo = (int) Math.pow(x, 3);

        System.out.println("Valor digitado: " + x);
        System.out.println("Quadrado do valor: " + quadrado);
        System.out.println("Cubo do valor: " + cubo);

        sc.close();
    }

}
