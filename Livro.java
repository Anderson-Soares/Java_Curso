public class Livro {
    String titulo;
    String autor;
    int ano;
    String categoria;
    int estante;
    int prateleira;
    Boolean emprestado;

    public Livro(String titulo, String autor, int ano, String categoria, int estante, int prateleira) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        this.estante = estante;
        this.prateleira = prateleira;
        this.emprestado = false;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setCategoria(String categoria){
    this.categoria = categoria;
    }
    public void setEstante(int estante){
        this.estante = estante;
    }    
    public void setPrateleira(int prateleira){
        this.prateleira = prateleira;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return this.ano;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getEstante() {
        return estante;
    }
    public int getPrateleira() {
        return prateleira;
    }

    public String status() {
        return titulo + " do autor " + autor + ", ano " + ano + ", categoria " + categoria + " esta na estante " + estante + " " + prateleira;
    }
    public String verificarLivro() {
        if (emprestado == true) {
        return "O livro " + titulo + " esta emprestado";
        } else {
            return "O livro " + titulo + " nao esta emprestado";
        }
    }
    public String emprestar() {
        this.emprestado = true;
        return "Livro " + titulo + " emprestado com sucesso!"
        ;
    }
    public String devolver() {
        this.emprestado = false;
        return "Livro " + titulo + " devolvido com sucesso!";
    }

}