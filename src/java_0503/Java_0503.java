
package java_0503;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0503 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cpf = JOptionPane.showInputDialog(null, "Informe seu CPF (só números):");
        
        JOptionPane.showMessageDialog(null, cpf.substring(0, 3) + "." + cpf.substring(3, 6) + 
                "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }
    
}
