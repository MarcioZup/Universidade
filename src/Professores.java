public class Professores extends Funcionarios {

    private String nivelDeGraducao;
    private String disciplinaministrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;

    public Professores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraducao, String disciplinaministrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraducao = nivelDeGraducao;
        this.disciplinaministrada = disciplinaministrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public String getNivelDeGraducao() {
        return nivelDeGraducao;
    }

    public void setNivelDeGraducao(String nivelDeGraducao) {
        this.nivelDeGraducao = nivelDeGraducao;
    }

    public String getDisciplinaministrada() {
        return disciplinaministrada;
    }

    public void setDisciplinaministrada(String disciplinaministrada) {
        this.disciplinaministrada = disciplinaministrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
}
