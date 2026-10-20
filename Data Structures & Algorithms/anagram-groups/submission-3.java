class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for(String word:strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(map.containsKey(key)){
                map.get(key).add(word);
            }else{
                List<String>list = new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }
        }
        List<List<String>>answer =new ArrayList<>();
        for(List<String>st:map.values()){
            answer.add(st);
        }
        return answer;
    }
}
