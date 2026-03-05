class Solution {
    public  List<List<String>> groupAnagrams(String[] s){

        if(s==null||s.length==0) return new ArrayList<>();

        Map<String, List<String>> map=new HashMap<>();

        for(String ele:s){

            char[] charArray=ele.toCharArray();
            Arrays.sort(charArray);

            String sortedString=String.valueOf(charArray);

            //map.computeIfAbsent(sortedString,k->new ArrayList<>()).add(ele);  better version
            
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(ele);

        }

        return new ArrayList<>(map.values());
    }
}