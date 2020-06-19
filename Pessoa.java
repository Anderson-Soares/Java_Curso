public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;

    public Pessoa(String no, String so, int id, char se) {
        nome = no;
        sobrenome = so;
        idade = id;
        sexo = se;
    }
    public void setNome(String no) {
        nome = no;
    }
    public String getNome() {
        return nome;
    }
    public void setSobrenome(String so) {
        sobrenome = so;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setIdade(int id) {
        idade = id;
    }
    public int getIdade() {
        return idade;
    }
    public void setSexo(char se) {
        sexo = se;
    }
    public char getSexo() {
        return sexo;
    }
    public String imprimir() {
        return nome + " " + sobrenome + " " + idade + " " + sexo;
    }
}