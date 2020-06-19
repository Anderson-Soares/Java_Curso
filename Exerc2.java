import java.util.Scanner;
public class Exerc2 {
    public static void main (String arg[]) {
        int area,lado,base,altura,raio,diagonal;
        Scanner teclado = new Scanner(System.in);
        //System.out.println("Insira o valor da area: ");
        //area = teclado.nextInt();
        System.out.println("Insira o valor do lado: ");
        lado = teclado.nextInt();
        System.out.println("Insira o valor da base: ");
        base = teclado.nextInt();
        System.out.println("Insira o valor da altura: ");
        altura = teclado.nextInt();
        System.out.println("Insira o valor do raio: ");
        raio = teclado.nextInt();
        System.out.println("Insira o valor da diagonal1: ");
        diagonal1 = teclado.nextInt();
        System.out.println("Insira o valor da diagonal2: ");
        diagonal2 = teclado.nextInt();

        area = lado * lado;
        System.out.println("A area do quadrado e: " + area);

        area = base * altura;
        System.out.println("A area do retangulo e: " + area);

        area = (base * altura)/2;
        System.out.println("A area do triangulo e: " + area);

        float pi = 3.14f;
        float volumeCilindro = pi * raio * raio * altura;
        System.out.println("O volume e: " + volumeCilindro);

        float losango = diagonal1 * diagonal2;
        System.out.println("A area do losango e: " + losango);
    }
}