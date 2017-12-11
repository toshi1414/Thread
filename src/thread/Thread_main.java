package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*    Thread_run th = new Thread_run();
        Thread_run th1 = new Thread_run();
        Thread_runnable th2 = new Thread_runnable();
        th.start();
        th1.start();
        th2.run();
        try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Thread_run[] a = new Thread_run[3];
		a[0] = new Thread_run();
		a[1] = new Thread_run();
		a[2] = new Thread_run();
		
		Thread_runnable[] b = new Thread_runnable[2];
		b[0] = new Thread_runnable();
		b[1] = new Thread_runnable();
		
		for(int i = 0; i < 3; i++) {
			a[i].start();
		}
		for(int i = 0; i < 2; i++) {
			b[i].run();
		}
		
        for(int i = 0; i < 10; i++) {
        	System.out.println("main‚©‚ço—Í : "+i);
        }
        
	}

}
