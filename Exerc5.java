import java.util.Scanner;
public class Exerc5 {
    public static void main (String arg[]) {
    float tempo,velocidadeMedia,distancia,litros;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Insira o tempo");
    tempo = teclado.nextFloat();
    System.out.println("Insira a velocidade media");
    velocidadeMedia = teclado.nextFloat();

    distancia = velocidadeMedia * tempo;
    litros = distancia / 12;
    System.out.printf("Foram consumidos %.3f litros de combustivel \n",litros);
}
}