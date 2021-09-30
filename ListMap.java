package bridgeLabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many keys you want :");
		int key = scanner.nextInt();
		LinkListMap table = new LinkListMap(key);
		
		int[] arr = {24,34,96,69,52,35,54,75,62,51,98,84,91,20,49,37,58,28,68,95,71};
		for (int i = 0; i < arr.length; i++) {
			int keys = arr[i] % key;
		   table.insert(keys, arr[i]);
		}
		
		
			table.printHashTable();
		
		
	}

}
