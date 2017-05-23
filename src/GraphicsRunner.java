import javax.swing.SwingUtilities;

public class GraphicsRunner {

	public static void main(String[] args) {

		Editor editor = new Editor();
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				editor.runGraphics();
			}
		});

	}

}