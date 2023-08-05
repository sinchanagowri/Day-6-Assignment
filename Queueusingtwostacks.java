import java.io.*;
import java.util.*;
public class Queueusingtwostacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    Stack<Integer> pushStack = new Stack<>();
		    Stack<Integer> popStack = new Stack<>();

		    for(int i=0; i<n; i++){
		        int operations = sc.nextInt();
		        if(operations == 1){
		            int element = sc.nextInt();
		            pushStack.push(element);
		        }
		        else{
		        	if(popStack.isEmpty()==true){
		                while(pushStack.isEmpty()==false){
		                popStack.push(pushStack.pop());
		                }
		            }
		            if(operations == 2){
		                  popStack.pop();
		            }
		            else{
		                System.out.println(popStack.peek());
		            }
		        }
		  }
	}
}
