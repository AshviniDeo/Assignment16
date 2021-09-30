package bridgeLabz;

import bridgeLabz.MyLinkedList;
import bridgeLabz.MyStack;

public class BalanceParanthesis {

	public static void main(String[] args) {
	 String str = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
	 String str2 = "[((5+6)∗(7+8))/((4+3)(5+6))∗((7+8)/(4+3))]";
	
	 Object[] obj = new Object[str.length()];
	 for(int i = 0; i<str.length(); i++) {
		obj[i] = str.charAt(i);
	 }
	checkParanthesis(str,obj);
	for(int i = 0; i<str.length(); i++) {
		obj[i] = str2.charAt(i);
	 }
	checkParanthesis(str2, obj);
	 
	}

	private static void checkParanthesis(String str, Object[] obj) {
		 MyStack <MyLinkedList> stack = new MyLinkedList ();
		int top = -1;
		for(Object o:obj) {
			if(obj != null && o.equals( '(') || o.equals( '[')) {
				stack.push(o);
				top += 1;
				stack.print();
			}else if(o.equals(')') && !obj[top].equals('(') || o.equals(']') && !obj[top].equals('[')){
				stack.pop();
				top -= 1;
			}
			stack.pop();
		}
		 
		if(top != -1) {
			System.out.println("String is having Balanced Paranthesis");
		}else {
			System.out.println("String is having Unbalanced Paranthesis");
		}
		
	}

}
