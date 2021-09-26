import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Coordenadores coordenador1 = new Coordenadores("Joao", "28682387859", 95, "SEDUC",3000, 1, 5);
        Professores professor1 = new Professores("José", "06612838442", 100, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        Professores professor2 = new Professores("José 1", "06612838442", 101, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        Professores professor3 = new Professores("José 2", "06612838442", 102, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        Professores professor4 = new Professores("José 3", "06612838442", 103, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        Professores professor5 = new Professores("José 4", "06612838442", 104, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        Professores professor6 = new Professores("José 5", "06612838442", 105, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        Professores professor7 = new Professores("José 5", "06612838442", 106, "SEDUC", 2500, "licensiatura", "Matemática", 30,2);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(100);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(101);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(102);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(103);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(104);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(105);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(106);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());









    }


}
