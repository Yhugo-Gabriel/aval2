/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endereco;

/**
 *
 * @author yhugo gabriel
 */
public class Cidade {
    private UF uf;
    private String nome;

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;  
    }

    public Cidade(UF uf, String nome) {
        this.uf = uf;
        this.nome = nome;
    }

}
