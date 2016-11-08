package binarySearchTreeLinkedList;

/**
 *
 * @author ric_l
 */
public class BinaryTree {
    private Node root;    

    public BinaryTree() {
        this.root = null;
    }
    
    public void insert(int numero){
        //Cria o novo nó
        Node novoNode = new Node();
        novoNode.setNumero(numero);
        novoNode.setLeftChild(null);
        novoNode.setRightChild(null);
        novoNode.setFather(null);
        
        if(isEmpty()){ //Caso a arvore não tenha elementos ele é setado como o root da tree
            this.root = novoNode;
        } else {
            Node atual = root;
            Node parent = null;
            
            while(1==1){
                parent = atual;
                novoNode.setFather(atual); //Seta o pai do nó
                
                //indo para a parte esqueda da arvore
                if(novoNode.getNumero() < parent.getNumero()){                    
                    atual = atual.getLeftChild(); //Pega o filho da esquerda
                    
                    //Se chegou em um nó folha
                    if(atual == null){
                        parent.setLeftChild(novoNode);
                        break; //Sai do while caso tenha inserido o novo nó na arvore
                    }
                } else {    //Indo para a parte da direita da arvore
                    atual = atual.getRightChild();
                    
                    //se chegou num nó folha
                    if(atual == null){
                        parent.setRightChild(novoNode);
                        break;  //Sai do while caso tenha inserido o novo nó na arvore
                    }
                }
            }            
        }
    }
    
    public void remove(Node node){
        if(node == null){ //caso não exista na arvore
            System.out.println("Nó não existe na arvore");
        }else if(isExternal(node)){ //caso seja uma folha                                  
            if(!isRoot(node)){ //SOmente se a folha nao for a raiz
                Node pai = node.getFather();
                if(pai.getNumero() > node.getNumero()){
                    pai.setLeftChild(null);
                } else {
                    pai.setRightChild(null);
                }
            }
            node = null;
        } else if(node.getLeftChild() != null ^ node.getRightChild() != null){
            if(node.getRightChild() != null){ //Verifica se existe filho na direita de node
                //Verifica se node está na direita ou esquerda do seu pai
                if(node.equals(node.getFather().getRightChild())){
                    node.getFather().setRightChild(node.getRightChild()); //caso esteja na direita
                    node.getRightChild().setFather(node.getFather());
                    node = null;
                } else {
                    node.getFather().setLeftChild(node.getRightChild()); //caso esteja na esquerda
                    node.getRightChild().setFather(node.getFather());
                    node = null;
                }
                
            } else { //O node esta na esquerda de seu pai
                //Verifica se node está na direita ou esquerda do seu pai
                if(node.equals(node.getFather().getRightChild())){
                    node.getFather().setRightChild(node.getLeftChild()); //caso esteja na direita
                    node.getLeftChild().setFather(node.getFather());
                    node = null;
                } else {
                    node.getFather().setLeftChild(node.getLeftChild()); //caso esteja na esquerda
                    node.getLeftChild().setFather(node.getFather());
                    node = null;
                }
                
            }
        } else { //Caso o node cotenha 2 filhos
            Node filho = node.getLeftChild();            
            while(filho.getRightChild() != null){ //andamos ate chegar à um nó folha ou sem filhos a direita                
                filho = filho.getRightChild();
            }
            
            //caso ainda tenha filhos a esquerda
            if(filho.getLeftChild() != null){
                filho.getLeftChild().setFather(filho.getFather()); //Aponta do neto para o avo
                
                if(filho.getFather().getNumero() > filho.getLeftChild().getNumero()){
                    filho.getFather().setLeftChild(filho.getLeftChild());
                } else {
                    filho.getFather().setRightChild(filho.getLeftChild());
                }
            }
            
            //inserir a nova raiz da arvore ou subarvore
            node.setNumero(filho.getNumero());
            filho = null;
        }
    }
    
    public Node search(int numero){
        Node atual = root;        
        
        while(atual.getNumero() != numero){
            //ir para esquerda
            if(atual.getNumero() > numero){
                atual = atual.getLeftChild();
            } else { //ir para direita
                atual = atual.getRightChild();
            }
            
            //não encontrou o elemento
            if(atual == null){
                return null;
            }
        }
        
        return atual;
    }
    
    //Visita primeiro as raizes da arvore
    public void pre_order_travesia(Node root){
        if(root != null){
            System.out.println(root.getNumero());
            pre_order_travesia(root.getLeftChild());
            pre_order_travesia(root.getRightChild());
        }
    }
    
    //Visita primeiro os filhos da esquerda, raiz e depois os da direita
    public void in_order_travesia(Node root){
        if(root != null){
            in_order_travesia(root.getLeftChild());
            System.out.println(root.getNumero());
            in_order_travesia(root.getRightChild());
        }
    }
    
    //Visita primeiros os filhos da esquerda,direita e por ultimo as raizes
    public void pos_order_travessia(Node root){
        if(root != null){
            pos_order_travessia(root.getLeftChild());
            pos_order_travessia(root.getRightChild());
            System.out.println(root.getNumero());
        }
    }
    
    public boolean isEmpty(){
        return this.root == null;
    }
    
    public Node parent(Node node){
        return node.getFather();
    }
    
    public boolean isRoot(Node node){
        return node.getFather() == null;
    }
    
    public boolean isExternal(Node node){
        return node.getLeftChild()==null && node.getRightChild()==null;
    }
    
    public boolean isInternal(Node node){
        return node.getLeftChild()!=null || node.getRightChild()!=null;
    }
    
    //Profundidade da arvore
    public int depth(Node node){
        if(isRoot(node)){
            return 0;
        }else{
            return 1+depth(node.getFather());
        }
    }    
    
    //Altura da arvore passado um dado no
    public int altura(Node node){
        if(node == null)
            return -1;
        int he = altura(node.getLeftChild());
        int hd = altura(node.getRightChild());
        return Math.max(he, hd)+1;
    }
    
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
}
