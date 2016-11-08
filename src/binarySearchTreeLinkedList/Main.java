package binarySearchTreeLinkedList;

import com.sun.jndi.toolkit.corba.CorbaUtils;

/**
 *
 * @author ric_l
 */
public class Main {
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.insert(10);
        tree.insert(4);
        tree.insert(7);
        tree.insert(5);
        tree.insert(1);
        tree.insert(15);
        tree.insert(14);
        tree.insert(12);
        tree.insert(20);
        tree.insert(0);
        
//        System.out.println("Encontrando o numero 5");
//        System.out.println(tree.search(5).getNumero()+"\n");
//        System.out.println("Fazendo a travessia in order...");
//        tree.in_order_travesia(tree.getRoot());        
//        System.out.println("\nFazendo a travessia pos-order...");
//        tree.pos_order_travessia(tree.getRoot());
        System.out.println("\nFazendo a travessia pre-order...");
        tree.pre_order_travesia(tree.getRoot());
//        System.out.println("Altura da arvore é: "+tree.altura(tree.getRoot()));
//        System.out.println("Profundidade da arvore a partir do no 0 é: "+tree.depth(tree.search(0)));
        tree.remove(tree.search(10));
        System.out.println("\nFazendo a travessia pre-order...");
        tree.pre_order_travesia(tree.getRoot());

    }
}
