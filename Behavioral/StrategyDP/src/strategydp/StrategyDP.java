/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydp;

/**
 *
 * @author Royal
 */
public class StrategyDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido(2.5);

        // Cliente escolhe Sedex
        meuPedido.setTipoFrete(new FreteSedex());
        System.out.println("Valor Sedex: R$ " + meuPedido.calcularTotalFrete());

        // Cliente muda de ideia e escolhe Loggi
        meuPedido.setTipoFrete(new FreteLoggi());
        System.out.println("Valor Loggi: R$ " + meuPedido.calcularTotalFrete());
    }
    
}
