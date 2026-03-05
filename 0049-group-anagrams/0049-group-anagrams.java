class Solution {

    public List<List<String>> groupAnagrams(String[] s){

        if(s==null||s.length==0) return new ArrayList<>();

        Map<String, List<String>> map=new HashMap<>();

        for (String ele:s){

            int[] count=new int[26];

            for (int i=0;i<ele.length();i++){
                count[ele.charAt(i)-'a']++;
            }

            StringBuilder ss=new StringBuilder();
            for (int i = 0; i < 26; i++) {
                ss.append(count[i]).append("-"); // no need of index, because we are adding zero count as well, so position mained.
            }

            map.computeIfAbsent(new String(ss), k->new ArrayList<>()).add(ele);

        }

        return new ArrayList<>(map.values());
    }
}