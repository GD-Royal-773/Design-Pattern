/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdp;

/**
 *
 * @author Royal
 */
public class BuilderDP {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Notificacao notificacaoUrgente = new Notificacao.Builder()
            .setDestinatario("joao@email.com")
            .setTitulo("Alerta de Segurança")
            .setConteudo("Detectamos um novo acesso à sua conta.")
            .addCanal("EMAIL")
            .addCanal("PUSH")
            .build();
            
        System.out.println("Destinatário: " + notificacaoUrgente.getDestinatario());
        System.out.println("Título: " + notificacaoUrgente.getTitulo());
    }
}
    
