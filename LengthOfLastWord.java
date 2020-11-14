class Solution {
    public int lengthOfLastWord(String s) {
        int b=0;
       /* //String [] t = s.split(" ");
        if(t.equals(0)){
            return 0;
        }
        else{*/
          
        String [] t = s.split(" ");
        if (t.length>0) {
        int k = (t.length -1);
        String v = t[k];
        b = (v.length());
    }
        return b;
        }
    //}
}
