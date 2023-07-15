class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;

	public Magazine(String title, String itemID, String issueDate, String publisher){
		super(title,itemID);
		this.issueDate=issueDate;
		this.publisher=publisher;
	}
	public String getIssueDate(){
		return issueDate;
	}
	public String getPublisher(){
		return publisher;
	}
	@Override
	public void displayItemDetails(){
		super.displayItemDetails();
		System.out.println("Issue Date : "+ issueDate);
		System.out.println("Publisher : "+ publisher);
	}
}