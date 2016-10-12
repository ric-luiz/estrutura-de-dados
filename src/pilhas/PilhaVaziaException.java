/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author ric_l
 */
public class PilhaVaziaException extends RuntimeException{

    public PilhaVaziaException() {
        super("A pilha esta vazia coleguinha");
    }
    
}
