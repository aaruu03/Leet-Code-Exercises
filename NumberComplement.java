class Solution {
    public int findComplement(int num) {
       String convert = "";
        String bincon = "";
        int newdec = 0;
        while(num!=0){
            int add = num%2;
            System.out.println("modulo is " + add );
            convert = Integer.toString(add) + convert;
            System.out.println("convert string is " + convert);
            num = num/2;
            System.out.println("num is  " + num);
        }
        for(int i = 0; i<convert.length(); i++){
            if(convert.substring(i,i+1).equals("0")){
                bincon =  bincon + "1";
                System.out.println("replaced the 0 yay " + bincon);
            }
            else if(convert.substring(i,i+1).equals("1")){
                bincon =  bincon + "0";
                System.out.println("replaced the 1 yay " + bincon);
            }
        }
        for(int k = 0; k<bincon.length(); k++){
            if(bincon.substring(k,k+1).equals("0")){
                newdec = newdec*2;
                System.out.println("converted the 0 " + newdec);
            }
            else if(bincon.substring(k,k+1).equals("1")){
                newdec = (newdec*2) +1;
                System.out.println("converted the 1 " + newdec);
            }
        }
        return newdec;
    }
}
