class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String data[] = title.split("\\s+");
        for(int i=0;i<data.length;i++){
            if(data[i].length()>2){
                data[i]= Character.toUpperCase(data[i].charAt(0))+""+data[i].substring(1);
            }
        }
        StringBuilder sb = new StringBuilder(data[0]);
        for(int i=1;i<data.length;i++) sb.append(" "+data[i]);
        return sb.toString();

    }
}