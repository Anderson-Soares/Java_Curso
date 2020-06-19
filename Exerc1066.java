import java.util.Scanner;
public class Exerc1066 {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int num, par, impar, pos, neg, cont;
        par = 0;
        impar = 0;
        pos = 0;
        neg = 0;

        for (cont = 1; cont <=5; cont++) {
            num = input.nextInt();
            if (num > 0) {
                pos = pos + 1;
            } else if (num < 0) {
                neg = neg + 1;
            } 
            if (num % 2 == 0) {
                par = par + 1;
            } else if (num % 2 != 0) {
                impar = impar + 1;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}