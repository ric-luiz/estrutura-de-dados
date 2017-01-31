package hashTable;

import java.util.Arrays;

/**
 *
 * @author ric_l
 */
public class HashTable {

    private String[] theArray;
    private int arraySize;
    private int itemArray = 0;

    public HashTable(int size) {
        this.arraySize = size;
        this.theArray = new String[size];
        Arrays.fill(this.theArray, "-1");
    }

    public void hashFunction(String[] stringForArray, String[] theArray) throws Exception {                        
        for (int i = 0; i < stringForArray.length; i++) {
            String novoElementoValor = stringForArray[i];            
            int arrayIndex = Integer.parseInt(novoElementoValor)% (this.arraySize-1);
            int contador = 0;
            
            System.out.println("Modulo index= "+ arrayIndex + " para Valor "+novoElementoValor);
            
            while(this.theArray[arrayIndex] != "-1" && this.theArray[arrayIndex] != "-2"){
                
                if(contador >= this.arraySize){
                    throw new Exception("Array Cheio... não tem espaço pra adicionar "+novoElementoValor);
                }
                
                arrayIndex++;
                contador++;                
                System.out.println("Colisão em "+ arrayIndex);                
                arrayIndex %= this.arraySize;
                
            }
            
            theArray[arrayIndex] = novoElementoValor;            
        }
    }
    
    public String findKey(String key){
        int arrayIndex = Integer.parseInt(key)%(this.arraySize-1);
        int contador = 0;
        
        while(this.theArray[arrayIndex] != "-1" && this.theArray[arrayIndex] != "-2"){
            if(this.theArray[arrayIndex] == key){
                System.out.println(key + " foi encontrado no index "+arrayIndex);
                return this.theArray[arrayIndex];
            }
            arrayIndex++;
            contador++;            
            arrayIndex %= this.arraySize;
           
           if(contador >= this.arraySize){
               break;
           }
        }
        
        return null;
        
    }
    
    public void addString(String valor) throws Exception{                       
        int arrayIndex = Integer.parseInt(valor)%(this.arraySize-1);
        int contador = 0;
            
            System.out.println("Modulo index= "+ arrayIndex + " para Valor "+valor);
            
            while(this.theArray[arrayIndex] != "-1" && this.theArray[arrayIndex] != "-2"){
                
                if(contador >= this.arraySize){
                    throw new Exception("Array Cheio... não tem espaço pra adicionar "+valor);
                }
                
                arrayIndex++;
                contador++;                
                System.out.println("Colisão em "+ arrayIndex);                
                arrayIndex %= this.arraySize;
                
            }
            
            theArray[arrayIndex] = valor;
    }
    
    public void deleteString(String valor){
        int arrayIndex = Integer.parseInt(valor)%(this.arraySize-1);
        int contador = 0;
        
        while(this.theArray[arrayIndex] != "-2"){
            if(this.theArray[arrayIndex] == valor){
                System.out.println(valor + " foi deletada no index "+arrayIndex);
                this.theArray[arrayIndex] = "-2";
            }
            arrayIndex++;
            contador++;            
            arrayIndex %= this.arraySize;
           
           if(contador >= this.arraySize){
               break;
           }
        }
    }
    
    public void displayTheStack() {
        int increment = 0;
        for (int m = 0; m < 3; m++) {
            increment += 10;
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
            for (int n = increment - 10; n < increment; n++) {
                System.out.format("| %3s " + " ", n);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
            for (int n = increment - 10; n < increment; n++) {
                if (theArray[n].equals("-1")) {
                    System.out.print("|      ");
                } else {
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
                }
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public String[] getTheArray() {
        return theArray;
    }
        
}
