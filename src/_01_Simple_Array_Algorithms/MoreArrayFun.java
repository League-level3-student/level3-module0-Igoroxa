package _01_Simple_Array_Algorithms;

import java.lang.reflect.Array;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	
	public static String[] words = new String[5]; 
public static void main(String[] args) {
	
	
	words[0] = "first";
	words[1] = "second";
	words[2] = "third";
	words[3] = "fourth";
	words[4] = "fifth";
	print();
printReverse();
everyOther();
random();
}

    static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
void print() {
	for (int i = 0; i < words.length; i++) {
		System.out.println(words[i]);
	}
}


    static //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
void printReverse() {
	for (int i = 4; i < words.length; i--) {
		System.out.println(words[i]);
	}
}


    static //4. Write a method that takes an array of Strings and prints every other String in the array.
void everyOther() {
	for (int i = 0; i < words.length; i++) {
		int check = i%2;
		if (i%2 == 0) {
			System.out.println(words[i]);
		}
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
static void random() {
	Random ran = new Random();
	int[] randoms = new int[5];
	int ranfinal = ran.nextInt(5);
	for (int i = 0; i < randoms.length; i++) {
		
	}
}

}

