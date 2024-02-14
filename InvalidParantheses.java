package ivprep;

import java.util.Stack;

public class InvalidParantheses {
	public static void main(String[] args) {
        String inputStr = "(())((())))(()";
        System.out.println(inputStr.length());
        
        int l = 0, r = 0;
        for (char ch : inputStr.toCharArray())
        {
            if(ch == '(')
                l++;
            if(ch == ')')
                r++;
        }
        System.out.println(l+":"+r);
        System.out.println(new InvalidParantheses().checkParantheses(inputStr));
    }
    
    private boolean checkParantheses(String inputStr) {
        Stack<Character> stk = new Stack<Character>();  
        int i=1;
        for (char ch : inputStr.toCharArray())   
        {
        	System.out.println(i);
        	// for any type of opening bracket  
            // the same type of closing bracket should   
            // be present  
            if (ch == '(')  
            {  
                stk.push(')');
            }
            else if(stk.isEmpty() || stk.pop() != ch)
            {
            	// if the control reaches here  
                // then it means that either there is some extra   
                // opening or closing brackets  
            	return false;
            }
            
            i++;
        }

        return stk.isEmpty(); 
    }

}
