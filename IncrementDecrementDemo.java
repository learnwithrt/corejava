class IncrementDecrementDemo{
	public static void main(String a[]){
		int i=5;
		int j=6;
		int k=i++;//6
		//1. Use the value
		//2. Change the value
		System.out.println(k);//6
		k=++j;//pre increment 7
		//1. Change the value
		//2. Use the value
		System.out.println(k);//7
		//7+6
		System.out.println(++i+--j);//13
	}
}