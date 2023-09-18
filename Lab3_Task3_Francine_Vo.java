/*
 * Lab3_Task3_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/16/2023
 */
import java.util.Scanner;

public class Lab3_Task3_Francine_Vo {

	public static void main(String[] args) {
		// Declare variables
		int side1, side2, side3;

		// Prompt user for sides of a triangle
		System.out.print("Enter the side lengths of a triangle: ");
		Scanner input = new Scanner(System.in);
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		input.close();

		// Test if the triangle makes a right triangle using Pythagorean theorem
		if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)
				|| Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)
				|| Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2)
						&& side1 * side2 * side3 != 0)
			System.out.println("This is the rightest of right triangles");
		else
			System.out.println("Nope thats not right!");
	}

}
