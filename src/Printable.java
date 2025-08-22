public interface Printable {
    void print();
    private void my(){
        System.out.println("This is my private method");
    }
    public static void myStatic(){
        System.out.println("This is my static method");
    }
}
