package _03_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton hibutton = new JButton();
JButton hellobutton2 = new JButton();
JButton HIbutton3 = new JButton();

public void showButton() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(hibutton);
	panel.add(hellobutton2);
	panel.add(HIbutton3);
	frame.pack();
	hibutton.addActionListener(this);
	hellobutton2.addActionListener(this);
	HIbutton3.addActionListener(this);
	
	
	
}
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==hibutton) {
		JOptionPane.showMessageDialog(null, "hi");
	}
	else if (arg0.getSource()==hellobutton2) {
		JOptionPane.showMessageDialog(null, "hello");
	}
	else {
		JOptionPane.showMessageDialog(null, "HI");
	}
}
}
