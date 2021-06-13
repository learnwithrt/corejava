//#include<stdio.h> - printf is in standard input output header file
import java.util.Scanner;//utilities
class CalculateArea{
	public static void main(String args[]){
		double radius;//floating type values
		double area;
		//read input from user
		Scanner scan=new Scanner(System.in);
		radius=scan.nextDouble();
		area=Math.PI * radius * radius;
		//append radius with the string "Area is"
		System.out.println("Area is"+area);
		//System.out object to print(output) something
	}
}