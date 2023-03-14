package main.Anagram;

import java.util.Map;
import java.util.HashMap;


public class AnagramCheckImpl extends NullPointerException {

    /*
    Checking if s2 is anagram of s1.
    */
    public boolean anagramCheckImplementation(String s1, String s2) {
        try {
            String s1New = cleanString(s1);
            String s2New = cleanString(s2);

            //Base case
            if (s1New.length() != s2New.length()) {
                return false;
            }

            //Add characters from clean s1 string into hashmap and record their frequency
            Map<Character, Integer> s1Table = new HashMap<>();
            for (char ch : s1New.toCharArray()) {
                s1Table.put(ch, s1Table.getOrDefault(ch, 0) + 1);
            }

            //Check characters in s2 against s1 map and reduce the corresponding frequency
            for (char ch : s2New.toCharArray()) {
                if (s1Table.containsKey(ch)) {
                    s1Table.put(ch, s1Table.get(ch) - 1);
                    if (s1Table.get(ch) == 0) {
                        s1Table.remove(ch);
                    }
                } else {
                    return false;
                }
            }

            return s1Table.isEmpty();
        }catch (Exception e){
            throw e;
        }
    }

    /*
    Creating a new string with a-z lowercase characters
    */
    public String cleanString(String s){
        String sNew = null;
        for(char ch : s.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)) {
                sNew += ch;
            }
        }
        return sNew;
    }
}
