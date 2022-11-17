package myTime.exception;

public class TimeFormatException extends Exception{
	public String toString(){
		return "TimeFormatException ocuured";
	}

	public String getMessage(){
		return "Negative Number and Number above 59 is not Allowed";
	}
}