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
public class Configuracao {
    private static Configuracao instancia;
    private String nomeApp;
    private String versao;

    // 1. Construtor Privado: Impede instanciação externa
    private Configuracao() {
        this.nomeApp = "Meu Sistema Java";
        this.versao = "1.0.0";
    }

    // 2. Método de Acesso: O único caminho para obter o objeto
    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
            System.out.println("--- Criando instância única de Configuração ---");
        }
        return instancia;
    }

    // Getters e Setters
    public String getNomeApp() { return nomeApp; }
    public void setNomeApp(String nomeApp) { this.nomeApp = nomeApp; }
}
