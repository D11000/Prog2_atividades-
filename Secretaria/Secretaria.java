import java.util.ArrayList;
import java.util.Scanner;

public class Secretaria {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Matricula> matriculas = new ArrayList<>();
    private int proximoCodigoAluno = 1;

    public void executar() {
        Scanner in = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n=== SECRETARIA VIRTUAL ===");
            System.out.println("1) Cadastrar disciplina");
            System.out.println("2) Cadastrar aluno");
            System.out.println("3) Matricular aluno");
            System.out.println("4) Lançar notas");
            System.out.println("5) Mostrar boletim");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            opcao = in.nextInt();
            in.nextLine(); // limpar buffer

            switch (opcao) {
                case 1: cadastrarDisciplina(in); break;
                case 2: cadastrarAluno(in); break;
                case 3: matricularAluno(in); break;
                case 4: lancarNotas(in); break;
                case 5: mostrarBoletim(in); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void cadastrarDisciplina(Scanner in) {
        System.out.print("Código da disciplina: ");
        String codigo = in.nextLine();

        // Verifica código duplicado
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                System.out.println("Já existe uma disciplina com esse código!");
                return;
            }
        }

        System.out.print("Nome da disciplina: ");
        String nome = in.nextLine();
        System.out.print("Carga horária: ");
        int carga = in.nextInt();
        in.nextLine();

        disciplinas.add(new Disciplina(codigo, nome, carga));
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    private void cadastrarAluno(Scanner in) {
        System.out.print("Nome do aluno: ");
        String nome = in.nextLine();
        alunos.add(new Aluno(proximoCodigoAluno, nome));
        System.out.println("Aluno cadastrado com código: " + proximoCodigoAluno);
        proximoCodigoAluno++;
    }

    private void matricularAluno(Scanner in) {
        System.out.print("Código do aluno: ");
        int codAluno = in.nextInt();
        in.nextLine();

        Aluno aluno = buscarAluno(codAluno);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Código da disciplina: ");
        String codDisc = in.nextLine();

        Disciplina disc = buscarDisciplina(codDisc);
        if (disc == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        System.out.print("Ano letivo: ");
        int ano = in.nextInt();
        System.out.print("Série: ");
        int serie = in.nextInt();
        in.nextLine();

        // Evita matrícula duplicada
        for (Matricula m : matriculas) {
            if (m.getAluno() == aluno && m.getDisciplina() == disc && m.getAnoLetivo() == ano) {
                System.out.println("Este aluno já está matriculado nesta disciplina neste ano.");
                return;
            }
        }

        matriculas.add(new Matricula(ano, serie, aluno, disc));
        System.out.println("Matrícula realizada com sucesso!");
    }

    private void lancarNotas(Scanner in) {
        System.out.print("Código do aluno: ");
        int codAluno = in.nextInt();
        in.nextLine();
        System.out.print("Código da disciplina: ");
        String codDisc = in.nextLine();
        System.out.print("Ano letivo: ");
        int ano = in.nextInt();
        System.out.print("Bimestre (1-4): ");
        int bim = in.nextInt();
        System.out.print("Nota: ");
        double nota = in.nextDouble();

        Matricula mat = buscarMatricula(codAluno, codDisc, ano);
        if (mat == null) {
            System.out.println("Matrícula inválida!");
            return;
        }
        mat.setNota(bim, nota);
        System.out.println("Nota lançada com sucesso!");
    }

    private void mostrarBoletim(Scanner in) {
        System.out.print("Código do aluno: ");
        int codAluno = in.nextInt();
        in.nextLine();
        System.out.print("Ano letivo: ");
        int ano = in.nextInt();

        boolean encontrou = false;
        for (Matricula m : matriculas) {
            if (m.getAluno().getCodigo() == codAluno && m.getAnoLetivo() == ano) {
                System.out.println("\n=== BOLETIM ===");
                System.out.println(m);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Matrícula inválida!");
        }
    }

    private Aluno buscarAluno(int codigo) {
        for (Aluno a : alunos)
            if (a.getCodigo() == codigo)
                return a;
        return null;
    }

    private Disciplina buscarDisciplina(String codigo) {
        for (Disciplina d : disciplinas)
            if (d.getCodigo().equals(codigo))
                return d;
        return null;
    }

    private Matricula buscarMatricula(int codAluno, String codDisc, int ano) {
        for (Matricula m : matriculas)
            if (m.getAluno().getCodigo() == codAluno &&
                m.getDisciplina().getCodigo().equals(codDisc) &&
                m.getAnoLetivo() == ano)
                return m;
        return null;
    }
}
