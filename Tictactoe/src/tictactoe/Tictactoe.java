/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;
/**
 *
 * @author Md.Farhan Hamid
 * simple network based TicTacToe game
 */
public class Tictactoe extends JFrame {

    /**
     * @param args the command line arguments
     */
    JPanel j = new JPanel();
    XOButtons buttons[]=new XOButtons[9];
    public static void main(String[] args) {
        // TODO code application logic here
        new Tictactoe();

    }
    /*
     * default constructor
     */
    public Tictactoe() {
        super("TicTactoe");
        
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        j.setLayout(new GridLayout(3, 3));
        for(int i=0;i<9;i++) {
            buttons[i]=new XOButtons();
            j.add(buttons[i]);
        }
        add(j);
        setVisible(true);
        
    }
}
