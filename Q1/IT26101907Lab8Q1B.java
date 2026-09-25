import java.util.Scanner;

public class  IT26101907Lab8Q1B{
	public static void main (String[]args){
		
	Scanner input = new Scanner(System.in);
		int[] myArray = new int[5];
		int[] evenArray = new int[5];
		
		for(int i=0;i<5;i++){
		
		System.out.print("Enter Number "+(i+1)+" : ");
		myArray[i] = input.nextInt();
		
	 }
	 System.out.println("\nContents of myArray:");
	 
	 for(int i =0;i<5;i++){
		 System.out.print(myArray[i]+" ");
	 }
	
	
	 int j = 0;
	
	for (int i = 0; i < 5; i++) {

            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
	}
			 System.out.println("\nEven numbers:");

        for (int i = 0; i < j; i++) {
            System.out.print(evenArray[i]+" ");
        }
	}
	
	
}	

	