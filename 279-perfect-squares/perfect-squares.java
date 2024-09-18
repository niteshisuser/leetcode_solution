// lagrange 4 number theorem::

class Solution {
    public int numSquares(int n){

    //finding if it is a perfect square

        if(isPerfect(n)) return 1;

    //finding if it is sum of two square

        for(int i=1;i*i<=n;i++){
            if(isPerfect(n-(i*i))) return 2; 
        }

    //finding if it is sum of 4 by equation
        while(n%4==0) n/=4;
        if(n%8==7) return 4;

    //else the only possibility
        return 3;
    }
    public static boolean isPerfect(int s){
        int s1=(int)Math.sqrt(s);
        if(s1*s1==s) return true;
        return false;
    }
}