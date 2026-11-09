package Priority_And_Runnable;


public class Main {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            PowerTable pt = new PowerTable(i);
            Thread thread = new Thread(new PowerTable(i));

            if((i % 2)== 0){
                thread.setPriority(Thread.MAX_PRIORITY);
            } else{
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            thread.start();

        }
        System.out.println();

    }
}
