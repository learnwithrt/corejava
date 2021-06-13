import java.util.Scanner;
class ScannerDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name=sc.next();//read 1 word
		System.out.println(name);
		String sentence=sc.nextLine(); //read 1 line
		System.out.println(sentence);
		int a=10;
		int A=20;
		System.out.println(a);
		System.out.println(A);
	}
}