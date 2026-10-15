import java.util.HashMap;

public class hashmap {
    HashMap<String, Integer> marks = new HashMap<>();
marks.put("Rashi", 90);
System.out.println(marks.get("Rashi"));   // 90, turant mila


HashMap<Character, Integer> count = new HashMap<>();
for (char c : "banana".toCharArray()) {
    count.put(c, count.getOrDefault(c, 0) + 1);
}
// b=1, a=3, n=2
}
