class Solution {
    public String arrangeWords(String p) {
        String text=p.toLowerCase();
        String sarr[]=text.split(" ");
        Arrays.sort(sarr,Comparator.comparingInt(String :: length));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sarr.length;i++){
            if(i==0){
                String dup=sarr[i];
                sb.append(Character.toUpperCase(dup.charAt(0))+dup.substring(1)+" ");
            }
            else{
                sb.append(sarr[i]+" ");
            }
        }
        String dup=sb.toString();
        return dup.substring(0,dup.length()-1);


    }
}