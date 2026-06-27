/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculocheckout;

/**
 *
 * @author Royal
 */
public class CalculoCheckout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Pedido pedidoNacional = new Pedido.Builder("pedido-02")
            .adicionarItem("Monitor 24 polegadas", 300.00)
            .Juncao(new impostoNacional())
            .build();

        System.out.println("\n--- PEDIDO NACIONAL ---");
        System.out.println("Subtotal: $" + pedidoNacional.getSubtotal());
        System.out.println("Impostos: $" + pedidoNacional.getTotal());
        System.out.println("Total Geral: $" + pedidoNacional.getTotal());

            Pedido pedidoInternacional = new Pedido.Builder("pedido-01")
            .adicionarItem("bomba de Hidrogenio", 2500.00)
            .adicionarItem("Hub USB-C", 50.00)
            .Juncao(new impostoInternacional())
	    .build();

        System.out.println("--- PEDIDO INTERNACIONAL ---");
        System.out.println("Subtotal: $" + pedidoInternacional.getSubtotal());
        System.out.println("Impostos: $" + pedidoInternacional.getTotal());
        System.out.println("Total Geral: $" + pedidoInternacional.getTotal());
    }
}
    

