import java.util.Scanner;
class Sport 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		float [] arr = new float [8];
		System.out.println("Enter the first person height");
		arr[0] = scan.nextFloat();
		System.out.println("Enter the second person height");
		arr[1] = scan.nextFloat();
		System.out.println("Enter the third person height");
		arr[2] = scan.nextFloat();
		System.out.println("Enter the fourth person height");
		arr[3] = scan.nextFloat();
		System.out.println("Enter the fifth person height");
		arr[4] = scan.nextFloat();
		System.out.println("Enter the sixth person height");
		arr[5] = scan.nextFloat();
		System.out.println("Enter the seventh person height");
		arr[6] = scan.nextFloat();
		System.out.println("Enter the eighth person height");
		arr[7] = scan.next `Float();

		System.out.println("age of the players are : ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		
		
	}
}
