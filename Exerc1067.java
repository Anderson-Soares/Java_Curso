import java.util.Scanner;
public class Exerc1067 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int num;
        int cont = 1;

        num = input.nextInt();
    
        if (num >= 1 && num <= 1000) {
            while (cont <= num) {
                if (cont % 2 != 0) {
                System.out.println(cont);
                }
                cont++;
            }
        }
    }
}