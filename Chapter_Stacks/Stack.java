package Chapter_Stacks;

public class Stack {
	int top=-1;
	int[] stk;
	public Stack(int k) {
		stk=new int[k];
	}
	
	public void push(int ele) {
		stk[++top]=ele;
	}
	
	public int pop() {
		if(top==-1) {
			return 0;
		}
		return stk[--top];
	}
}
