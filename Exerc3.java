import java.util.Scanner;
public class Exerc3 {
    public static void main (String arg[]) {
        float kw;
        float salarioMinimo;
        float valorConta;

        Scanner teclado = new Scanner(System.in);
        kw = teclado.nextInt();
        salarioMinimo = teclado.nextInt();
        valorConta = (kw/100)*(salarioMinimo/7);

        float valorKW = salarioMinimo/700;
        System.out.println("O valor por kW e: " + valorKW + " reais.");

        System.out.println("O valor da conta e: " + valorConta + " reais.");

        float valorComDesconto = valorConta * 0.9f;
        System.out.println("O valor da conta, com desconto de 10% e: " + valorComDesconto + " reais.");
    }
}