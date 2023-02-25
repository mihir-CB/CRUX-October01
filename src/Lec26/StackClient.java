package Lec26;

public class StackClient {

	public static void main(String[] args) throws Exception{
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		st.display();
		
		System.out.println("Top is:"+st.peek());
		System.out.println("Removed:"+st.pop());
		
		st.display();
		
		st.push(5);
		st.push(6);
		st.display();
//		st.push(7);
		
//		st.display();
		st.pop();
		st.pop();
		st.pop();
		st.display();
		st.pop();
		st.display();
		st.pop();
		st.display();
		
		
	}

}
