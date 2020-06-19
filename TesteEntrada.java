import java.util.Scanner;
public class TesteEntrada {
    public static void main( String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        System.out.println("O valor de a: " + a);
        System.out.println("O valor de b: " + b);
        System.out.println("O valor de c: " + c);

        double d = teclado.nextDouble();

        System.out.println("O valor de d: " + d);
    }
}