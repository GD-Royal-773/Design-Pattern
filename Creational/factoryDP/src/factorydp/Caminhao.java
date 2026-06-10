/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydp;

/**
 *
 * @author Royal
 */
public class Caminhao extends Transporte {

    @Override
    public void entrega(){
        System.out.println("Produto entregue no cliente");
    }

    public void passarDaBlitz(){
        System.out.println("pagando propina");
    };
    
    public void ficarNaLiga(){
        System.out.println("bebendo rebite");
    };

}
