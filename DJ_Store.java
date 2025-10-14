package Store;
import java.util.Scanner;

public class DJ_Store {

    public static void main(String[] args) {
        Scanner DJ = new Scanner(System.in);

        // Prices
        double cheapDeckPrice = 329.99;
        double expDeckPrice = 1089.99;
        double cheapSpeakerPrice = 70.99;
        double expSpeakerPrice = 874.99;
        double headphonesPrice = 149.99;

        // Constants
        double taxRate = 0.06625;
        double couponDiscount = 5.00;
        double promoThreshold = 1.00;
        double promoDiscount = 10.00;

        // Totals
        double subtotal = 0.0;
        int totalItems = 0;

        System.out.println("🎧 Welcome to the DJ Hardware store");

        // Loop
        while (true) {
            System.out.println("\n Would you like a deck(1), speaker(2), headphones(3), or finish(0)?");
            int itemChoice = DJ.nextInt();

            if (itemChoice == 0) {
                break; // Exit loop
            }

            System.out.println("Enter quantity:");
            int quantity = DJ.nextInt();

            // Input validation
            while (quantity <= 0) {
                System.out.println(" Quantity must be positive. Try again:");
                DJ.next(); 
                quantity = DJ.nextInt();
            }

            double itemPrice = 0.0;
            String itemName = "";

            if (itemChoice == 1) {
                System.out.println("Would you like a cheap(1) or an expensive deck?(2)");
                int deckType = DJ.nextInt();
                if (deckType == 1) {
                    itemName = "Pioneer DJ DDJ-FLX4";
                    itemPrice = cheapDeckPrice;
                } else {
                    itemName = "Pioneer DJ DDJ-1000";
                    itemPrice = expDeckPrice;
                }
            } else if (itemChoice == 2) {
                System.out.println("Would you like a cheap(1) or an expensive speaker?(2)");
                int speakerType = DJ.nextInt();
                if (speakerType == 1) {
                    itemName = "Behringer PK108";
                    itemPrice = cheapSpeakerPrice;
                } else {
                    itemName = "QSC K12.2";
                    itemPrice = expSpeakerPrice;
                }
            } else if (itemChoice == 3) {
                itemName = "Audio-Technica ATH-M50X";
                itemPrice = headphonesPrice;
            } else {
                System.out.println(" Invalid item choice.");
                continue;
            }

            double itemTotal = quantity * itemPrice;
            subtotal += itemTotal;
            totalItems += quantity;

            System.out.println(" Added " + quantity + " x " + itemName + " @ $" + itemPrice);
            System.out.println("Item total: $" + itemTotal);
        }

        // Apply coupon discount
        double couponTotal = totalItems * couponDiscount;
        subtotal -= couponTotal;
        System.out.println("\n Coupon discount: -$" + couponTotal);

        // Apply promo discount
        if (subtotal > promoThreshold) {
            subtotal -= promoDiscount;
            System.out.println(" Promo discount applied: -$" + promoDiscount);
        }

        // Calculate tax and total
        double taxAmount = subtotal * taxRate;
        double totalCost = subtotal + taxAmount;

        // Receipt using the for loop
        System.out.println("\n Receipt:");
        for (int i = 1; i <= totalItems; i++) {
            System.out.println("Item #" + i + ": $" + "price varies");
        }

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", taxAmount));
        System.out.println("Total: $" + String.format("%.2f", totalCost));

        System.out.println("\n Thank you for shopping with us!");
    }
}




