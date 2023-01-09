package hust.soict.dsai.swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String button = e.getActionCommand();
		if(button.charAt(0)>='0' && button.charAt(0)<='9'){
			JTextField tfDisplay = null;
			tfDisplay.setText(tfDisplay.getText() + button);
		}
		else if (button.equals("DEL"))
		{
			
		}
		else
		{
			
		}
	}
}
