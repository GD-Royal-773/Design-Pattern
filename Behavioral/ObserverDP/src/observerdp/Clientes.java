    package observerdp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Royal
 */
class Clientes implements seilaporra{
    private String Nome;
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }


    public void inscreverNaLoja(Loja loja) {
        loja.adicionarClientes(this);
    }

    @Override
    public void Atualizar(String produto) {
        System.out.println("Olá " + Nome + ", o produto " + produto + " já está disponível!");
    }



}
