class Solution {
    public int majorityElement(int[] nums) {
        int maxFreq = 0;
        int maxElement =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        return maxElement;

    }
}