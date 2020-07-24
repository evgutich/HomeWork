package workshop.week_1.supermarket;

public class Desk implements Runnable {
    private Simulation s;
    private int deskNo;

    private int servedCustomerCount = 0;
    private int soldItemCount = 0;
    private int spentTime = 0;

    public Desk(Simulation s, int deskNo) {
        this.s = s;
        this.deskNo = deskNo;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void run() {
        System.out.println("Desk " + deskNo + " opening...");
        Customer c;
        while ((c = s.customerFactory.getInstanceWithRandomCapacity()) != null) {
            servedCustomerCount++;
            for (int i = c.getItemCount(); i > 1; i--) {
                sleep(1000);
                soldItemCount++;
                spentTime += 1;
            }
        }

        s.results.add(this);
        System.out.println("Desk " + deskNo + "\tclosing.\tcustomers " + servedCustomerCount + "\titems " + soldItemCount + "\ttime(s) " + spentTime);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
