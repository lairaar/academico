/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author 20171TIIMI0173
 */
public class Avaliacao {
    private int avaliação;
    private double nota;
    private Aluno aluno;
    private Turma turma;

    public Avaliacao(int avaliação, double nota, Aluno aluno, Turma turma) {
        this.avaliação = avaliação;
        this.nota = nota;
        this.aluno = aluno;
        this.turma = turma;
    }

    public int getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(int avaliação) {
        this.avaliação = avaliação;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
}
