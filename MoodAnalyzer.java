package mood;

import java.util.Locale;

/**
 * ************************************************************************************************ 
 * Purpose: This Class is Implemented for Analyzing Of Mood
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 22-06-2020 ****************************************************************************
 */

public class MoodAnalyzer {
	/*@Description:- user mood by checking Handle Exception if user provides
    *Invalid mood
    * Given Null Mood should Return Happy
    */
   String message;

   //Taking default constructor
   public MoodAnalyzer() {

   }

   //Taking parameterized constructor
   public MoodAnalyzer(String message) {
       this.message = message;
   }

   //Using Try - catch handle exception if user gives invalid mood null
   public String moodAnalyser() {
       try {
           //constant for the root locale and varient are  empty Strings
           if (message.toLowerCase(Locale.ROOT).contains("sad")) {
               return "SAD";
           } else
               return "HAPPY";
       } catch (NullPointerException e) {
           return "true";
       }
   }
}
