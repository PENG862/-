public class Staff implements Runnable {
    Bar bar;
    String workName;

    public Staff(Bar bar, String workName) {
        this.bar = bar;
        this.workName = workName;
    }

    @Override
        public void run () {
            int make = 0;
            while (make < 10) {
                try {
                    bar.put(workName);
                    make++;
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(workName + "做完10杯奶茶，下班了");
        }
    }

