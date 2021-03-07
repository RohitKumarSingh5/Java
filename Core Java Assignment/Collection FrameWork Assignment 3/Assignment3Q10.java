import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;

    public MovieDetails(String movieName, String actor, String actress, String genre) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

public class Assignment3Q10 {

    List<MovieDetails> list = new ArrayList<>();

    public static void main(String[] args) {}

    public static void sort(ArrayList<MovieDetails> movieDetails, Comparator<MovieDetails> movieDetailsComparator){}

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){}

    public void addMovie(MovieDetails movie) {
        list.add(movie);
    }

    public void removeMovies(String movieName) {
        for(MovieDetails m:list){
            if(m.getMovieName().equals(movieName)){
                list.remove(m);
                return;
            }
        }
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        for(MovieDetails m:movies){
            list.remove(m);
        }
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {

        for(int i=0; i<list.size();i++){
            if(list.get(i).getMovieName().equals(movieName)){
                return list.get(i);
            }
        }

        return null;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List<MovieDetails> moviesByGenre = new ArrayList<>();
        for(MovieDetails m:list){
            if(m.getGenre().equals(genre)){
                moviesByGenre.add(m);
            }
        }

        return moviesByGenre;
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
        Comparator<MovieDetails> movieComparator = null;
        if(sortBy.equals("movieName")){
            movieComparator = Comparator.comparing(MovieDetails::getMovieName);
        }else if(sortBy.equals("genre")){
            movieComparator = Comparator.comparing(MovieDetails::getGenre);
        }else if(sortBy.equals("actress")){
            movieComparator = Comparator.comparing(MovieDetails::getActress);
        }else if(sortBy.equals("actor")){
            movieComparator = Comparator.comparing(MovieDetails::getActor);
        }

        return movieComparator;

    }
}