class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int l=s.length(),amount=0;

        amount+=map.get(s.charAt(l-1));
        System.out.println(amount);
        for(int i=l-2;i>=0;i--){
            if(map.get(s.charAt(i))< map.get(s.charAt(i+1))){
                amount-=map.get(s.charAt(i));
            }         
            else{
                
                amount+=map.get(s.charAt(i));

            }
        }
        return amount;
    }
}