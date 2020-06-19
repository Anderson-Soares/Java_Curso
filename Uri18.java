import java.util.Scanner;
public class Uri18 {
    public static void main (String arg[]) {
        Scanner input = new Scanner(System.in);
        int N;
        int notaCem,notaCinco,notaCinquenta,notaDez,notaDois,notaUm,notaVinte;
        int resto;
        System.out.println("Insira um valor");
        N = input.nextInt();
        notaCem = N / 100;
        resto = N % 100;
        notaCinquenta = resto / 50;
        resto = resto % 50;
        notaVinte = resto / 20;
        resto = resto % 20;
        notaDez = resto / 10;
        resto = resto % 10;
        notaCinco = resto / 5;
        resto = resto % 5;
        notaDois = resto / 2;
        resto = resto % 2;
        notaUm = resto;

        System.out.println(N);
        System.out.println(notaCem + " nota(s) de R$ 100,00");
        System.out.println(notaCinquenta + " nota(s) de R$ 50,00");
        System.out.println(notaVinte + " nota(s) de R$ 20,00");
        System.out.println(notaDez + " nota(s) de R$ 10,00");
        System.out.println(notaCinco + " nota(s) de R$ 5,00");
        System.out.println(notaDois + " nota(s) de R$ 2,00");
        System.out.println(notaUm + " nota(s) de R$ 1,00");
       
    }
}