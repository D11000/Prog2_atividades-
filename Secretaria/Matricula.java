public class Matricula {
    private int anoLetivo;
    private int serie;
    private Aluno aluno;
    private Disciplina disciplina;
    private double notaB1;
    private double notaB2;
    private double notaB3;
    private double notaB4;

    public Matricula(int anoLetivo, int serie, Aluno aluno, Disciplina disciplina) {
        this.anoLetivo = anoLetivo;
        this.serie = serie;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.notaB1 = 0;
        this.notaB2 = 0;
        this.notaB3 = 0;
        this.notaB4 = 0;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setNota(int bimestre, double nota) {
        if (nota < 0 || nota > 25) {
            System.out.println("Nota inválida (0 a 25).");
            return;
        }

        switch (bimestre) {
            case 1: notaB1 = nota; break;
            case 2: notaB2 = nota; break;
            case 3: notaB3 = nota; break;
            case 4: notaB4 = nota; break;
            default: System.out.println("Bimestre inválido!");
        }
    }

    public double mediaFinal() {
        return notaB1 + notaB2 + notaB3 + notaB4;
    }

    public String toString() {
        return "Aluno: " + aluno.getNome() +
               "\nDisciplina: " + disciplina.getNome() +
               "\nAno: " + anoLetivo +
               "\nNotas: [" + notaB1 + ", " + notaB2 + ", " + notaB3 + ", " + notaB4 + "]" +
               "\nTotal: " + mediaFinal() + "/100\n";
    }
}
