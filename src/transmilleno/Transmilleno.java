/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmilleno;

import javax.swing.JFrame;

/**
 *
 * @author familia
 */
public class Transmilleno extends JFrame {
    
    
    private void initUI(){
        add(new Board());
        setSize(1362,768);
        setTitle("Transmilleno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public Transmilleno(){
        initUI();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transmilleno ex = new Transmilleno();
        ex.setVisible(true);
    }


}
