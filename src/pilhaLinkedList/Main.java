package pilhaLinkedList;

import java.util.Scanner;

/**
 *
 * @author ric_l
 */
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(null);
        Scanner sc = new Scanner(System.in);
        int opcao=1;
        
        while(opcao!=0){
            UI();
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe o novo numero");
                    int n1 = sc.nextInt();
                    pilha.push(n1);
                    break;
                case 2:
                    try {
                        System.out.println("O numero retirado foi: "+pilha.pop());
                    } catch (PilhaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("O numero recuperado foi: "+pilha.top());
                    } catch (PilhaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
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
    
    public static void UI(){
        System.out.println("Escolha a opção");
        System.out.println("1-inserir novo Item");
        System.out.println("2-pop na pilha");
        System.out.println("3-pegar primeiro elemento");
        System.out.println("4-tamanho da pilha");
        System.out.println("0-sair");
    }
}
