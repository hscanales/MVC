/*
 * 
 * 
 * 
 */
package mvcpattern;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class GUI extends JPanel implements iView {

    private iController controlador;
    private int WIDTH = 300, HEIGHT = 300;
    private int widthTF = 120, heightTF = 80;
    private int widthBT = 60, heightBT = widthBT / 2;
    JButton button;
    JTextField textField1;

    public GUI() {
        button = new JButton("Incrementar");
        textField1 = new JTextField();
        textField1.setBounds(WIDTH / 3, HEIGHT * 2 / 3, widthTF, heightTF);
        button.setBounds(WIDTH / 3, HEIGHT / 3 - 100, widthBT * 2, heightBT);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controlador != null) {
                    if (textField1.getText().equals("")) {
                        controlador.incValue();

                    } else {
                        controlador.setModelValue(Integer.parseInt(textField1.getText()));

                        controlador.incValue();
                    }

                } else {
                    textField1.setText("controlador nul!!");
                }

            }
        });
        textField1.setEditable(true);
        add(button);
        add(textField1);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void setController(iController controller) {
        this.controlador = controller;
    }

    @Override
    public void setValue(String s) {
        textField1.setText(s);
    }

}
