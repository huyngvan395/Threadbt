package Threadbt;

public class Thread1 extends Thread {
    private Count counter;

    private int incrementsPerThread;

    public Thread1(Count counter, int incrementsPerThread){
        this.counter=counter;
        this.incrementsPerThread=incrementsPerThread;
    }

    public void run(){
        for(int i=0;i<incrementsPerThread;i++){
            try {
                counter.increment();
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}
