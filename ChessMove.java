import java.util.Map;
import java.util.HashMap;
import java.lang.Integer;

public class ChessMove {
  public static void main(String[] args) {
	String result = new ChessMove().getNewPosition("5h", 11, 25);
    System.out.println("Result: "+result);
  }
  
  private String getNewPosition(String startPosition, int rows, int cols) {
  
  	Map<String, String> colMap = new HashMap<>() {{
    	put("a", "1");
    	put("b", "2");
		put("c", "3");
        put("d", "4");
        put("e", "5");
        put("f", "6");
        put("g", "7");
        put("h", "8");
        put("1", "a");
    	put("2", "b");
		put("3", "c");
        put("4", "d");
        put("5", "e");
        put("6", "f");
        put("7", "g");
        put("8", "h");
	}};
    
  	int srPos = Integer.parseInt(startPosition.substring(0,1));
    int scPos = Integer.parseInt(colMap.get(startPosition.substring(1)));
    
    System.out.println("srPos: "+srPos);
    System.out.println("scPos: "+scPos);
    
    int nrPos = (srPos==8)?(rows%8):(rows%8)+srPos;
    int ncPos = (scPos==8)?(cols%8):(cols%8)+scPos;
    String ncPosStr = colMap.get(ncPos+"");
 
    System.out.println("nrPos: "+nrPos);
    System.out.println("ncPos: "+ncPos);
    System.out.println("ncPosStr: "+ncPosStr);
 
  	return nrPos+ncPosStr;
  }
}
