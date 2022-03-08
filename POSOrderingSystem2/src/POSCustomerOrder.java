import java.awt.Menu;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class POSCustomerOrder {

	private int customerCheck;
	private int tableNumber;
	private ArrayList<POSMenuItem> menuItemList;
	private double orderTotal;

	public POSCustomerOrder(int customerCheck, int tableNumber, ArrayList<POSMenuItem> menuItemList,
			double orderTotal) {
		super();

		this.customerCheck = customerCheck;
		this.tableNumber = tableNumber;
		this.orderTotal = orderTotal;

	}

	public POSCustomerOrder() {
		// TODO Auto-generated constructor stub
		this.menuItemList = new ArrayList<POSMenuItem>();
	}

	public ArrayList<POSMenuItem> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(ArrayList<POSMenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	public int getCustomerCheck() {
		return customerCheck;
	}

	public void setCustomerCheck(int customerCheck) {
		this.customerCheck = customerCheck;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public double getOrderTotal() {
		
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		
		this.orderTotal = orderTotal;
		
		
		
	}

	@Override
	public String toString() {
		 DecimalFormat format = new DecimalFormat("#.00");
		return "CUSTOMER CHECK: " + customerCheck + "  TABLE NUMBER: " + tableNumber + " \nMENU ITEMS:\n " + menuItemList + " \nORDER SUBTOTAL: $" + format.format(orderTotal);
	}

}
