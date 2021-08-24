package _03_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	int count =0;
	JButton button = new JButton();
public void showButton() {
	button.addActionListener(this);
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	button.setText("Suprise");

	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	frame.pack();
}
public void actionPerformed(ActionEvent arg0) {
	
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==button) {
	count++;
	System.out.println(count);
	if(count==5) {
		showPicture("jackInTheBox.png");
	}
	}
}



private void showPicture(String fileName) {
     try {
          JLabel imageLabel = createLabelImage(fileName);
          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(imageLabel);
          frame.setVisible(true);
          frame.pack();
     } catch (Exception e) {
          e.printStackTrace();
     }
}

private JLabel createLabelImage(String fileName) {
     try {
          java.net.URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
          } else {
               Icon icon = new ImageIcon(imageURL);
               JLabel imageLabel = new JLabel(icon);
               return imageLabel;
          }
     } catch (Exception e) {
          System.err.println("Could not find image " + fileName);
          return new JLabel();
     }
}















}
