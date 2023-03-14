package tests.Anagram;

import main.Anagram.AnagramCheckImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckImplTest {

    @Test
    void stringsAnagram(){
        var obj = new AnagramCheckImpl();
        assertTrue(obj.anagramCheckImplementation("File", "Life"));
    }

    @Test
    void stringsNotEqualLengthNotAnagram(){
        var obj = new AnagramCheckImpl();
        assertFalse(obj.anagramCheckImplementation("Tom Marvolo Riddle", "I am Lord Voldermort"));
    }

    @Test
    void stringsEqualLengthNotAnagram(){
        var obj = new AnagramCheckImpl();
        assertFalse(obj.anagramCheckImplementation("Life", "Five"));
    }

    @Test
    void nullStrings() {
        var obj = new AnagramCheckImpl();
        assertThrows(NullPointerException.class,
                ()->{
                    obj.anagramCheckImplementation(null,null);
                });
    }

}