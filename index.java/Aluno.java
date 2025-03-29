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
public class Aluno extends Pessoa{
    private String matricula;

public Aluno(String matricula, String Nome, String Telefone) {
    super(Nome, Telefone);
    this.matricula = matricula;
}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

}
