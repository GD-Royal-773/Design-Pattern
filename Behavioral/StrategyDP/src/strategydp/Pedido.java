/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategydp;

/**
 *
 * @author Royal
 */
public class Pedido {
    private double peso;
    private EstrategiaFrete tipoFrete;

    public Pedido(double peso) {
        this.peso = peso;
    }

    // Aqui permitimos mudar a estratégia em tempo de execução
    public void setTipoFrete(EstrategiaFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public double calcularTotalFrete() {
        if (tipoFrete == null) {
            throw new IllegalStateException("Selecione um tipo de frete!");
        }
        return tipoFrete.calcular(peso);
    }
}
