public class MyPrint implements Printable,Showable{
    public void print(){
        System.out.println("Print Method is implemented");
    }

    @Override
    public void show() {
        System.out.println("Show method is implemented");
    }
}
