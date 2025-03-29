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
public class Professor extends Pessoa{
    private String cpf;

public Professor(String cpf, String nome, String telefone) {
    super(nome, telefone);
    this.cpf = cpf;
}

public String getCpf() {
    return cpf;
    }

public void setCpf(String cpf) {
    this.cpf = cpf;
    }



}
