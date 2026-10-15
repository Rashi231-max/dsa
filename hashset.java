import java.util.HashSet;

public class hashset {
    HashSet<Integer> seen = new HashSet<>();
boolean dup = false;

for (int x : nums) {
    if (seen.contains(x)) {
        dup = true;
        break;
    }
    seen.add(x);
}
}
