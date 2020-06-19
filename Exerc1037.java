import java.util.Scanner;
public class Exerc1037 {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);
        float valor;
        valor = entrada.nextFloat();
        
        if (valor == 0) {
            System.out.println("Intervalo [0,25]");
        } else if (valor < 25.0f && valor > 0) {
            System.out.println("Intervalo (0,25]");
        }
         else if (valor == 25.0f) {
            System.out.println("Intervalo [25,50]");
        } 
        else if (valor < 50.0f && valor > 25.0f) {
            System.out.println("Intervalo (25,50]");
        } else if (valor == 50.0f) {
            System.out.println("Intervalo [50,75]");
        } else if (valor < 75.0f && valor > 50.0f) {
            System.out.println("Intervalo (50,75]");
        } else if (valor == 75.0f) {
            System.out.println("Intervalo [75,100]");
        } else if (valor < 100.0f && valor > 75.0f) {
            System.out.println("Intervalo (75,100]");
        } else if (valor == 100.0f) {
            System.out.println("Intervalo [75,100]");
        } else
            {
            System.out.println("Fora do intervalo");
        }
    }
}