import java.util.Scanner;
public class Exerc20 {
    public static void main (String arg[]) {
        float altura;
        String sexo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu gênero, insira M para masculino e F para feminino: ");
        sexo = entrada.nextString();

        System.out.println("Insira a sua altura: ");
        altura = entrada.nextFloat();

        if (sexo == "masculino" ) {
            System.out.println("vc e homem");
        }
        else {
            System.out.println("vc e mulher");
        }
    }
}