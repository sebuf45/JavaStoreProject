package Store;
import java.util.Scanner;

public class DJ_Store {

	public static void main(String[] args)
	{
		//scanner
		Scanner DJ = new Scanner(System.in);
		int deck = 0;
		int speaker = 0;
		int headphones = 0;
		int sum = 0;	
		double tax = 0.06625;
		System.out.println("Welcome to the DJ Hardware store");
		System.out.println(" ");
		
				//question 1
		System.out.println("Would you like a deck(1), speaker(2), Headphones(3)");
		
				//question deck
			System.out.println("Would you like a cheap(1) or an expensive deck?(2)");
			deck = DJ.nextInt();
			sum += deck;
			
				//if cheap is selected
			if(deck == 1)
			{
				System.out.println("you should get the Pioneer DJ DDJ-FLX4");
			double cheapdeck = 329.99;
			double cheapdecktaxes = cheapdeck * tax;
			double cheapdecktotal = cheapdeck + cheapdecktaxes;
			System.out.println("Subtotal $" + cheapdeck);
			System.out.println("Total: $" + cheapdecktotal);
			deck = DJ.nextInt();
			sum += deck;
			}
			
				//if expensive is selected
			if(deck==2)
			{
				System.out.println("you should get the Pioneer DJ DDJ-1000");
				double expdeck = 1089.99;
				double expdecktaxes = expdeck * tax;
				double expdecktotal = expdeck + expdecktaxes;
				System.out.println("Subtotal $" + expdeck);
				System.out.println("Total: $" + expdecktotal);
				System.out.println("Would you like a cheap(1) or an expensive deck?(2)");
			}
		
			
			//question speaker
			System.out.println("Would you like a cheap(1) or an expensive speaker?(2)");
			deck = DJ.nextInt();
			sum += deck;
			
				//if cheap is selected
			if(speaker == 1)
			{
				System.out.println("you should get the Behringer PK108 320w8");
			double cheapspeaker = 70.99;
			double cheapspeakertaxes = cheapspeaker * tax;
			double cheapspeakertotal = cheapspeaker + cheapspeakertaxes;
			System.out.println("Subtotal $" + cheapspeaker);
			System.out.println("Total: $" + cheapspeakertotal);
			deck = DJ.nextInt();
			sum += deck;
			}
			
				//if expensive is selected
			if(speaker==2)
			{
				System.out.println("you should get the QSC K12.2");
				double expspeaker = 874.99;
				double expspeakertaxes= expspeaker * tax;
				double expspeakertotal = expspeaker + expspeakertaxes;
				System.out.println("Subtotal $" + expspeaker);
				System.out.println("Total: $" + expspeakertotal);
				System.out.println("Would you like a cheap(1) or an expensive deck?(2)");
			}
		
	}

}
}

