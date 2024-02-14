package ivprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
	    List<List<String>> output = new ArrayList<List<String>>();
	    if(strs == null) {
	        return output;
	    }
	    Map<String,List<String>> outputMap = new LinkedHashMap<String, List<String>>();

	    for(String str : strs) {
	        int[] input = new int[26];
	        for(int i = 0; i < str.length(); i++) {
	            input[str.charAt(i) - 'a']++;
	        }
	        String inputStr = Arrays.toString(input);
	        if(outputMap.containsKey(inputStr)) {
	            outputMap.get(inputStr).add(str);
	        } else {
	            List<String> outputLst = new ArrayList<String>();
	            outputLst.add(str);
	            outputMap.put(inputStr, outputLst);
	        }
	    }
	    System.out.println(outputMap);
	    output.addAll(outputMap.values());
	    return output;
	}
	
	public static void main(String[] args) {
    	String[] input = new String[] {"pot","top","tan","opt","nat","bat"};
		System.out.println(Anagram.groupAnagrams(input));
    }

}
