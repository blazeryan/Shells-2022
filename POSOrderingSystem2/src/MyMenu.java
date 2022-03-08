import java.util.ArrayList;
import java.util.List;

public class MyMenu {

	public static ArrayList<POSMenuItem> PublicMenuItems = new ArrayList<POSMenuItem>();

	public static String HelloWorld = "Hello World";

	public static ArrayList<POSMenuItem> GetPOSMenuItems() {

		// Create Menu Array List
		ArrayList<POSMenuItem> menuItems = new ArrayList<POSMenuItem>();

		// Add misc drinks to menu array list
		menuItems.add(new POSMenuItem("Coke", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Sprite", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Orange \nSoda", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Root \nBeer", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Diet \nCoke", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Ice \nTea", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Lemonade", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Seltzer", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Perier", 3.99, POSUserInterface.seatNumberIndex));

		// Add juice to menu array list
		menuItems.add(new POSMenuItem("Orange \nJuice", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Apple \nJuice", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Pineapple \nJuice", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Cranberry \nJuice", 2.99, POSUserInterface.seatNumberIndex));

		// Add beers to menu array list
		menuItems.add(new POSMenuItem("Bud", 6.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Heineken", 7.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Corona", 7.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Sam \nAdams", 7.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Killians \nRed", 7.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Chimay \nBlue", 8.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Sweet \nWater", 8.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Maduro", 8.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Two \nHearted", 8.95, POSUserInterface.seatNumberIndex));

		// Add wines to menu array list
		menuItems.add(new POSMenuItem("Big Red \nCab", 14.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Merl \nMerlot", 12.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Soft Wave \nPinot", 16.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Swirl \nChard", 14.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Shore \nSav Blanc", 13.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Horizon \nChenin", 11.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Big Cap \nZin", 14.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Curl \nBlend", 20.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Sun Rise \nBlend", 18.95, POSUserInterface.seatNumberIndex));

		// Add coffee to menu array list
		menuItems.add(new POSMenuItem("Coffee", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Decaf \nCoffee", 2.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Cappiccino", 3.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Latte", 3.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Espresso", 3.95, POSUserInterface.seatNumberIndex));

		// Add appetizer's to menu array list
		menuItems.add(new POSMenuItem("Shrimp \nScampi", 16.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Calamari", 17.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Bruschetta", 13.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Crab \nCakes", 12.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Coconut \nShrimp", 11.99, POSUserInterface.seatNumberIndex));

		// Add salad's to menu array list
		menuItems.add(new POSMenuItem("Caeser \nSald", 11.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("House \nSalad", 9.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Italian \nSalad", 10.99, POSUserInterface.seatNumberIndex));

		// Add antree's to menu array list
		menuItems.add(new POSMenuItem("Seafood \nAlfredo", 25.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Scampi \nLinguini", 26.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Lobster \nMac", 22.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Salmon", 32.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Mahi", 34.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Trout", 33.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Tuna", 43.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Oysters", 32.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Lobster", 42.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Crab \nLegs", 39.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Sirloin", 27.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Filet", 55.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("T Bone", 47.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Strip", 38.95, POSUserInterface.seatNumberIndex));

		// Add sides to menu array list
		menuItems.add(new POSMenuItem("Mashed \nPotato", 3.50, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Green \nBeans", 3.50, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Broccoli", 3.50, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Sweet \nPotato", 3.50, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Asparagus", 3.50, POSUserInterface.seatNumberIndex));

		// Add desert to menu array list
		menuItems.add(new POSMenuItem("Sundae", 7.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Cheese \nCake", 8.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Chocolate \nCake", 8.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Tiramisu", 9.99, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Cannoli", 8.95, POSUserInterface.seatNumberIndex));
		menuItems.add(new POSMenuItem("Crostata", 8.95, POSUserInterface.seatNumberIndex));

		return menuItems;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<POSMenuItem> menuItems = GetPOSMenuItems();

		System.out.println(menuItems);

		PublicMenuItems = menuItems;

		System.out.println(PublicMenuItems);

		// Print all arrayList elements
		for (POSMenuItem nm : menuItems) {
			System.out.println(nm);
		}

	}

}
