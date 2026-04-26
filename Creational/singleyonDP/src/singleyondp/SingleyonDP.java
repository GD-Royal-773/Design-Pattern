/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleyondp;

/**
 *
 * @author Royal
 */
public class SingleyonDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Tentativa de criar novo objeto (ERRO DE COMPILAÇÃO)
        // Configuracao config = new Configuracao(); 

        // Forma correta
        Configuracao config1 = Configuracao.getInstance();
        System.out.println("App: " + config1.getNomeApp());

        // Pedindo a configuração em outro lugar do sistema
        Configuracao config2 = Configuracao.getInstance();
        config2.setNomeApp("Sistema Atualizado");

        // O config1 mudou? SIM! Porque config1 e config2 são o mesmo objeto.
        System.out.println("Nome no config1: " + config1.getNomeApp());

        // Prova real:
        if (config1 == config2) {
            System.out.println("As referências são idênticas na memória.");
        }
    }
    
}
