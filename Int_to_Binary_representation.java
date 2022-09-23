import java.util.*;
import java.lang.*;

class Int_to_Binary_representation{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		// Byte will store value from -2147483648 to 2147483647
		System.out.println("Enter 0 to EXIT\n");
		while(true){
			System.out.println("Enter value between -128 to 127");
			
			int x;
			x = sc.nextInt();
			System.out.println(Integer.toBinaryString(x));
			if(x==0){
				System.out.print("END!");
				break;
			}
			
		}
	}
}