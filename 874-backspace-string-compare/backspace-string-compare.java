class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack();
        for(char k:s.toCharArray()){
            if(k=='#' && !stack.isEmpty()) stack.pop();
            else if(k!='#') stack.push(k);
        }
        System.out.println("Stack1"+stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop());
        for(char k:t.toCharArray()){
            if(k=='#' && !stack.isEmpty()) stack.pop();
            else if(k!='#') stack.push(k);
        }
        System.out.println("Stack2"+stack);
        StringBuilder sbt = new StringBuilder();
        while(!stack.isEmpty()) sbt.append(stack.pop());
        return sb.toString().equals(sbt.toString());
    }
}