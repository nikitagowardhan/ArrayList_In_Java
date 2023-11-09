package OperationArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Assign10 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
        l.add("Red");
        l.add("Green");
        l.add("Orange");
        l.add("White");
        l.add("Black");

        System.out.println("List before shuffling: " + l);
        
        shufflingele(l);

        System.out.println("List after shuffling: " + l);
	}

	private static void shufflingele(ArrayList<String> l) {
		
		Random rand = new Random();
		
		for (int i = 0; i < l.size()-1; i++) {
           
			for(int j=i+1;j<l.size();j++){
			//int j = rand.nextInt(l.size());
            // Swap the elements at positions i and j
            String temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
        }
		}
		
	}

}
