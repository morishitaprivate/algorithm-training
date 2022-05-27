package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class atcoder3_sample {
	  public static void main(String args[]) {
			ArrayList<Integer> words = new ArrayList<>();
	 
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNext()) {
				int word = scanner.nextInt();
				words.add(word);
			}
			scanner.close();
			
			int []array = new int [words.size()];
			
			for(int k = 0 ; k < words.size(); k++) {
				array[k] = words.get(k);
			}
			
			for(int i = 0; i < words.size() - 1 ; i++) {
				  for(int j = words.size() - 1;  i< j ; j--) {
					  if(array[j] < array[j-1]) {
						  int k = array[j-1];
						  array[j-1] = array[j];
						  array[j] = k;
					  }
				  }
			  }
			
			System.out.println(array[3]);
			
			
		}
}
