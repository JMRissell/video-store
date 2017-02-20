
public class VideoStoreApp {

	public static void main(String[] args) {

		Movie newMovie = new NewMovie("Dr Strange");
		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildMovie("Up");

		Rental rentalNewMovie1 = new Rental(newMovie, 5);
		Rental rentalRegularMovie1 = new Rental(regular, 1);
		Rental rentalChildrensMovie = new Rental(childrens, 3);

		RentalStatement rentals = new RentalStatement();
		rentals.add(rentalNewMovie1);
		rentals.add(rentalRegularMovie1);
		rentals.add(rentalChildrensMovie);

		rentals.print();
	}
}
