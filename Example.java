import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] counts = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");
        
        int num = 0;
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)	
				counts[num - 1] = counts[num - 1] + 1;
		} while (num != 0);
		
		for (int index = 0; index < counts.length; index++) {
			if (counts[index] > 0)
				System.out.println((index + 1) + " occurs " + counts[index] + " time" + (counts[index] > 1 ? "s" : ""));
		}
	}
}