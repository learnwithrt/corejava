import java.lang.*;//import all classes from package java.lang
import java.util.Scanner;
class MathDemo{
	public static void main(String agrs[]){
		int a=10;
		int b=4;
		//Print 10 raised to a power of 4
		System.out.println(Math.pow(a,b));//10*10*10*10
		System.out.println(Math.pow(b,a));//4^10
		//Math is in package java.lang
		//Scanner is in package java.util
		//java.lang package is imported by default in all your programs
		float f=10.5f;
		float fl=10.6F;
		int x=10;
		int y=20;
		x+=30;	//x=x+30;
		y/=5;	//y=y/5;
		System.out.println(x);
		System.out.println(y);


	}
}