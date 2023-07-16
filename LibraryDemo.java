class LibraryDemo{
	public static void main(String[] args) {
		Book b1 = new Book("The Catcher in the Rye" , "B001", "J.D. Salinger", 240);
		Book b2 = new Book("To Kill a Mockingbird ", "B002" ,"Harper Lee", 281);
		Book b3 = new Book("1984", "B003", "George Orwell", 328);
		Book b4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
		Book b5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);
	
		Magazine m1 = new Magazine("National Geographic" ,"M001" ,"August 2023", "National Geographic Society");
		Magazine m2 = new Magazine("Time", "M002", "September 2023"," Time USA, LLC");
		Magazine m3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
		Magazine m4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
		Magazine m5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

		LibraryMember mem1 = new LibraryMember("L001", "John Doe");
		LibraryMember mem2 = new LibraryMember("L002", "Jane Smith");
		LibraryMember mem3 = new LibraryMember("L003", "David Johnson");
		LibraryMember mem4 = new LibraryMember("L004", "Sarah Williams");
		LibraryMember mem5 = new LibraryMember("L005", "Michael Brown");
	
		b1.checkOut();
		b1.checkIn();

		Book[] books = {b1,b2,b3,b4,b5};
		Magazine[] magazines = {m1,m2,m3,m4,m5};
		LibraryMember[] libraryMembers = {mem1,mem2,mem3,mem4,mem5};

		System.out.println("Library Items:");
		System.out.println("-----------------------");
		System.out.println("Books:");
		System.out.println("-----------------------");
		for(Book book : books){
			book.displayItemDetails();
			System.out.println();
		}

		System.out.println("Magazines:");
		System.out.println("-----------------------");
		for(Magazine magazine : magazines){
			magazine.displayItemDetails();
			System.out.println();
		}

		System.out.println("Library Members:");
		System.out.println("-----------------------");
		for(LibraryMember mem : libraryMembers){
			mem.displayMemberDetails();
			System.out.println();
		}

	}
}
