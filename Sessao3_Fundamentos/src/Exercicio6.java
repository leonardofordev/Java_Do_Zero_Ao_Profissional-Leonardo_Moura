import java.util.Scanner;

public class Exercicio6 {
    /*
     * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
     * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
     * Encontre o delta
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 12;
        int c = -13;

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        // Imprimindo o resultado
        System.out.println("O valor de delta é: " + delta);

        sc.close();
    }
}
