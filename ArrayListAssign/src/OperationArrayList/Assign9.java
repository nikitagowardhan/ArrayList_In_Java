package OperationArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Assign9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer>l1= new ArrayList<>();
		
		System.out.println("Enter the no of elements u want in List1 : ");
		int n1=sc.nextInt(); 
		
		System.out.println("Enter a Element in List1 :");
		for(int i=0;i<n1;i++){
			
			l1.add(sc.nextInt());
			}
		
		
		ArrayList<String>l2 = new ArrayList<>();
		System.out.println("Enter the no of elements u want in List2 : ");
		int n2= sc.nextInt();
		
		System.out.println("Enter a Element in List2 :");
		for(int j=0;j<n2;j++)
		{
			l2.add(sc.next());
		}
		System.out.println("Original List1: " + l1);
        System.out.println("Original List2: " + l2);
		
		copy(l1,l2);
		System.out.println("List1: " + l1);
        System.out.println("List2: " + l2);
		
	}

	private static void copy(ArrayList<Integer> l1, ArrayList<String> l2) {
		
		if(l1.size()==l2.size())
		{
			for(int i=0;i<l1.size();i++)
			{
				//this stringvalue method use to convter int val into string
				l2.set(i, String.valueOf(l1.get(i)));
			}
		}
		else
			throw new IllegalArgumentException("Both lists must have the same size");
        }
		
}


