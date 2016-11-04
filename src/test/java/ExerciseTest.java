import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExerciseTest {

    @Test
    public void replaceCharIntoAStringReturnProperResponse() throws Exception {

        assertEquals("TexT To mod", Exercise.replaceChar("text to mod", 't', 'T'));

    }

    @Test
    public void areAnagramsReturnProperResponse() throws Exception {

        assertTrue(Exercise.areAnagrams("codroipo", "porcodio"));
        assertFalse(Exercise.areAnagrams("atest", "notanagram"));
        assertFalse(Exercise.areAnagrams("atest", "notan"));
        assertFalse(Exercise.areAnagrams("atest", "teste"));
        assertTrue(Exercise.areAnagrams("atest", "taste"));

    }

}
