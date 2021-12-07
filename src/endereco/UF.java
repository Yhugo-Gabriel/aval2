/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endereco;

/**
 *
 * @author yhugo gabriel
 */
public class UF {
    private String sigla;
    private String descricao;

    public String getSigla() {
        return sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UF(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }
  
}
