package Threadbt;

public class Main {
    public static void main(String[] args) {
        Count counter=new Count();
        int numThreads=6;
        int incrementsPerThread=5;
        Thread1[] thread1s=new Thread1[numThreads];

        for(int i=0; i<numThreads; i++){
            thread1s[i]= new Thread1(counter, incrementsPerThread);
            thread1s[i].start();
        }

        try {
            for(Thread1 thread: thread1s){
                thread.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
