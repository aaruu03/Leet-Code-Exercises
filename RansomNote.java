class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //array list?
            List<String> characters = new ArrayList<>();
            for(int i = 0; i<magazine.length(); i++){
                characters.add(magazine.substring(i,i+1));
            }
        if(magazine.isEmpty()){
            if(ransomNote.isEmpty()){
                System.out.println("these empty yeet");
                return true;
            }
            System.out.println("null");
            return false;
        }
        if(magazine.length()<ransomNote.length()){
            System.out.println("false");
            return false;
        }
        for(int j = 0; j<ransomNote.length(); j++){
            String check = ransomNote.substring(j,j+1);
            System.out.println(check +"uno");
            for(int k = 0; k< characters.size(); k++){
                System.out.println(characters.get(k)+ "duno checked");
                if(check.equals(characters.get(k))){
                    System.out.println("yay");
                    characters.remove(k);
                    k = characters.size();
                    if(k==characters.size()-1){
                        System.out.println("breaking");
                        break;
                    }
                }
                if(k==characters.size()-1){
                    return false;
                }
            }
        }
        System.out.println(characters);
        return true;
    }
}
