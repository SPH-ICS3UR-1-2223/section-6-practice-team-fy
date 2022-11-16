package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        //TOP LINE
    	//loop from 1-width
    	for (int i=1;i<=width;i++) {
    		//print symbol
    		System.out.print("#");
    		
    	}
    	//print a newline
    	System.out.println();
    	
    	//MIDDLE
    	for (int j = 0; j < height - 2; j++) {
    	
    		//print symbol
    		System.out.print("#");
    		for (int i = 0;i < width - 2; i++) {
    			System.out.print(" ");
    		} if (width > 1) {
    			System.out.println("#");
    			
    		} else {
    			System.out.println();
    	}
    	}
    	//BOTTOM LINE
    	for (int i=1;i<=width;i++) {
    		//print symbol
    		System.out.print("#");
    		
    	}
    	//print a newline
    	System.out.println();

    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
    	int a, b;
    	for (a = 0; a < leg; a++) {
    		for (b = 0; b <= a; b++) {
    			System.out.print("#");
    		}
    		System.out.println();
    	}
    	
    	if (lin)
    	//if line one
    		//print symbol
    	//else
    		//print one symbol
    		//loop line-2 times
    			//print space
    		//print one symbol and newline
      
    }
}
