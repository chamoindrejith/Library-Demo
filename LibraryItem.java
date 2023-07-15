abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean checkedOut;

	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this.checkedOut=false;
	}

	public String getTitle(){
		return title;
	}

	public String getItemId(){
		return itemID;
	}
	public void checkOut(){
		checkedOut = true;
	}

	public void checkIn(){
		checkedOut = false;
	}

	public void displayItemDetails(){
		System.out.println("Title : "+title);
		System.out.println("Item ID : "+itemID);
		System.out.println("Item Checked Out : "+(checkedOut ? "Yes" :"No"));
	}
}