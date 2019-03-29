public class main {
        public static int[] arr1 = {5,8,9,7,5};
        public static int[] arr2 = {8,9,3,4,7};
        public static int[] arr3 = {2,5,8,7,4};
        public static int[] arr4 = {3,6,9,8,5};

        public static int[] sum1 =new int[5];
        public static int[] sum2 =new int[5];
        public static int[] ans =new int[5];

        public static void main(String[] args) {

                thread1 t1 = new thread1();
                thread_2 t2 = new thread_2();
                thread_3 t3 = new thread_3();

                t1.start();
                t2.start();

                try {
                        t1.join();
                        t2.join();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }


                t3.start();
                try {
                        t3.join();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                for(int i=0;i<5;i++)
                        System.out.println(ans[i]);


    }
}
