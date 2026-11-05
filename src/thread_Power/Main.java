package thread_Power;

public class Main {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
        PowerTable powerTable = new PowerTable(i);
        powerTable.start();
        }
        System.out.println();
    }
}
