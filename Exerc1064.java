import java.util.Scanner;
public class Exerc1064 {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);
        float num;
        int quantidade = 0;
        float media = 0;
        float soma = 0;

        for (int i = 1; i <= 6; i++) {
            num = entrada.nextFloat();
            if (num > 0) {
                quantidade = quantidade + 1;
                soma = soma + num;
            }
        }
        System.out.println(quantidade + " valores positivos");
        media = soma / quantidade;
        System.out.printf("%.1f\n",media);
    }
}