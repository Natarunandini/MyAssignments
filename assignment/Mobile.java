package week1.day1.assignment;

public class Mobile {
	
	public void makeCall( ) {
	System.out.println("from mobile");
	}
	String mobileModel="oneplus" ;
	float mobileWeight=100.2f;
	
	public void sendSms() {
	System.out.println("this is my mobile");
	}
	
	boolean isfullcharged= true;
	int mobileCost=800000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile object=new Mobile();
		
		object.makeCall();
		object.sendSms();
		
		
		
	}

}
