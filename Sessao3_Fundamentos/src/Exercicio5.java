import java.util.Scanner;

public class Exercicio5 {
    // Criar um programa que leia o valor da base e da altura de um triângulo e
    // calcule a área.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura;
        while (true) {
            try {
                System.out.println("Digite o valor da base: ");
                base = sc.nextDouble();

                System.out.println("Digite o valor da altura: ");
                altura = sc.nextDouble();

                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }

        sc.close();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("Área do Triangulo: " + areaTriangulo);

    }
}
