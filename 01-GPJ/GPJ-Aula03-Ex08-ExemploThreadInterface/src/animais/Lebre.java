/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Aluno
 */
public class Lebre implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println("Lebre " + i );
        }
    }
    
}
