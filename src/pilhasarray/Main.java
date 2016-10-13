/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhasarray;

import java.util.Scanner;

/**
 *
 * @author ric_l
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha(2, 0);
        Scanner sc = new Scanner(System.in);
        int opcao=1;
        
        while(opcao!=0){
            System.out.println("Escolha a opção");
            System.out.println("1-inserir novo Item");
            System.out.println("2-pop na pilha");
            System.out.println("3-pegar primeiro elemento");
            System.out.println("4-tamanho da pilha");
            System.out.println("0-sair");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe o novo numero");
                    int n1 = sc.nextInt();
                    pilha.push(n1);
                    break;
                case 2:
                    System.out.println("O numero retirado foi: "+pilha.pop());
                    break;
                case 3:
                    System.out.println("O numero recuperado foi: "+pilha.top());
                    break;
                case 4:
                    System.out.println("O tamanho da pilha é: "+pilha.size());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
    
}
