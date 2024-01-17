import java.lang.Integer;
import java.util.Arrays;

public class ValidateCard {
  public static void main(String[] args) {
  	String cNumber = "3563645678901260";
    String[] cnArray = cNumber.split("");
    int idx = 0;
    ValidateCard vc = new ValidateCard();
    while(idx < cnArray.length) {
        int doubledNo = Integer.parseInt(cnArray[idx])*2;
        if(doubledNo>9) {
        	doubledNo = vc.sumOfDigits(doubledNo);
        }
        cnArray[idx] = doubledNo+"";
        idx+=2;
    }
    
    System.out.println("new card: "+String.join("", cnArray));
    int sumOfNwcard = Arrays.stream(cnArray)
    					.mapToInt(Integer::parseInt)
                        .sum();
    System.out.println("sumOfNwcard: "+sumOfNwcard);
    System.out.println("Valid card: "+((sumOfNwcard%10 == 0)?true:false));
  }
  
  private int sumOfDigits(int n) {
  		int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        if(sum>9) {
        	sum = sumOfDigits(sum);
        }
       return sum; 
  }
}
