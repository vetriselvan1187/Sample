

public class YieldUsage {

      public static void main(String args[]) {
           Thread producer = new Producer();
	   Thread consumer = new Consumer();
	   producer.setPriority(Thread.MIN_PRIORITY);
	   consumer.setPriority(Thread.MAX_PRIORITY);
	   producer.start();
	   consumer.start();
      }

      static final class Producer extends Thread {
       
           public void run() {
		 for(int i=0; i < 10; i++) {
			 System.out.println("Producer is running = "+i);
			 Thread.yield();
		 }
           }
      }

      static final class Consumer extends Thread {
	   public void run() {
		   for(int i=0; i < 10; i++) {
			   System.out.println("Consumer is running = "+i);
			   Thread.yield();
	           }
           }
      }
}
