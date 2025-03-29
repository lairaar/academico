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
public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

public Disciplina(String nome, int codigo, ArrayList<Disciplina> disciplinas) {
    this.nome = nome;
    this.codigo = codigo;
    this.disciplinas = disciplinas;
}


    

}
