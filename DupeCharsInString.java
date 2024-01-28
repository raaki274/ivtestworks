package ivprep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupeCharsInString {
	
	public static void main(String[] args) {
	
		String str = "khbdsjknvcklsndcklnnlpsnchusdb";
		
		Map<String, Long> result = Arrays.stream(str.split(""))
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		
		Map<String, Long> result1 = result.entrySet().stream()
									.filter(m -> m.getValue() > 1)
									.collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));							
		System.out.println(result1);
		
		List<Entry<String, Long>> result2 = result.entrySet().stream()
				.filter(m -> m.getValue() > 1)
				.collect(Collectors.toList());	
									
		System.out.println(result2);
		
		// Duplicate characters
		List<String> result3 = result.entrySet().stream()
				.filter(m -> m.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
									
		System.out.println(result3);
			
	}
}
