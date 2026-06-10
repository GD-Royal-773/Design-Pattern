/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdp;

import java.util.ArrayList;

/**
 *
 * @author Royal
 */
public class NotificacaoBuilder {
    
    public static void notificacao(notificacaoBuilder notificacaoBuilder){
        
    };
    
    static class notificacaoBuilder{
        private String Destinatario ;
        private String Titulo ;
        private String Conteudo ;
        private ArrayList<String> Canais = new ArrayList<>();

      
        
        
        public ArrayList<String> getCanais() {
            return Canais;
        }
        
        public String getConteudo() {
            return Conteudo;
        }

        public String getDestinatario() {
            return Destinatario;
        }

        public String getTitulo() {
            return Titulo;
        }

        
        
        public void setCanais(ArrayList<String> Canais) {
            this.Canais = Canais;
        }

        public void setConteudo(String Conteudo) {
            this.Conteudo = Conteudo;
        }

        public void setDestinatario(String Destinatario) {
            this.Destinatario = Destinatario;
        }

        public void setTitulo(String Titulo) {
            this.Titulo = Titulo;
        }
        
        
        
    };
}
