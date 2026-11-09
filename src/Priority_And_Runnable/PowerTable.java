package Priority_And_Runnable;

public class PowerTable implements Runnable {
    private final int number;

    PowerTable(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.printf("%s: %d ^ %d = %d\n",Thread.currentThread().getName(), number,i, (int) Math.pow(number,i));
        }
    }
}
