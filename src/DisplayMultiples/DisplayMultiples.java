package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Hello!\nChoose a number:");
    	int chosenNumber = in.nextInt();
    	 System.out.println();
         for (int x = 1; x <= 12; x++) {
             int multiples = chosenNumber * x;
             System.out.println(multiples);
    }
    	in.close();
}
    
}
