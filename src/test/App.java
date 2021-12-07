/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import atendimento.Atendimento;
import contador.Contador;
import java.util.Date;
/**
 *
 * @author yhugo gabriel
 */
public class App {
    public static void main( String[] args ) {
        Contador contador = new Contador();
        System.out.println(Contador.getProxNumero(1));
        System.out.println(Contador.getInstance(contador));

        Atendimento atendimento = new Atendimento(new Date(), 117);
        atendimento.novaRequisicao("teste01");

        System.out.println(atendimento);
    }

}
