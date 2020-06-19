import java.util.Scanner;
public class Exerc4 {
    public static void main (String arg[]) {
        float horasTrabalhadas,valorHora,descontoINSS;

        Scanner teclado = new Scanner(System.in);
        horasTrabalhadas = teclado.nextFloat();
        valorHora = teclado.nextFloat();
        descontoINSS = teclado.nextFloat();

        float salarioBruto = horasTrabalhadas * valorHora;
        float salarioLiquido = salarioBruto * (1-descontoINSS);

        System.out.printf("O salario liquido da pessoa e: %.2f reais \n ",salarioLiquido);
    }
}