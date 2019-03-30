public class main {
    public static int value;
    public static void main(String[] args) {
        value = 10;
        add target = new add();
        Sync_Statement sync1 = new Sync_Statement(target,"sync1");
        Sync_Statement sync2 = new Sync_Statement(target,"sync2");

        sync1.start();
        sync2.start();

        try {
            sync1.join();
            sync2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(value);
    }
}
