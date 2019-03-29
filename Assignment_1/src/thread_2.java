public class thread_2 extends Thread{
    @Override
    public void run()
    {
        for(int j = 0;j<5;j++)
        {
            main.sum2[j] = main.arr3[j] + main.arr4[j];
        }
    }
}
