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
public  class PessoaFisica implements IPessoa {

    private String nome;
    private String cpf;
    private Enum sexo;
    private Endereco endereco;
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEndereco() {
        return this.endereco.toString();
    }

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Enum getSexo() {
        return sexo;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
