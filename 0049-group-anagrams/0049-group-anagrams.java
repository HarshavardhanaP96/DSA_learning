class Solution {

    public List<List<String>> groupAnagrams(String[] s){

        if(s==null||s.length==0) return new ArrayList<>();

        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<s.length;i++){

            char[] charArray=s[i].toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);

            if(!map.containsKey(sorted)){
     
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s[i]);


        }
        return new ArrayList<>(map.values());

    }
}