public class two_pointers {
    String s = "madam";
int left = 0;
int right = s.length() - 1;
boolean ans = true;

while (left < right) {
    if (s.charAt(left) != s.charAt(right)) {
        ans = false;
        break;
    }
    left++;
    right--;
}

System.out.println(ans);   // true

}


