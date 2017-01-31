package hashTable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ric_l
 */
public class Main {
    public static void main(String args[]){        
        try {
            
            HashTable hashtable = new HashTable(30);
            String[] elementos = { "100", "510", "170", "214", "268", "398","235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321","400", "415", "450", "50", "660", "624"};                      
            hashtable.hashFunction(elementos, hashtable.getTheArray());            
            hashtable.displayTheStack();                        
            hashtable.deleteString("100");
            hashtable.displayTheStack();
            hashtable.addString("100");
            hashtable.displayTheStack();
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }
}
