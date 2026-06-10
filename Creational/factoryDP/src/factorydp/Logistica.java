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
public abstract class Logistica {
    abstract public Transporte criarTransporte();
    
    public void planejarEntrega() {
        Transporte t = criarTransporte();
    }
}
