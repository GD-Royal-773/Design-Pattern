/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdp;

/**
 *
 * @author Royal
 */
public class ObserverDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loja americanas = new Loja();
        
        Clientes cliente1 = new Clientes();
        Clientes cliente2 = new Clientes();
        
        cliente1.setNome("fudido");
        cliente2.setNome("rodado");

        cliente1.inscreverNaLoja(americanas);
        americanas.adicionarClientes(cliente2);
        
        // 4. MUDANÇA DE ESTADO (Isso dispara as notificações)
        System.out.println("--- Alterando produto na loja ---");
        americanas.setProduto("Trinta e Oito (38)");
    }
    
}
