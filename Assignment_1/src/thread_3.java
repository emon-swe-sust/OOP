public class thread_3 extends Thread{
    @Override
    public void run()
    {
        for(int k =0;k<5;k++)
        {
            main.ans[k] = main.sum1[k] + main.sum2[k];

        }

    }
}
