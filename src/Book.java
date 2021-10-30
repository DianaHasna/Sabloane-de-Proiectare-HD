import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Author> authors;
    ArrayList<Element> content;



    public Book(String title)
    {
        this.title = title;
        authors = new ArrayList<Author>();
        content = new ArrayList<Element>();
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public void addContent(Element e){
        this.content.add(e);
    }

    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("Authors: ");
        for(Author a : this.authors){
            a.print();
        }
        for(Element e : this.content){
            e.print();
        }
    }
}
