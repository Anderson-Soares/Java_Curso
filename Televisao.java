public class Televisao {
    String marca;
    int tamanhoTela;
    int canal;
    int volume;
    boolean ligada;

    void ligar() {
        ligada = true;
        System.out.println("A TV " +marca + " esta ligada.");
    }
    void avancarCanal() {
        if (ligada == true) {
            canal++;
            System.out.println("A TV " +marca + " esta no canal" +canal);
        } else {
            System.out.println("A TV esta desligada, por favor, ligue a TV " +marca);
        }
    }
    void aumentarVolume() {
        if (ligada ==true) {
            volume++;
            System.out.println("Volume " +volume);
        } else {
            System.out.println("A TV esta desligada, por favor ligue a TV " +marca + " antes.");
        }
    }
    void diminuirVolume() {
        
    }
}