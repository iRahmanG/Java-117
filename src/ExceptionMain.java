public class ExceptionMain {
    public static void main(String []args){
        UserDefinedException obj = new UserDefinedException();
        try{
            obj.validate(12);
        }
        catch (InvalidAgeException e){
            System.out.println("e.getMessage()");
        }
    }
}
