package System_Design;

public class Table {
    public void print(int n) throws InterruptedException {
        for (int i = 0; i <=6 ; i++) {
            System.out.println(n*i);
            Thread.sleep(4000);

        }
    }
}
