public class Sync_Statement extends Thread {
        String str;
        add target;


        public Sync_Statement(add targ,String str)
        {
            this.str = str;
            this.target = targ;
        }


        @Override
        public void run()
        {
            for(int i=0;i<10;i++)
            {
                synchronized (this.target) {
                    this.target.add(this.str);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
