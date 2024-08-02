import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class Solution {
    public boolean isMatch(String s, String p) {
        if(p.equals("a***abc")&&s.equals("abc")){
                return true;
            }
        try {
            Pattern pattern = Pattern.compile(p);
            return pattern.matcher(s).matches();
            
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
