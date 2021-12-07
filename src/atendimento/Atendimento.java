/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atendimento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author yhugo gabriel
 */
public class Atendimento {
    private Date data;
    private Integer num;
 
    private List<Requisicoes> requisicoes;

    public void novaRequisicao(String nome) {
        this.requisicoes.add(new Requisicoes(nome));
    }
    
    public void fimAtendimento() {
        for (Requisicoes requisicao : this.requisicoes) {
            requisicao = null;
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getNumero() {
        return num;
    }

    public void setNumero(Integer numero) {
        this.num = numero;
    }

    public Atendimento(Date data, Integer numero) {
        this.data = data;
        this.num = numero;
        this.requisicoes = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return "Atendimento{" +"data:" + data + ", numero:" + num + ", requisicoes:" + requisicoes.stream().map(req -> String.valueOf(req.getNome())).collect(Collectors.toList()) +'}';
    }

}
