package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAccumulator extends JFrame {
    private JTextField textFieldInput;
    private JTextField textFieldOutput;
    private int sum = 0;
    public SwingAccumulator(){
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,2));
        container.add(new JLabel("Enter an Integer: "));
        textFieldInput = new JTextField(10);
        container.add(textFieldInput);
        textFieldInput.addActionListener(new TFInputListener());
        container.add(new JLabel("The Accumulator sum is: "));
        textFieldOutput = new JTextField(10);
        textFieldOutput.setEditable(false);
        container.add(textFieldOutput);
        setTitle("Swing Accumulator");
        setSize(350,120);
        setVisible(true);
    }
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int numberIn = Integer.parseInt(textFieldInput.getText());
            sum += numberIn;
            textFieldInput.setText("");
            textFieldOutput.setText(sum + "");
        }
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }
}
