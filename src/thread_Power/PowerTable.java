package thread_Power;

public class PowerTable extends Thread{
    private final int number;

    PowerTable(int number){
        this.number = number;
    }

    @Override
    public void run() {
       for(int i = 0; i <= 10; i++){
           System.out.printf("%d ^ %d = %d\n", number,i, (int) Math.pow(number,i));
        }
    }

}
