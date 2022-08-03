import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=5;
		int positive=0;int odd=0;int even=0;
		System.out.println("enter the numbers: ");
		int arr[] = new int[x];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else 
			{
				odd++;
			}
			if(arr[i]>0)
			{
				positive++;
			}
						
		}
		System.out.println("total positive numbers is " + positive);
		System.out.println("total odd number is " + odd);
		System.out.println("total even numbers is " + even);
		
		
		
	}

}
