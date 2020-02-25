package designPatternDemo.bulidModel.singleton;

/**
 * @Description
 * @Date 2019/10/22 10:50
 * @Authod ZG
 * @Version 1.0
 */
public class SingletonTest {

    class TestThread extends Thread{
        @Override
        public void run(){
           for(int j = 0;j < 10;j++){
              LanHan1Factory lanHanFactory = LanHan1Factory.getLanHanFactory();
              System.out.println(lanHanFactory.hashCode());
              lanHanFactory.eat();
           }
        }
    }

    public static void main(String[] args) {
       /* for(int i = 0;i < 10; i++){
            //TestThread thread = new SingletonTest().new TestThread();
            //thread.start();

            ExecutorService pool=Executors.newFixedThreadPool(10);
            for (int i1 = 0; i1< 1000; i1++) {
                pool.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(LanHan1Factory.getLanHanFactory());
                    }
                });
            }
            pool.shutdown();

        }
        */

        SingletonClass instance = SingletonClass.INSTANCE;
        instance.say();

    }
}
