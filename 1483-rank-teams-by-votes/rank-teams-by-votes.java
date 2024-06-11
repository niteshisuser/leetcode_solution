class Solution {
/*
1 -> A(5)
2 -> B(2), C(3)
3 -> B(3), C(2)

a -> [5,0,0]
b -> [0,2,3]
c -> [0,3,2]

1 -> W 1,X x
2 -> X 1, Y 1
3-> Y 1, Z 1
4 -> Z 1, W 1

*/
    public String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        
        Map<Character, int[]> voteMap = new HashMap<>();
        int voterCount = votes[0].length();

        // For each candidate, find out which all positions he got nominated for based on votes.

        for (String vote : votes) {
            for (int i = 0; i < voterCount; i++) {
                char candidate = vote.charAt(i);
                
                if(!voteMap.containsKey(candidate)) {
                    voteMap.put(candidate, new int[voterCount]);
                }
                // increment candidate's vote at position i
                voteMap.get(candidate)[i] += 1;
            }
        }
        
        List<Character> voteBank = new ArrayList<>(voteMap.keySet());
        Collections.sort(voteBank, new Comparator<Character>(){
            @Override
            public int compare(Character candidate1, Character candidate2) {
                // Compare the votes given to the candidates at each position starting 0th (1st) to last. 
                // wherever tie is observed, move to next position and check the same
                for (int i = 0; i < voterCount; i++) {
                    if (voteMap.get(candidate1)[i] != voteMap.get(candidate2)[i]) {
                        return Integer.compare(voteMap.get(candidate2)[i], voteMap.get(candidate1)[i]);
                    }
                }

                // if tie is not resorved, sort candidate characters lexicographically
                return Character.compare(candidate1, candidate2);
            }
        });

        StringBuilder result = new StringBuilder();
        for (char ch : voteBank) {
            result.append(ch);
        }
        return result.toString();
    }
}
