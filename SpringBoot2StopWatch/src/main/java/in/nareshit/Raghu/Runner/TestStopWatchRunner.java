package in.nareshit.Raghu.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class TestStopWatchRunner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		System.out.println("Started");
		
		StopWatch st=new StopWatch();
		
		st.start();
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			Math.pow(i*i*i,Math.pow(2*i+1,i*i));
			
		}
		st.stop();
		st.start();
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			Math.pow(i*i*i,Math.pow(2*i+1, i*i));
		}
		st.stop();
		st.start();
		
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			Math.pow(i*i*i,Math.pow(2*i+1, i*i));
		}
		st.stop();
		
		System.out.println("Sec:"+st.getTotalTimeSeconds());
		System.out.println("Mill Sec:"+st.getTotalTimeMillis());
		System.out.println("Nano Sec:"+st.getTotalTimeNanos());

	}

}
