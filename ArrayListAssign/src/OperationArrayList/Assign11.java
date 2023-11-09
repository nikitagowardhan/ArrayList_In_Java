package OperationArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign11 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		ArrayList<String>l = new ArrayList<>();
		
		System.out.println("Enter a number of Strings u want : ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a String "+(i+1)+":");
			l.add(sc.next());
			
		}
        
         System.out.println(l);
         
         System.out.println("Original list: " + l);

         manualSort(l);

         System.out.println("Sorted list: " + l);
         
         
}

	private static void manualSort(ArrayList<String> l) {
		
		
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				
				if(l.get(i).compareTo(l.get(j))<0)
				{
					
					String swap=l.get(i);
					l.set(i, l.get(j));
					l.set(j, swap);
					
				}
			}
		}
		
	
	}

}
