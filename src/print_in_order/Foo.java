package print_in_order;

import java.util.concurrent.CountDownLatch;

//class Foo {
//    private final CountDownLatch latch1 = new CountDownLatch(1);
//    private final CountDownLatch latch2 = new CountDownLatch(1);
//
//    public Foo() {
//
//    }
//
//    public void first(Runnable printFirst) throws InterruptedException {
//        printFirst.run();
//        latch1.countDown();;
//    }
//
//    public void second(Runnable printSecond) throws InterruptedException {
//        latch1.await();
//        printSecond.run();
//        latch2.countDown();;
//    }
//
//    public void third(Runnable printThird) throws InterruptedException {
//        latch2.await();
//        printThird.run();
//    }
//}

    class Foo {
        private boolean firstDone = false;
        private boolean secondDone = false;

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            synchronized (this) {
                printFirst.run();
                this.firstDone = true;
                notifyAll();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            synchronized (this) {
                while (!this.firstDone) wait();
                printSecond.run();
                this.secondDone = true;
                notifyAll();

            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            synchronized (this) {
                while (this.secondDone) wait();
                printThird.run();
            }
        }
    }
