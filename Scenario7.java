import java.util.*;
class  Scenario7
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int [][][]arr = new int [2][3][2];
		
		System.out.println("Enter the age of students ");
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the age for students - "+(k+1)+" of class "+(j+1)+" of school "+(k+1));
					arr[i][j][k] = scan.nextInt();
					
				}
			}
			
		}System.out.println("students ages are");
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				
					
				}
			}
			
			System.out.println();
			System.out.println("school "+(i+1));
		}

	}
}
