package LibraryPack;

public abstract class Items {
	int itemID = 0;
	String itemName;
	String itemType;
	int noOfPages = 0;
	boolean checkedIn;
	
	public Items() {}

	public Items(int itemID, String itemName, String itemType, int noOfPages, boolean checkedIn) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemType = itemType;
		this.noOfPages = noOfPages;
		this.checkedIn = checkedIn;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

}
