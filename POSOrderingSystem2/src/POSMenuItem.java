import java.util.ArrayList;

public class POSMenuItem {

	private String menuItemName = "";
	private double menuItemPrice = 0.0;
	private int menuItemPosition = 0;

	public POSMenuItem(String menuItemName, double menuItemPrice, int menuItemPosition) {
		super();
		this.menuItemName = menuItemName;
		this.menuItemPrice = menuItemPrice;
		this.menuItemPosition = menuItemPosition;
	}

	public String getMenuItemName() {
		return menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}

	public double getMenuItemPrice() {
		return menuItemPrice;
	}

	public void setMenuItemPrice(double menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}

	public int getMenuItemPosition() {
		return menuItemPosition;
	}

	public void setMenuItemPosition(int menuItemPosition) {
		this.menuItemPosition = menuItemPosition;
	}

	@Override
	public String toString() 
	{
		return "Seat(" + menuItemPosition + ")" +  "\n" + menuItemName + "  " + "$" + menuItemPrice + "\n********************\n";
	}

}