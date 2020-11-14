class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        //String match = J.substring(0,1)
        for(int m = 0; m<J.length(); m++){
             String match = J.substring(m,m+1);
            System.out.println("substring be " + match);
            System.out.println("we in");
            for(int i = 0; i<S.length(); i++){
                System.out.println("entered");
                System.out.println("substring 2 be " + S.substring(i,i+1));
                if(S.substring(i,i+1).equals(match)){
                    System.out.println("thriving");
                    System.out.println("substring 2 be " + S.substring(i));
                    System.out.println("yay");
                    count++;
                 }
            }
        }
        return count;
    }
}
