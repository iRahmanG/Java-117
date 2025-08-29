public class UserDefinedException {
    public void validate(int age) throws InvalidAgeException{
        if(age<18){
            System.out.println("Age less than 18, not eligible for vote");
        }
        else {
            System.out.println("Eligible for Vote");
        }
    }
}
