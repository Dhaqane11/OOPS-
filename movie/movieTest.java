package movie;



public class movieTest {
    public static void main(String[] args) {

        movie myMovieCollection = new movie();


        movieItem item1 = new movieItem("Maanafaay", "abdirisak ali awaale ");
        movieItem item2 = new movieItem("The Matrix", "Wachowski Sisters");
        movieItem item3 = new movieItem("Jacayl dhaxal galay", "Abubakar Hashi");


        myMovieCollection.addmovieItem(item1);
        myMovieCollection.addmovieItem(item2);
        myMovieCollection.addmovieItem(item3);


        myMovieCollection.printmovieDetails();
    }
}