import java.util.Scanner;

public class  IT26101907Lab8Q3{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[6];
		
		for(int i = 0; i < 6;i++){
			
			System.out.print("Enter positive number"+(i+1)+":");
			int number = input.nextInt();
			
			if(number <= 0){
				System.out.println("Error! Please enter a positive number.");
			i--;
			} else {
				numbers[i] = number;
			}
			}
			
			System.out.print("\nArray contents:");
			
			for(int i = 0;i < 6;i++){
				System.out.print(numbers[i]+" ");
			}
			int max = numbers[0];
			
			for(int i = 1; i<6; i++){
				
				if(numbers[i] > max){
					max = numbers[i];
				}
		}
		
		System.out.println("\nMaximum number:"+max);
	}
}