package examples.numberOne.Exceptions;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message)
    {
        super(message);
    }
}
