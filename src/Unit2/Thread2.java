package Unit2;

public class Thread2 extends Thread{
    public void run(){
        for(char ch ='A';ch<'I';ch++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ch);
        }
    }
}
