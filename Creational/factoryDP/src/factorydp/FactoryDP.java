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
public class FactoryDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logistica logistica = new LogisticaTerrestre(); 
    

        Transporte t = logistica.criarTransporte();
    
        t.setNome("Calça Quadrada");
        t.setOrigem("baixa da egua");
        t.setDestino("quinto dos inferno");
        
        

        System.out.println(t.Nome);
        System.out.println(t.Origem);
        System.out.println(t.Destino);
        
        if (t instanceof Caminhao) {
            ((Caminhao) t).ficarNaLiga();
            ((Caminhao) t).passarDaBlitz();
        }
        t.entrega();

                
                
               
        
    }
    
}
