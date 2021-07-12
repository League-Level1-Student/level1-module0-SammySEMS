package _01_methods._1_houses;

import java.awt.AWTException;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	static Robot rob = new Robot();
	static int small = 60;
	static int medium = 120;
	static int large = 250;

	public void run() {
		rob.moveTo(20, 450);
		rob.penDown();
		rob.setSpeed(6);
		String color = JOptionPane
				.showInputDialog("What color would you like to draw the houses with? Black? Red? Blue? Pink?");

		if (color.equalsIgnoreCase("black")) {
			rob.setPenColor(Color.black);
		}
		if (color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}
		if (color.equalsIgnoreCase("pink")) {
			rob.setPenColor(Color.pink);
		}

		for (int i = 0; i < 10; i++) {
			String size = JOptionPane.showInputDialog("Small, medium or large house?");
			
			drawHouse(size);
		}
	}

	static void drawHouse(String size) {
		if (size.equalsIgnoreCase("small")) {
			rob.move(small);
		} else if (size.equalsIgnoreCase("medium")) {
			rob.move(medium);

		} else {
			rob.move(large);
		}
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		if (size.equalsIgnoreCase("small")) {
			rob.move(small);
		} else if (size.equalsIgnoreCase("medium")) {
			rob.move(medium);

		} else {
			rob.move(large);
		}
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(25);
		rob.turn(-90);
	}

	static void drawFlatRoof() {

	}
//static void drawPointyRoof(String size) {
	//if (size.equalsIgnoreCase("small")) {
		//rob.move(small);
	//} else if (size.equalsIgnoreCase("medium")) {
	//	rob.move(medium);

	//} else {
		//rob.move(large);
//	}
	//rob.turn(45);
	//rob.move(25);
	//rob.turn(45);
	//rob.move(25);
//}
	// private void drawFlatRoof() {
	// // TODO Auto-generated method stub
	//
	// }
	// Check the recipe to find out what code to put here
}
