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
public class AdicionalChocolate extends BebidaDecorator{
    
    public AdicionalChocolate(Bebida b) { super(b); }
    
    @Override
    public String getDescricao() {
        return bebidaPlus.getDescricao() + "Chocolate"; 
    }
    

    @Override
    public double getPreco() {
        return bebidaPlus.getPreco() + 2.0 ; 
    }
}