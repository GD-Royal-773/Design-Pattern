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
public class Notificacao {

    private final String destinatario;
    private final String titulo;
    private final String conteudo;
    private final ArrayList<String> canais;


    private Notificacao(Builder builder) {
        this.destinatario = builder.destinatario;
        this.titulo = builder.titulo;
        this.conteudo = builder.conteudo;
        this.canais = builder.canais;
    }


    public String getDestinatario() { 
        return destinatario; 
    }
    public String getTitulo() {
        return titulo; 
    }
    public String getConteudo() {
        return conteudo; 
    }
    public ArrayList<String> getCanais() { 
        return canais; 
    }


    public static class Builder {
        private String destinatario;
        private String titulo;
        private String conteudo;
        private ArrayList<String> canais = new ArrayList<>();


        public Builder setDestinatario(String destinatario) {
            this.destinatario = destinatario;
            return this; 
        }

        public Builder setTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder setConteudo(String conteudo) {
            this.conteudo = conteudo;
            return this;
        }

        public Builder addCanal(String canal) {
            this.canais.add(canal);
            return this;
        }


        public Notificacao build() {

            return new Notificacao(this);
        }
    }
}
    
    

