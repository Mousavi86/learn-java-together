import java.util.*;

public class Cinema40 {
    public class Movie {
        String title;
        int availableTickets;
        int price;

        Movie(String title, int availableTickets, int price) {
            this.title = title;
            this.availableTickets = availableTickets;
            this.price = price;
        }
        boolean buyTickets(int count) {
            if (count > availableTickets) {
                availableTickets -= count;
                return true;
            } else {
                return false;
            }
        }
    }

    interface TicketService {
        void buyTickets(String movieName, int count);
    }
}

class SimpleTicketService implements TicketService {
    List<Movie> movies;

    public SimpleTicketService(List<Movie> movies) {
        this.movies = movies;
    }
}

public void buyTickets(String movieName, int count) {
    for (Movie movie : movies) {
        if (movie.title.equalsIgnoreCase(movieName)) {
            if (movie.buyTickets(count)) {
                int total = count * movie.price;
                System.out.println(total + " Tickets bought");
            } else {
                System.out.println(" Tickets not bought ");
            }
            return;
        }
        System.out.println("Movie not found");
    }
    public void showMovies () {
        System.out.println("Available Movies");
        for (Movie movie : movies) {
            System.out.println(movie.title + " " + movie.availableTickets + " " + movie.price);
        }
    }
}
}
