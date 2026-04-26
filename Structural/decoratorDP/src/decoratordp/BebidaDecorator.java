/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordp;

/**
 *
 * @author Royal
 */
public abstract class BebidaDecorator implements Bebida{
    protected Bebida bebidaPlus; // protected para os filhos acessarem
    
    public BebidaDecorator(Bebida bebida) {
        this.bebidaPlus = bebida;
    }
    

    @Override
    public String getDescricao() {
        return bebidaPlus.getDescricao(); 
    }

    @Override
    public double getPreco() {
        return bebidaPlus.getPreco(); 
    }
    
}
