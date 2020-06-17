
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot oscar = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		String Bob = JOptionPane.showInputDialog("What color do you want?");
		if (Bob.equals("blue")) {
			oscar.setPenColor(Color.blue);
		}
		if (Bob.equals("red")) {
			oscar.setPenColor(Color.red);
		}
		if (Bob.equals("yellow")) {
			oscar.setPenColor(Color.yellow);
		}
		if (Bob.equals("green")) {
			oscar.setPenColor(Color.green);
		}

		oscar.setPenWidth(10);
		oscar.penDown();
		oscar.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			oscar.move(200);

			oscar.turn(90);

		}
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	}
}
