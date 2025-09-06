class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String Key = new String(chars);
            if(!ans.containsKey(Key)){
                ans.put(Key,new ArrayList<>());
            }
            ans.get(Key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}