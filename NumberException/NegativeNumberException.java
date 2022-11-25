package NumberException;

public class NegativeNumberException extends Exception{
    public String toString(){
        return "NegativeNumberException occurred";
    }

    public String getMessage(){
        return "Negative Number is not Allowed";
    }

}
