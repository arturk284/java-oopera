import java.util.ArrayList;

public class MusicalShow extends Show{
    Person musicAuthor;
    String librettoText;

    @Override
    public String toString() {
        return  title+
                " " + this.librettoText;
    }

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
