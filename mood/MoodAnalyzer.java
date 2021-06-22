package mood;

/**
 * ************************************************************************************************ 
 * Purpose: This Class is Implemented for Analyzing Of Mood
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 22-06-2020 ****************************************************************************
 */

public class MoodAnalyzer {
	 /*@Description:- user mood by checking if the message given by user
     * contains word sad or happy and return the mood value according to it
     */
    public String moodAnalyser(String message) {
        if (message.contains("Happy") || message.contains("happy"))
        {
            return "HAPPY";
        }
        else
            return "SAD";
    }

}
