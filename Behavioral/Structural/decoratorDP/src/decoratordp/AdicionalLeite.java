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
public class AdicionalLeite extends BebidaDecorator{
    public AdicionalLeite(Bebida b) {
        super(b); 
    }

    @Override
    public String getDescricao() {
        return bebidaPlus.getDescricao() + ", Leite";
    }

    @Override
    public double getPreco() {
        return bebidaPlus.getPreco() + 1.5;
    }
}


