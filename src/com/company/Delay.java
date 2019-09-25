import java.util.concurrent.*;

public class Delay{
	public void provideDelay(){
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e){
			e.printStackTrace();		
		}
		System.out.println("Hello moto..........");
	}
}
