
package clavealeatoria;

/**
 *
 * @author Hebrondev
 */
public class ClaveAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazClaveAleatoria().setVisible(true);
            }
        });
        
    }
    
}
