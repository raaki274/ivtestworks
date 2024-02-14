package ivprep;

import static java.util.stream.Collectors.*;
import java.util.*;
import java.util.function.Function;

public class DupChars {
    public static void main(String[] args) {
        Function<Map<Character, Long>, Map<Character, Long>> filterByDuplicateFn = (occurrencesMap) -> occurrencesMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue() > 1)
        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        
        String s = "Medium readerm";

        final Map<Character, Long> collect = s.chars()
        .mapToObj(c -> (char) c)
        .collect(
                collectingAndThen(
                        groupingBy(c -> c, LinkedHashMap::new, counting()),
                        filterByDuplicateFn
                )
        );
        
        System.out.println(collect);
        System.out.println(collect.size());
    }
}