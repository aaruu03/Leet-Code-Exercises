class Solution {
    public boolean isPalindrome(int x) {
        boolean b= true;
        
       
        if (x>=2147483647)
        {
            b=false;
            return false;
        }
        else{
        if (x<0) {
            b=false;
            return false;
        } else {
        
        String s = Integer.toString(x); 
        String r= "";
        for(int i=s.length()-1; i>-1; i--)
        {
            String v= s.substring(i,i+1);
            r= r+v;
           
        }
        
          if((x==Integer.valueOf(r)) && (b == true))
         {
              System.out.println(r);
              System.out.println(s);
                return b;
           } else {
              System.out.println(r);
              System.out.println(s);
              return false;
          }
        }
    }
}
}
