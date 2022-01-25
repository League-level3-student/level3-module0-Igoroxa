package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robs = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		int position = 75;
		for (int i = 0; i < robs.length; i++) {
			robs[i].setAngle(0);
			robs[i].setX(position);
			robs[i].setY(550);
			robs[i].setSpeed(25);
			position = position + 175;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random ran = new Random();
		for (int i = 0; i < robs.length; i++) {
			int amount = ran.nextInt(50);

			robs[i].move(amount);
		}
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.
			boolean progress = true;

			while (progress) {
				for (int y = 0; y < robs.length; y++) {
					robs[y].move(ran.nextInt(50));

					if (robs[y].getY() < 0) {
						progress = false;
						JOptionPane.showMessageDialog(null, "Robot " + (y + 1) + " won the game!");
						break;

					
				}
			}
		}
	}
}

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
