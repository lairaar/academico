/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;
import java.util.ArrayList;

/**
 *
 * @author 20171TIIMI0173
 */
public class Turma {
    private int vagas;
    private int codigo;
    private String data;
    private int matriculados;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(int vagas, int codigo, String data, int matriculados, Professor professor, Disciplina disciplina, ArrayList<Aluno> alunos) {
        this.vagas = vagas;
        this.codigo = codigo;
        this.data = data;
        this.matriculados = matriculados;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = alunos;
    }
    

}
