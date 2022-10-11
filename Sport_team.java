import java.util.Scanner;
class  Sport_team
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		Float arr[]=new Float[8];
		System.out.println("enter the 1st person height");
		arr[0] =scan.nextFloat();
		System.out.println("enter the 2nd person height");
		arr[1] =scan.nextFloat();
		System.out.println("enter the 3rd person height");
		arr[2] =scan.nextFloat();
		System.out.println("enter the 4th person height");
		arr[3] =scan.nextFloat();
		System.out.println("enter the 5th person height");
		arr[4] =scan.nextFloat();
		System.out.println("enter the 6th person height");
		arr[5] =scan.nextFloat();
		System.out.println("enter the 7th person height");
		arr[6] =scan.nextFloat();
		System.out.println("enter the 8th person height");
		arr[7] =scan.nextFloat();

		System.out.println("height of the player is ");
		System.out.println(arr [0]);
		System.out.println(arr [1]);
		System.out.println(arr [2]);
		System.out.println(arr [3]);
		System.out.println(arr [4]);
		System.out.println(arr [5]);
		System.out.println(arr [6]);
		System.out.println(arr [7]);
	}
}
