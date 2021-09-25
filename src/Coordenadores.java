import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios{

    private int professoresSupervisionados;

    public Coordenadores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, int professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void aumentaSalario() {
        super.aumentaSalario(0.05) ;
    }

    public void adicionaProfessor(String professorAdicionado){
        List<String> professoresSupervisionados = new ArrayList<>();
        professoresSupervisionados.add(professorAdicionado);
    }


}
