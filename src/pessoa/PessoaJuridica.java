/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import endereco.Endereco;

/**
 *
 * @author yhugo gabriel
 */
public class PessoaJuridica implements IPessoa {
    private String nome;
    private String cnpj;
    private Endereco endereco;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEndereco() {
        return this.endereco.toString();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PessoaJuridica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

}
