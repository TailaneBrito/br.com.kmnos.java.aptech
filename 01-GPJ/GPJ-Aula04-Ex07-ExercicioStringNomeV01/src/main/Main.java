/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        String nomeCompleto = "Tailane Nascimento de Brito";
        
        int nome = nomeCompleto.indexOf(" ");
        String nomeFinal = nomeCompleto.substring(0, nome);
        System.out.println(nomeFinal);
    }
}
