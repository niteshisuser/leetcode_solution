import java.math.BigInteger;
class Solution {
    public int numDifferentIntegers(String word) {
        char w[] = word.toCharArray();
        for(int i=0;i<w.length;i++)
        {
            if(w[i]>='a' && w[i]<='z') w[i]=' ';
        }
        word = new String(w);
        System.out.println("Word:"+word);
        Set<BigInteger> set =new HashSet();
        for(String s:word.split("\\s+")){
            System.out.print(s + ":");
            s = s.trim();
            if(!s.equals(""))
                set.add(new BigInteger(s));

        }

        return set.size();
    }
}