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
public abstract class Transporte {
    public String Nome;
    public String Origem;
    public String Destino;
    
    public abstract void entrega();
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getNome() {
        System.out.println("Nome");
        return Nome;
    }
    
    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }
    
    public String getOrigem() {
        return Origem;
    }
    
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
    public String getDestino() {
        return Destino;
    }
}
