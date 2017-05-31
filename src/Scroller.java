import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Scroller extends JScrollPane{
	
	TextAreaPanel textArea;
	
	public Scroller(JPanel panel){
		
		setViewportView(panel);
		
		textArea = (TextAreaPanel)panel.getComponent(1);
		
	}

	public TextAreaPanel getTextArea(){
		
		return textArea;
		
	}
	
	public void setViewportView(TextAreaPanel c){
		
		super.setViewportView(c);
		
	}
	
	public void setViewportView(Component c){
		
		super.setViewportView(c);

	}


}