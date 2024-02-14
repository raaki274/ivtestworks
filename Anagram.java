
/*

Two words are said to be anagrams if each character occurs the same number of times in both words.

Given an array of strings, group anagrams together. All the input strings are in Lowercase.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/

package ivprep;
import java.util.*;
import java.util.function.Function;

//import org.junit.*;
//import org.junit.runner.*;
//import static org.junit.Assert.*;
import java.util.stream.*;

public class Anagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

      List<String> sList = new ArrayList<>();
      for(String str: strs) {
        char[] sArr = str.toCharArray();
        Arrays.sort(sArr);
        String sStr = new String(sArr);
        sList.add(
          new String(sStr)
        );
      }

      Map<String, List <String>> outList = new LinkedHashMap<>();
      
      for(int i=0; i<sList.size(); i++) {
    	  List<String> inList = null;
    	  String key = null;
        for(int j=i; j<sList.size(); j++) {
          if(sList.get(i).equals(sList.get(j))) {
        	  key = sList.get(i);
        	if(inList != null) {
          		inList.add(strs[j]);
          	} else {
          		inList = new ArrayList<String>();
          		inList.add(strs[j]);
          	}
          }
        }
        
        if(inList.size() > 0 && !outList.containsKey(key))
          outList.put(key, inList);
      }
      
      System.out.println(outList);
        
      return new ArrayList(outList.values());
    }
     
    public static void main(String[] args) {
    	String[] input = new String[] {"eat","tea","tan","ate","nat","bat"};
		System.out.println(Anagram.groupAnagrams(input));
    }
    
    
//    public static void main(String[] args) { 
//        JUnitCore.main("Solution");
//    }

//    @Test
//    public void test1() {
//        String[] input = new String[] {"eat","tea","tan","ate","nat","bat"};
//        List<List<String>> expected = List.of(
//            List.of("eat", "tea", "ate"),
//            List.of("tan", "nat"),
//            List.of("bat")
//        );
//        List<List<String>> actual = groupAnagrams(input);
//        assertEquals(expected, actual);
//    }
}