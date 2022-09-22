import java.lang.*;
import java.util.*;
import java.io.*;

class Data_Type_Range{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose your opion to find range of those Data Type");
		System.out.println("1 -> Byte");
		System.out.println("2 -> Short");
		System.out.println("3 -> Int");
		System.out.println("4 -> Float");
		System.out.println("5 -> Double");
		System.out.println("0 -> EXIT");
		
		int N = sc.nextInt();
		while(N!=0){
			if(N==1){
				System.out.println("Minimum value of BYTE data type is " + Byte.MIN_VALUE);
				System.out.println("Maximum value of BYTE data type is " + Byte.MAX_VALUE);
				System.out.println("Bytes consumed by BYTE data type is " + Byte.BYTES);
			}
			if(N==2){
				System.out.println("Minimum value of SHORT data type is " + Short.MIN_VALUE);
				System.out.println("Maximum value of SHORT data type is " + Short.MAX_VALUE);
				System.out.println("Bytes consumed by SHORT data type is " + Short.BYTES);
			}
			if(N==3){
				System.out.println("Minimum value of INT data type is " + Integer.MIN_VALUE);
				System.out.println("Maximum value of INT data type is " + Integer.MAX_VALUE);
				System.out.println("Bytes consumed by INT data type is " + Integer.BYTES);
			}
			if(N==4){
				System.out.println("Minimum value of FLOAT data type is " + Float.MIN_VALUE);
				System.out.println("Maximum value of FLOAT data type is " + Float.MAX_VALUE);
				System.out.println("Bytes consumed by FLOAT data type is " + Float.BYTES);
			}
			if(N==5){
				System.out.println("Minimum value of DOUBLE data type is " + Double.MIN_VALUE);
				System.out.println("Maximum value of DOUBLE data type is " + Double.MAX_VALUE);
				System.out.println("Bytes consumed by DOUBLE data type is " + Double.BYTES);
			}
			if(N > 5){
				System.out.println("Invalid choise, please choose correct option to continue - To exit press 0.");
			}
			if(N < 0){
				System.out.println("Invalid choise, please choose correct option to continue - To exit press 0.");
			}
			
			System.out.println("Choose your option to find range of those Data Type");
			System.out.println("1 -> Byte");
			System.out.println("2 -> Short");
			System.out.println("3 -> Int");
			System.out.println("4 -> Float");
			System.out.println("5 -> Double");
			System.out.println("0 -> TO EXIT");
			N = sc.nextInt();
		}
	}
}