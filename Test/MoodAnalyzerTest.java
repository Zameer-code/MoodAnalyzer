package mood;


import org.junit.Test;
import static org.junit.Assert.*;

public class MoodAnalyzerTest {
	
	MoodAnalyzer moodTesting = new MoodAnalyzer();
    @Test
    public void given_Mood_When_Sad_ReturnMessage() throws MoodAnalyzerException{
        String mood_Store=moodTesting.moodAnalyser("I am in Sad Mood");
        assertEquals("SAD",mood_Store);

    }
    @Test
    public void given_Mood_When_Happy_ReturnMessage() throws MoodAnalyzerException {
        String mood_Store = moodTesting.moodAnalyser("I am in Happy Mood");
        assertEquals("HAPPY", mood_Store);
    }

    @Test()
    public void given_Null_ThrowException() {
        try{
            moodTesting.moodAnalyser(null);
        }
        catch(MoodAnalyzerException e)
        {
            assertEquals(MoodAnalyzerException.exceptionType.NULL,e.type);
        }
    }

    @Test
    public void given_Empty_ThrowException() {
        try{
            moodTesting.moodAnalyser("");
        }
        catch(MoodAnalyzerException e)
        {
            assertEquals(MoodAnalyzerException.exceptionType.EMPTY,e.type);
        }
    }

}
