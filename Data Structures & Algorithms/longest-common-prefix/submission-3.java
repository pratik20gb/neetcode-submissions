class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength =strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(minLength>strs[i].length()){
                minLength  = strs[i].length();
            }
        }
        for(int i=0;i<minLength;i++){
            char ch  =strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLength);
        
    }
}