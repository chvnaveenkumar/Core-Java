import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

public class SingleDimenssional {
	
	public static void main(String args[]) {
		
		int count = 0, count2 = 0, count3 = 0, row=0, col=0,r=0,c=0,d=0;
		boolean flag = true;
		int singleDimenssional[] = null;
		char twoDimenssional[][] = null;
		int threeDimenssional[][][] = null;
		char max = ' ', min = ' ';
		
		Scanner scanner = new Scanner(System.in);
			
		while (count < 1)
		{
		    System.out.print("Enter the number of elements: ");
		    if (scanner.hasNextInt())
		        count = scanner.nextInt();
		    else
		    {
		        String s = scanner.next();
		    }
		    if(count < 1)
		    {
		        System.out.print("That number is invalid - ");
		    }
		}
		System.out.println("count:" + count);
		singleDimenssional = new int[count];
		for(int i=0;i<count;i++) {
			singleDimenssional[i] = -1;
			while (singleDimenssional[i] < 0)
			{
			    System.out.print("Enter the element: ");
			    if (scanner.hasNextInt())
			    	singleDimenssional[i] = scanner.nextInt();
			    else
			    {
			        String s = scanner.next();
			    }
			    if(singleDimenssional[i] < 0)
			    {
			        System.out.print("That number is invalid - ");
			    }
			}
		}
		
		Arrays.sort(singleDimenssional);
		System.out.println("Elements in ascending order:");
		for(int i=0;i<count;i++) {
			System.out.print(singleDimenssional[i] + ", ");
		}
				
		while (count2 < 1)
		{
		    System.out.print("\n\n Enter the number of elements: ");
		    if (scanner.hasNextInt())
		        count2 = scanner.nextInt();
		    else
		    {
		        String s = scanner.next();
		    }
		    if(count2 < 1)
		    {
		        System.out.print("That number is invalid - ");
		    }
		}
		row = (count2/2);
		col = count2 - row;
		System.out.println(row+ " "+col);
		twoDimenssional = new char[row][col];
		int res_min = 0;
		int res_max = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
		 	    System.out.println("Enter character row "+ i + " col "+ j +": ");
			    twoDimenssional[i][j] = scanner.next().charAt(0);
			    if(max == ' ' || min == ' ')
			    min = max = twoDimenssional[0][0];
			    
			    res_min = new Character(twoDimenssional[i][j]).compareTo(new Character(min));
			    res_max = new Character(twoDimenssional[i][j]).compareTo(new Character(max));
			    if(res_min < 0)
			    	min = twoDimenssional[i][j];
			    if(res_max > 0)
			    	max = twoDimenssional[i][j];
			}
		}
		System.out.println("Minimum character: "+min + " Maximum character:  "+max);
		
		while (r < 1)
		{
		    System.out.print("\n\n Enter the number of elements of row: ");
		    if (scanner.hasNextInt())
		        r = scanner.nextInt();
		    else
		    {
		        String s = scanner.next();
		    }
		    if(r < 1)
		    {
		        System.out.print("That number is invalid - ");
		    }
		}
		while (c < 1)
		{
		    System.out.print("\n\n Enter the number of elements: ");
		    if (scanner.hasNextInt())
		        c = scanner.nextInt();
		    else
		    {
		        String s = scanner.next();
		    }
		    if(c < 1)
		    {
		        System.out.print("That number is invalid - ");
		    }
		}
		while (d < 1)
		{
		    System.out.print("\n\n Enter the number of elements: ");
		    if (scanner.hasNextInt())
		        d = scanner.nextInt();
		    else
		    {
		        String s = scanner.next();
		    }
		    if(d < 1)
		    {
		        System.out.print("That number is invalid - ");
		    }
		}
int sum =0;
		threeDimenssional = new int[r][c][d];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				for(int k=0;k<d;k++) {
					System.out.println("Enter the element: ");
					threeDimenssional[i][j][k] = scanner.nextInt();
					sum+=threeDimenssional[i][j][k];
				}
			}
		}
		System.out.println("Sum of three dimenssional array:" + sum);
	}
}
