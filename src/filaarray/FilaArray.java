/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaarray;

import java.util.Scanner;

/**
 *
 * @author ric_l
 */
public class FilaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila fila = new Fila(2, 0);
        Scanner sc = new Scanner(System.in);
        int opcao=1;
        int numero;
        
        while(opcao != 0){
            ui();
            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("Digite o numero para enfileira: ");
                    numero = sc.nextInt();
                    fila.enqueue(numero);
                    break;
                case 2:                    
                    try {
                        System.out.println("O numero desenfileirado é: "+fila.dequeue());
                    } catch (EFilaVazia e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:                    
                    try {
                        System.out.println("O numero na frente da fila é: "+fila.top());
                    } catch (EFilaVazia e) {
                         System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("O tamanho da Fila é: "+fila.size());
                    break;
                case 5:
                    fila.capacidade();
                    break;
                case 0:
                    System.exit(0);
                    break;                 
            }
        }
    }
    
    public static void ui(){
        System.out.println("Escolha a opção");
        System.out.println("1-Enfileirar Item");
        System.out.println("2-Desenfileirar Item");
        System.out.println("3-pegar primeiro elemento");
        System.out.println("4-tamanho da Fila");
        System.out.println("5-Tamanho capacidade Fila");
        System.out.println("0-sair");
    }
    
}
