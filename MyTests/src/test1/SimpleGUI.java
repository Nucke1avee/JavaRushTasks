package test1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField inputX = new JTextField("", 5);
    private JTextField inputY = new JTextField("", 5);
    private JLabel labelX = new JLabel("X = ");
    private JLabel labelY = new JLabel("Y = ");
    //private JRadioButton radio1 = new JRadioButton("Select this:");
    //private JRadioButton radio2 = new JRadioButton("Select that:");
    //private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(labelX);
        container.add(inputX);
        container.add(labelY);
        container.add(inputY);

        ButtonGroup group = new ButtonGroup();
        //group.add(radio1);
        //group.add(radio2);
        //container.add(radio1);
        //radio1.setSelected(true);
        //container.add(radio2);
        //container.add(check);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            try {
                double output = Double.parseDouble(inputX.getText()) / Double.parseDouble(inputY.getText());
                message = "Z = " + output;
            } catch (Exception q) {
                message = "Error";
            }

            //message += "Button was pressed\n";
            //message += "Text is " + input.getText() + "\n";
            //message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
            //message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
