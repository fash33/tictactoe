/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author terranova
 */
public class XOButtons extends JButton implements ActionListener {

    ImageIcon X, O;
    int value;

    /*
     *  constructor
     */
    public XOButtons() {
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png"));
        addActionListener(this);

    }

    /*
     * overriding actionlistener interface 
     * 
     */
    public void actionPerformed(ActionEvent e) {
        value++;
        value = value % 3;

        switch (value) {
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }
    }
}
