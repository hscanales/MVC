/*
 * 
 * 
 * 
 */
package mvcpattern;

import javax.swing.JFrame;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class MVCPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI view = new GUI();
        iModel modelo= new incModel();
        incController controlador= new incController(view,modelo);
        //view.setController(controlador);
        
        JFrame ventana = new JFrame ("MVC PATTERN EXAMPLE");
        ventana.setContentPane(view);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        
    }
    
}
