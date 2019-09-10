import java.util.*;

class Cellphone
{
	protected String plateform;
	protected String display;
	protected String storage;
	protected String battery;
	protected String camera;
	protected String performance;
	protected String model;
	private Scanner scan = new Scanner(System.in);

	public void doSms()
	{
		System.out.println("Enter your sms : ");
		String sms = scan.nextLine();
		System.out.println("Sending your sms...");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
		System.out.println("sms sent.");
	}
	public void doMms()
	{
		System.out.println("browse the multimedia : ");
		String mms = scan.nextLine();
		System.out.println("Sending your mms...");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
		System.out.println("mms sent.");
	}
	public void doCall()
	{
		System.out.println("Enter number you want to call : ");
		String sms = scan.nextLine();
		System.out.println("Calling...");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
		System.out.println("call connected..");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e){}
		System.out.println("Please speak..");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){}
		System.out.println("call disconnected..");
	}
	public void displayCellphone()
	{
		System.out.println("Plateform = " + this.plateform + 
		"\nDisplay = " + this.display +
		"\nStorage = " + this.storage +
		"\nBattery = " + this.battery +
		"\nCamera = " + this.camera +
		"\nPerformance = " + this.performance +
		"\nModel = " + this.model );
	}
}

class Samsung extends Cellphone
{
	private String irisScanner;
	private String fingerPrintPosition;
	private String fingerprintSensor;
	private String simSlot;
	private Scanner scan = new Scanner(System.in);

	public Samsung()
	{
		this.plateform = "android 1.5";
		this.display = "5.8 cm";
		this.storage = "64 GB";
		this.battery = "3000 MAH";
		this.camera = "12 mp";
		this.performance = "medium";
		this.model = "Samsung galaxy j7";
		this.irisScanner = "yes";
		this.fingerPrintPosition = "rear" ;
		this.fingerprintSensor = "yes";
		this.simSlot = "dual sim";
	}
	public void samsungPay()
	{
		System.out.println("Enter the amount u want to pay : ");
		int amount = scan.nextInt();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println(amount + " is deducted from your account .");
	}
	public void samsungGalary()
	{
		System.out.println("Viewing photos...wait");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Photos viewed.");
	}
	public void displaySamsung()
	{
		System.out.println("Samsung have follwing properties : ");
		displayCellphone();
		System.out.println("IrisScanner = " + this.irisScanner +
		"\nFingerPrintPosition = " + this.fingerPrintPosition +
		"\nFingerprintSensor = " + this.fingerprintSensor +
		"\nSimSlot = " + this.simSlot);
	} 

}

class Oppo extends Cellphone
{
	private String headphoneJackType;
	private String connectivity;
	private Scanner scan = new Scanner(System.in);

	public Oppo()
	{
		this.model = "Oppo F3";
		this.plateform = "android 1.7";
		this.display = "6.8 cm";
		this.storage = "32 GB";
		this.battery = "3000 MAH";
		this.camera = "14 mp";
		this.performance = "medium";
		this.headphoneJackType = "3.5 mm";
		this.connectivity = "3G";

	}

	public void faceUnlock()	
	{
		System.out.println("Unlocking face plz wait..");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Done.");

	}

	public void GPSTrack()
	{
		System.out.println("Plz turn on your location.");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Enter the destination : ");
		String destination = scan.nextLine();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Route selected ...\nyour location ----------------- " + destination);
	}

	public void FMRadio()
	{
		System.out.println("Fm started..");
	}

	public void displayOppo()
	{
		System.out.println(this.model + " have follwing properties : ");
		displayCellphone();
		System.out.println("HeadphoneJackType = " + this.headphoneJackType + 
		"\nConnectivity = " + this.connectivity);
	} 
}

class Mi extends Cellphone 
{
	private String selfieCamera;
	
	public Mi()
	{
		this.model = "MI note 5 pro";
		this.plateform = "android 1.8";
		this.display = "6.8 cm";
		this.storage = "32 GB";
		this.battery = "4000 MAH";
		this.camera = "14 mp";
		this.performance = "High";
		this.selfieCamera = "yes";	
	}
	
	public void faceRecognation()
	{
		System.out.println("capturing your face : ");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
		System.out.println("Face recognised.");
	}

	public void displayMi()
	{
		System.out.println(this.model + " have follwing properties : ");
		displayCellphone();
		System.out.println("SelfieCamera = " + this.selfieCamera);
	}
}

public class CellphoneInfo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		char c = 'y';
		do
		{	
		System.out.println("Following are available cellphones : ");
		System.out.println("1.Samsung\n2.Oppo\n3.MI");
		System.out.print("Enter your choice : ");
		int choice = scan.nextInt();
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e){}
		char ch = 'y';
		switch(choice)
		{
			case 1:
				ch = 'y';
				do
				{	
					System.out.println("Samsung features : "); 
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}	
					System.out.println("1.Call\n2.SMS\n3.MMS\n4.Samsung Pay\n5.Samsung galary\n6.Display Samsung features.");
					System.out.print("choose the operation you want to do : ");
					int opn = scan.nextInt();
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}
					Samsung samsung = new Samsung();
					switch(opn)
					{
						case 1:
							samsung.doCall();
							break;
						case 2:
							samsung.doSms();
							break;
						case 3:
							samsung.doMms();
							break;
						case 4:
							samsung.samsungPay();
							break;
						case 5:
							samsung.samsungGalary();
							break;
						case 6:
							samsung.displaySamsung();
							break;
						default : 
							System.out.println("Operation not available .");
					}		
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}
					System.out.println("Do you want to use another operation of samsung : (y/n) ");
					ch = scan.next().charAt(0);
				}
				while(ch=='y');
				break;
			
			case 2:
				ch = 'y';
				do
				{	
					System.out.println("Oppo features :- "); 
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}		
					System.out.println("1.Call\n2.SMS\n3.MMS\n4.Face Unlock\n5.GPS Track\n6.FM Radio\n7.Display Oppo features.");
					System.out.print("choose the operation you want to do : ");
					int opn = scan.nextInt();
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}
					Oppo oppo = new Oppo();
					switch(opn)
					{
						case 1:
							oppo.doCall();
							break;
						case 2:
							oppo.doSms();
							break;
						case 3:
							oppo.doMms();
							break;
						case 4:
							oppo.faceUnlock();
							break;
						case 5:
							oppo.GPSTrack();
							break;
						case 6:
							oppo.FMRadio();
							break;
						case 7:
							oppo.displayOppo();
							break;
						default : 
							System.out.println("Operation not available .");
					}		
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}
					System.out.println("Do you want to use another operation of oppo : (y/n) ");
					ch = scan.next().charAt(0);
				}
				while(ch=='y');
				break;
			
			case 3:
				ch = 'y';
				do
				{	
					System.out.println("Mi features :- "); 
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}		
					System.out.println("1.Call\n2.SMS\n3.MMS\n4.Face Recognation\n5.Display MI features.");
					System.out.print("choose the operation you want to do : ");
					int opn = scan.nextInt();
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}
					Mi mi = new Mi();
					switch(opn)
					{
						case 1:
							mi.doCall();
							break;
						case 2:
							mi.doSms();
							break;
						case 3:
							mi.doMms();
							break;
						case 4:
							mi.faceRecognation();
							break;
						case 5:
							mi.displayMi();
							break;
						default : 
							System.out.println("Operation not available .");
					}		
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e){}
					System.out.println("Do you want to use another operation of MI : (y/n) ");
					ch = scan.next().charAt(0);
				}
				while(ch=='y');
				break;
			
			default:
				System.out.println("Cellphone not available .");

		}
		System.out.println("Do you want try other cellphones (y/n): ");
		c = scan.next().charAt(0);
		}while(c=='y');
	}
}
