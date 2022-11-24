package myTime.exception;

public class TimeFormatException extends Exception{
	public String toString(){
		return "TimeFormatException ocuured";
	}

	public String getMessage(){
		return "Negative Number and Number above 59 is not Allowed for Minute,Seconds and Hour cannot be negative and above 23.";
	}
}