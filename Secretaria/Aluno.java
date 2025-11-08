public class Aluno {
    private int codigo;
    private String nome;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return codigo + " - " + nome;
    }
}
