class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length()==0){return 0;}
        int result;
        String words[]=new String[10];
        words=s.split(" ");
        result = words[words.length-1].length();
        return result;
    }
}
