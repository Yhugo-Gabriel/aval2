/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import atendimento.Atendimento;
import java.util.List;
/**
 *
 * @author yhugo gabriel
 */
public class Cliente extends PessoaFisica {
    private final List<Atendimento> atendimentos;

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public Cliente(String nome, String cpf, List<Atendimento> atendimentos) {
        super(nome, cpf);
        this.atendimentos = atendimentos;
    }

}
