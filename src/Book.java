import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Author> authors;
    ArrayList<Chapter> chapters;



    public Book(String title)
    {
        this.title = title;
        authors = new ArrayList<Author>();
        chapters = new ArrayList<Chapter>();
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public int createChapter(String string){
        Chapter c1 = new Chapter(string);
        chapters.add(c1);
        return chapters.indexOf(c1);
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }



}
