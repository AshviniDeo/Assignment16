package bridgeLabz.linkedList;

import java.util.Scanner;

public class LinkedListImplementation {

	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		LinkedList list = new LinkedList();
		Scanner scanner = new Scanner(System.in);

		boolean exit = false;
		while(!exit) {
			System.out.println(" 1.Add Node \n 2.Print Node \n 3.Remove Node \n 4.Search Node \n 5.Sorted LinkedList \n 6.Exit");
			System.out.println("Enter your choice :");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: { System.out.println("Enter Node you want to add:");
			int number = scanner.nextInt();
			for(int i = 0; i<number; i++) {
				System.out.println("Enter Data for node :");
				int data = scanner.nextInt();
				list.addNode(data);
			}
			}
			break;

			case 2: { list.displayNode();
			System.out.println();
			break;
			}

			case 3: { System.out.println("Enter node you want to delete");
			int data = scanner.nextInt();
			list.removeNode(data);
			}
			break;

			case 4:{System.out.println("Enter Node you want to find :");
			int data =scanner.nextInt();
			list.searchNode(data);

			}
			break;

			case 5:{ list.sort();
				break;
			}

			case 6: exit = true;
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}



}
