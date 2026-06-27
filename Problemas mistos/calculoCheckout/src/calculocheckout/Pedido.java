/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculocheckout;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Royal
 */
public class Pedido {

    private final String pedidoId;
    private final List<String> items;
    private final double subtotal;
    private final double totalimposto;
    
    private final ICMS taxa;

    private Pedido(Builder builder) {
        this.pedidoId = builder.pedidoId;
        this.items = builder.items;
        this.subtotal = builder.subtotal;
        this.taxa = builder.taxa;
        
        this.totalimposto = this.taxa.calculoTaxa(this.subtotal);
    }

 
    public String getpedidoId() {
        return pedidoId; 
    }
    public double getSubtotal() {
        return subtotal; 
    }
    public double gettotalimposto() {
        return totalimposto; 
    }
    public double getTotal() {
        return subtotal + totalimposto; 
    }


    public static class Builder {
        private String pedidoId;
        private List<String> items = new ArrayList<>();
        private double subtotal = 0.0;
        private ICMS taxa; 

        public Builder(String pedidoId) {
            this.pedidoId = pedidoId;
        }

        public Builder adicionarItem(String item, double preco) {
            this.items.add(item);
            this.subtotal += preco;
            return this;
        }


        public Builder Juncao(ICMS taxa) {
            this.taxa = taxa;
            return this;
        }

        public Pedido build() {
            if (items.isEmpty()) {
                throw new IllegalStateException("Não é possível fechar um pedido sem itens.");
            }
            if (taxa== null) {
                throw new IllegalStateException("Uma estratégia de tributação deve ser definida.");
            }
            return new Pedido(this);
        }
    }
}
