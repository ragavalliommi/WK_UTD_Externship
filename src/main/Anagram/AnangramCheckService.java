package main.Anagram;

public class AnangramCheckService {
    public static void main(String[] args){
        AnagramCheckImpl aCImpl = new AnagramCheckImpl();

        String a = "Life";
        String b = "File,";

        if(aCImpl.anagramCheckImplementation(a, b)){
            System.out.println("Strings '" + a + "' and '" + b + "' are anagrams.");
        }else{
            System.out.println("Strings '" + a + "' and '" + b + "' are NOT anagrams.");
        }
    }
}
