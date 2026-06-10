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
public class DecoratorDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Bebida meuCafe = new CafeSimples();
    
    // Adiciona Leite
    meuCafe = new AdicionalLeite(meuCafe);
    
    // Adiciona Chocolate
    meuCafe = new AdicionalChocolate(meuCafe);

    System.out.println("Pedido: " + meuCafe.getDescricao());
    System.out.println("Total: R$ " + meuCafe.getPreco());
        
    }
    
}
