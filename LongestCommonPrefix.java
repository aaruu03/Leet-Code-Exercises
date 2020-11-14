class Solution {
    public String longestCommonPrefix(String[] strs) {
    
       String t="";
        int a=0;

        for ( int j=0; j< strs.length; j++ )
        {
           
          if (a <= strs[j].length()) {
           if (j>0 && !t.equals(strs[j].substring(0,a))) {
               t= strs[j].substring(0,a-1);
               break;
           }
          } else { 
              t= strs[j].substring(0,a-1);
              break;
        }
            
            if (j==strs.length-1 || j==0) { 
             j=0;
             a=a+1;  //1
             if (a<=strs[j].length()){ 
               if (strs.length==1) {
                  t=strs[0];
                } else { 
                  t= strs[j].substring(0,a); //h
                } 
             } else {
                 break;
             }   
           }
            
        }
        
        return t;
        
    }
}
