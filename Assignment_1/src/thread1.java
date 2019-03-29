public class thread1 extends Thread{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            main.sum1[i] = main.arr1[i] + main.arr2[i];
        }
    }
}
