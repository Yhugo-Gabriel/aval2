/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endereco;

import endereco.Cidade;

/**
 *
 * @author yhugo gabriel
 */
public class Endereco {
    private Cidade cidade;
    private String logradouro;
    private Integer numero;
    private String cep;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco(" + "cidade: " + cidade + ", logradouro: " + logradouro + ", numero:" + numero + ", cep:" + cep + ')';
    }

    public Endereco(Cidade cidade, String logradouro, Integer numero, String cep) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

}
