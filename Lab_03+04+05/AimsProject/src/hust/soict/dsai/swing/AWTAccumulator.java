package hust.soict.dsai.swing;

import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;
public class AWTAccumulator extends Frame {
    private TextField textFieldInput;
    private TextField textFieldOutput;
    private int sum =0;
    public AWTAccumulator(){
        setLayout(new GridLayout(2,2));
        add(new Label("Enter an Integer"));
        textFieldInput = new TextField(10);
        add(textFieldInput);
        textFieldInput.addActionListener(new TFInputListener());
        add(new Label("The accumulated sum is: "));
        textFieldOutput = new TextField(10);
        textFieldOutput.setEditable(false);
        add(textFieldOutput);
        setTitle("AWT Accumulator");
        setSize(350,120);
        setVisible(true);
    }
    private class TFInputListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            int numberIn = Integer.parseInt(textFieldInput.getText());
            sum += numberIn;
            textFieldInput.setText("");
            textFieldOutput.setText(sum + "");
        }
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }
}
