package testgroup.filmography.model;
//POJO
public class Film {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;

    @Override
    public String toString() {
        return new StringBuffer()
                .append(id)
                .append(title)
                .append(year)
                .append(genre)
                .append(watched)
                .toString();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
