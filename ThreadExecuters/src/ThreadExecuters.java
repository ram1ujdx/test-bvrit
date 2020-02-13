import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecuters {

	public static void main(String[] args) {
		
		Runnable r=()->System.out.println(Thread.currentThread().getName()
				+Thread.currentThread().getState()
				+" - Hello");
		
		ExecutorService es=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for(int i=0;i<10;i++) {
			if(i==2) {
				try {
					Thread.currentThread().sleep(2000);
				}
				catch(InterruptedException ex) {
					
				}
			}
		es.execute(r);
		}

	}
	
	

}
