public class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        String tmpString = t;
        
        for(int a = 0; a < s.length(); a++) {
            tmpString = tmpString.substring(index + 1);
            index = tmpString.indexOf(s.charAt(a) + "");
            if(index == -1) 
                return false;
            if(index == t.length() - 1 && a < s.length() - 1) 
                return false;
        }
        return true;
    }
}
