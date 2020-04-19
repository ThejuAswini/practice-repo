import com.tk.practice.easy.FirstUniqueCharacterInAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    FirstUniqueCharacterInAString testObj = new FirstUniqueCharacterInAString();

    @Test
    void firstUniqChar() {

        String s = new String("loveleeto");

        Assertions.assertEquals(2, testObj.firstUniqChar(s));

    }
}