package ivprep;

public class Palindrom {

	public static void main(String[] args) {
		String caes = "0";
		if(args.length > 0)
			caes = args[0];
		
		switch(caes) {
			case "0":
				if(new MainProg().isPalindrome("a santa at nasa"))
					System.out.println("Given input is a palindrome");
				else
					System.out.println("Given input is NOT a palindrome");
				
				break;
			case "1":
				new CheatSheet().csMethod();
				break;
				
			case "2":
				int[] ipa = {2,5,4,7,1,8,0,3};
				System.out.println("Int array to string: "+new MainProg().printIntArray2String(ipa));
				break;
				
			case "3":

				break;
		}
	}
	
	boolean isPalindrome(String s) {
		boolean ret = true;
		char[] schrs = s.replaceAll(" ", "").toLowerCase().toCharArray();
		int len = schrs.length;

		for(int i=0; i<len/2; i++) {
			System.out.println(schrs[i]+"/"+schrs[len-i-1]);
			if(schrs[i] != schrs[len-i-1]) {
				ret = false;
				break;
			}
		}
		return ret; 
	}
	
	String printIntArray2String(int[] ia) {
		String rs = "";
		for(int i=0; i<ia.length; i++) {
			rs = rs+""+ia[i];
		}
		return rs;
	}

}
