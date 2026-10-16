class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            char leftLower = Character.toLowerCase(s.charAt(left));
            char rightLower = Character.toLowerCase(s.charAt(right));
            if(leftLower!=rightLower){
                
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
}
