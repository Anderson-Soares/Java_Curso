public class BibliotecaTeste {
    public static void main(String args[]) {
        Livro l1 = new Livro("Java 1", "Chuck", 1971, "ficcao", 2, 11);
        Livro l2 = new Livro("Java 2", "Pedro", 1951, "ficcao", 2, 11);
        Livro l3 = new Livro("Java 3", "Paulo", 1983, "ficcao", 2, 11);


        System.out.println(l1.status());
        System.out.println(l1.verificarLivro());
        l1.emprestar();
        System.out.println(l1.verificarLivro());
        System.out.println(l2.status());
        System.out.println(l3.status());
    }
}