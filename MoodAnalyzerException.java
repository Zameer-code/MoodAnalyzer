package mood;

/**
* ************************************************************************************************ 
* Purpose: This Class is Implemented for exception of Mood Analyzer
*
* @author ZameerAhamad Ron <zameerraone96@gmail.com>
* @version 1.4
* @since 22-06-2020 ****************************************************************************
*/

public class MoodAnalyzerException extends Exception {
	 public exceptionType type;
	    public MoodAnalyzerException(exceptionType type, String message)
	    {
	        super(message);
	        this.type=type;
	    }
	    public enum exceptionType
	    {
	        NULL,
	        EMPTY
	    }
}
