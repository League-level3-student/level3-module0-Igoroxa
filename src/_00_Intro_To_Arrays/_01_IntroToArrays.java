package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] words = new String[5];

words[0] = "zero";
words[1] = "one";
words[2] = "two";
words[3] = "three";
words[4] = "four";
        // 2. print the third element in the array
System.out.println(words[3]);
        // 3. set the third element to a different value
words[3] = "new";
        // 4. print the third element again
System.out.println(words[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < words.length; i++) {
	words[i] = "newstring"; 
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < words.length; i++) {
	System.out.println(words[i]);
}
        // 7. make an array of 50 integers
Integer[] numbers = new Integer[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random ran = new Random();
for (int i = 0; i < numbers.length; i++) {
	int random = ran.nextInt();
	numbers[i] = random;
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
//int smallest = numbers[0];
//for (int i = 0; i < numbers.length; i++) {
//if (numbers[i] < smallest) {
//	numbers[i] = smallest;
//}
//System.out.println(smallest);
//}

        // 10 print the entire array to see if step 8 was correct
//for (int j = 0; j < numbers.length; j++) {
//	System.out.println(numbers[j]);
//}
        // 11. print the largest number in the array.
//int biggest = numbers[0];
//for (int i = 0; i < numbers.length; i++) {
//if (numbers[i] > biggest) {
//	numbers[i] = biggest;
//}
//System.out.println(biggest);
//}
        // 12. print only the last element in the array

System.out.println(numbers[49]);
    }
}
