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
public class FreteLoggi implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 12.0; // R$ 12 por kg sem taxa fixa
    }
}