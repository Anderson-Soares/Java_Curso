public class PessoaTeste {
    public static void main (String args[]) {
        Pessoa p1, p2, p3;

        p1 = new Pessoa("Anderson", "Soares", 28, 'M');
        p2 = new Pessoa("Fernanda", "Rizzi", 25, 'F');
        p3 = new Pessoa("Hilqueslei", "Soares", 32, 'M');

        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        System.out.println(p3.imprimir());
    }
}