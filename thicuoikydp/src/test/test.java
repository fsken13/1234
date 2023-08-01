package test;

import javax.swing.SwingUtilities;
import presentationlayer.View.vietnamGUI;
import presentationlayer.View.nuocngoaiGUI;

public abstract class test {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new nuocngoaiGUI().setVisible(true);
	            }
	        });
	}

}
