class Solution {
    public int romanToInt(String s) {
        
        int n=0;
         
      
        for(int j=0; j < s.length();j++)  
        {
            String t= s.substring(j,j+1);
            System.out.println(t);
            

            if (t.equals("I"))
            {
                n=n+1;
            } 
            else if (t.equals("V"))
            {
                
                if (j>0 && s.substring(j-1,j).equals("I"))  {
                    n=n+3;
                }  else {
                   n=n+5;
                }
            }
            else if (s.substring(j,j+1).equals("X"))
            { 
                if (j>0 && (s.substring(j-1,j).equals("I")))  {
                    n=n+8;
                }  else {
                   n=n+10;
                }
                
            }
            else if (t.equals("L"))
            {
                if (j>0 && s.substring(j-1,j).equals("X"))  {
                    n=n+30;
                }  else {
                   n=n+50;
                }
            }                
            else if (t.equals("C"))
            {
                if (j>0 && s.substring(j-1,j).equals("X"))  {
                    n=n+80;
                }  else {
                   n=n+100;
                }
            }
            else if (t.equals("D"))
            {
                if (j>0 && s.substring(j-1,j).equals("C"))  {
                    n=n+300;
                }  else {
                   n=n+500;
                }
            }
            else if (t.equals("M"))
            {
                if (j>0 && s.substring(j-1,j).equals("C"))  {
                    n=n+800;
                }  else {
                   n=n+1000;
                }
            
            }  
        }
        return n;
    }
}
