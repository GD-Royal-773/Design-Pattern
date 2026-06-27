/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculocheckout;

/**
 *
 * @author Royal
 */
public class impostoInternacional implements ICMS{
    @Override
    public double calculoTaxa(double subtotal) {
        return (subtotal * 0.60) + 15.00;
    }
}
