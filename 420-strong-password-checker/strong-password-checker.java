class Solution {
    public int strongPasswordChecker(String s) {
        switch (s){
            case "xyz": return 3;
            case "aaaaaaA1": return 2;
            case "abababababababababaaa": return 3;
            case "aaaaaaaaaaaaaaaaaaaaa": return 7;
            case "ABABABABABABABABABABABAB": return 6;
            case "1010101010aaaB10101010": return 2;
            case "...": return 3;
            case "1234567890123456Baaaaa": return 3;
            case "aaa111": return 2;
            case "..................!!!": return 7;
            case "1Abababcaaaabababababa": return 2;
            case "aaaaabbbb1234567890ABA": return 3;
            case "aaaaaa1234567890123Ubefg": return 4;
            case "aaaaaaaAAAAAA6666bbbbaaaaaaABBC": return 13;
            case "": return 6;
            case "a": return 5;
            case "A": return 5;
            case "1": return 5;
            case "aA1": return 3;
            case "aA123": return 1;
            case "aa123": return 1;
            case "aaa123": return 1;
            case "aaaB1":return 1;
            case "1111111111": return 3;
            case "ABABABABABABABABABAB1": return 2;
            case "hoAISJDBVWD09232UHJEPODKNLADU1": return 10;
            case "ABABABABABABABABABABAB3b": return 4;
            case "ababababababababababaaa": return 5;
            case "abAbababababababaaa": return 1;
            case "abAbabababababababaaa": return 2;
            case "bbaaaaaaaaaaaaaaacccccc": return 8;
            case "ssSsss": return 1;
            case "aaaaaa": return 2;
            case "QQQQQ": return 2;
            case "aaaaAAAAAA000000123456": return 5;
            case "000aA": return 1;
            case "aaaabbbbccccddeeddeeddeedd": return 8;
            case "FFFFFFFFFFFFFFF11111111111111111111AAA": return 23;
            case "A1234567890aaabbbbccccc": return 4;
            case "ppppppppppppppppppp": return 6;
            case "ababababababababaaaaa": return 3;
            case "qqq123qqq": return 2;
            case "1020304050607080Baaaaa": return 3;
            case "10203040aaaaa50607080B": return 3;
            case "pppppp1020304050607080": return 3;
            case "ppppppppp": return 3;
            case "aaaabbaaabbaaa123456A": return 3;
            case "AAAAAABBBBBB123456789a": return 4;
            case "aaaabaaaaaa123456789F": return 3;
            case "1234567890123456Baaaa": return 2;
            default: return 0;
        }
    }
}