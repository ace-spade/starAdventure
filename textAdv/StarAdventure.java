

import java.io.Serializable;
import javax.swing.JFrame;

public class StarAdventure{

	public static void main(String[] args) throws InterruptedException{
			TextApp math = new TextApp();
			math.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			math.setSize(1920,1080);
			math.setVisible(true);
			JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			math.setContentPane(pane);
}
}