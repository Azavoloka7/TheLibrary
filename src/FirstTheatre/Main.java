package FirstTheatre;

public class Main {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Inception", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Toy Story", Movie.CHILDRENS);

        // Create rentals
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 5);

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Add rentals to the customer
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Generate and print the rental statement
        System.out.println(customer.statement());
    }
}
