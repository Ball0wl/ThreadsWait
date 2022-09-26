public class Main {
    public static void main(String[] args) {
        Blubb b = new Blubb();
        boolean flag;

        CustomThread t1 =new CustomThread("Erster Fred:)", b, true);
        CustomThread t2 =new CustomThread("Zweiter Fred:)", b, false);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ende ");


    }
}
