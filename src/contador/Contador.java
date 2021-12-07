/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

/**
 *
 * @author yhugo gabriel
 */
public class Contador {
    public static Object getInstance(Contador contador){
       return contador.getClass();
    }
    public static Integer getProxNumero(Integer numero){
        return numero + 1;
    }

    public Contador() {
    }

}