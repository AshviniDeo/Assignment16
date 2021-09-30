package bridgeLabz;
class MyNode{
	MyNode next,prev;
     int data;
     public MyNode(int data) {
 		
 		next = next;
 		prev = prev;
 		this.data = data;
 	}
}

public class LinkListMap {
  
MyNode[] hashTable;
   int size;
   public LinkListMap(int tablesize) {
		hashTable = new MyNode[tablesize];
		size = 0;
	}
   
   public void insert(int key,int value) {
	   size++;
	   int position = key;
	   MyNode node = new MyNode(value);
	   MyNode start = hashTable[position];
	   if (hashTable[position] == null) {
           hashTable[position] = node;
       } else {
           node.next = start;
           start.prev = node;
           hashTable[position] = node;
       }
   }
   
   public void printHashTable()
   {
       System.out.println();
       for (int i = 0; i < hashTable.length; i++) {
           System.out.print("Key " + i + ":  ");
 
          MyNode start = hashTable[i];
 
           while (start != null) {
               System.out.print(start.data + " ");
               start = start.next;
           }
 
           System.out.println();
       }
   }
}
