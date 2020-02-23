import java.util.*;

public class Array{
	private static Scanner n = new Scanner(System.in);
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter the number of elements in the array");
		int N;
		N = n.nextInt();
		int [] Array = new int[N];
		System.out.println("Enter the input");
		for( int i = 0 ; i < N; i ++){
			Array[i] = s.nextInt();
			System.out.println("The " + i + " element is : " + Array[i]);
			}	
		sort(N,Array);
		display(N,Array);
	}

	public static int[] sort(int N, int[] Array){
		
		int temp;
		for (int i = 0; i <N; i++){
			for(int j = i+1 ; j < N ; j++){
			if (Array[i]> Array[j]){
				temp = Array[i];
				Array[i]= Array[j];
				Array[j] = temp;
				}
			}
		      }
		return Array;
	}

	public static void display(int N, int[] Array){
		for (int i = 0; i <N; i++){
			System.out.println(Array[i]);
		}	
	
	}

		
}		