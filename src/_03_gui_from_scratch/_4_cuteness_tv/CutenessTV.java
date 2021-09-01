package _03_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Ducks");
	JButton button2 = new JButton("Frogs");
	JButton button3 = new JButton("Unicorns");
public void showButton() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==button) {
			showDucks();
		}
		else if (arg0.getSource()==button2) {
			showFrog();
		}
		else {
			showFluffyUnicorns();
		}
	}
		void showDucks() {
		
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	
		
	
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	
	void playVideo(String videoID) {
	JOptionPane.showMessageDialog(null, videoID);
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }  	
}}