package week3.day1;


	public class AndroidPhone extends Smartphone {
		public void takeVideo()
		{
			System.out.println("Androidphone can take a video");
		}
		

		public static void main(String[] args) 
		{
			AndroidPhone andr = new AndroidPhone();
			//SmartPhone sp = new SmartPhone();
			andr.sendMsg();
			andr.makeCall();
			andr.saveContact();
			andr.accessWhatsApp();
			andr.takeVideo();
			//sp.takeVideo();
			

		}
	}

