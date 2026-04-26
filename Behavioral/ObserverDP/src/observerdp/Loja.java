package observerdp;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Royal
 */
public class Loja {
    private String Produto;
    private List<seilaporra> notificadores = new ArrayList();    

    
     public void adicionarClientes (seilaporra o) {
         notificadores.add(o); 
     }
    

    public void setProduto(String Produto) {
        this.Produto = Produto;
        notificarClientes();
    }



    private void notificarClientes() {
        for (seilaporra o : notificadores) {
            o.Atualizar(Produto);
        }
    }

    
}