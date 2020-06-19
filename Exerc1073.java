import java.util.Scanner;
public class Exerc1073 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int num;
        int quad;
        int cont = 1;

        num = input.nextInt();
    
        if (num >= 5 && num <= 2000) {
            while (cont <= num) {
                if (cont % 2 == 0) {
                    quad = cont * cont;
                System.out.println(cont + "^" + cont + " = " + quad);
                }
                cont++;
            }
        }
    }
}