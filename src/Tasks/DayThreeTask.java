package Tasks;

import java.util.Arrays;
import java.util.Random;


public class DayThreeTask {

	public static void main(String[] args) {
		///1) Write a program which creates two dimensional
		// array and stores a multiplication table (from 1 - 10) in it.
		
		byte[][] table = new byte [10][10];
		
		for (byte r = 0; r < table.length; r++) {
			
			for (byte c = 0; c < table.length; c++) {
				
				table[r][c] += (r + 1) * (c + 1);
				
				System.out.printf("%5d", table[r][c]);
			}
			System.out.println();
		}
	/*
		Random rand = new Random();
		int[] array = new int [4];
		int[] copyArray = new int [4];
		
		for (int g = 0; g < array.length; g++) {
			array[g] = rand.nextInt();
		}
		for (int h = 0; h < copyArray.length; h++) {
			copyArray[h] = array[h];
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(copyArray));
		*/
	}

}
