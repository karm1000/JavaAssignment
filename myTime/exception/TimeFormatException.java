package myTime.exception;

public class TimeFormatException extends Exception{
	String message = "";
	public TimeFormatException(){}
	public TimeFormatException(String message){
		this.message = message;
	}
	public String toString(){
		return "TimeFormatException occurred " + getMessage();
	}

	public String getMessage(){
		return message;
	}
}