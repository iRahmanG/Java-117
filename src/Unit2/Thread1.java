package Unit2;

public class Thread1 extends Thread {
    public void run (){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
