class OpDemo{
	public static void main(String args[]){
		int a=10;
		int b=20;
		System.out.println("Addition "+(a+b));//java will append them
		System.out.println("Subtraction "+(a-b));
		System.out.println("Multiplication "+(a*b));
		System.out.println("Division "+(a/b));//0
		//Type casting- cast an integer to a float
		//treat b as a float value
		System.out.println("Division "+(a/(float)b));//0.5
		//Modulus- Remainder
		System.out.println("Modulus "+(20%13));//7
		System.out.println("Divide "+(20/13));//7
	}
}