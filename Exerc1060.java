import java.util.Scanner;
public class Exerc1060 {
    public static void main ( String args[]) {
        float num;
        Scanner entrada = new Scanner(System.in);
        int quantidade = 0;

        for (int cont=1; cont <=6; cont++) {
            num = entrada.nextFloat();
            if (num > 0) {
                quantidade = quantidade + 1;
            }
        }

        System.out.println(quantidade + " valores positivos");
    }
}