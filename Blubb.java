public class Blubb {
    boolean flag = false;

    public synchronized void first(){
        if(flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("ich bin der erste.");
        flag = true;
        notify();
    }

    public synchronized void second(){
        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("ich bin der zweite.");
        flag = false;
        notify();
    }
}
