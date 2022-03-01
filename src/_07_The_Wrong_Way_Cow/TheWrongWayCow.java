/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.Arrays;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		char c = 'c';
		char o = 'o';
		char w = 'w';

		int north = 0;
		int west = 0;
		int south = 0;
		int east = 0;

		int[] lastNorth = new int[2];
		int[] lastSouth = new int[2];
		int[] lastWest = new int[2];
		int[] lastEast = new int[2];

		int[] Finale = new int[2];

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {

				if (field[i][j] == c) {

					
					if (i <= field.length - 1 - 2) {
						if (field[i + 1][j] == o) {
							if (field[i + 2][j] == w) {
								west++;
								lastWest = new int[] { j, i };
							}
						}
					}
					
				
						if (i >= 2) {
						if (field[i - 1][j] == o) {

							if (field[i - 2][j] == w) {
								east++;
								lastEast = new int[] { j, i };
							}
						}
						}
					
					if (j <= field[i].length - 1 - 2) {
						if (field[i][j + 1] == o) {

							if (field[i][j + 2] == w) {
								north++;
								lastNorth = new int[] { i, j };
							}

						}
					}
					if (j >= 2) {
						if (field[i][j - 1] == o) {

							if (field[i][j - 2] == w) {
								south++;
								lastSouth = new int[] { i, j };
							}

						}

					}
				}
			}
		}
		System.out.println(north);
		if (west == 1) {
			Finale = lastWest;
		}
		if (east == 1) {
			Finale = lastEast;
		}
		if (north == 1) {
			Finale = lastNorth;
		}
		if (south == 1) {
			Finale = lastSouth;
		}
		System.out.println(Arrays.toString(Finale));
		return Finale;
	}
}
