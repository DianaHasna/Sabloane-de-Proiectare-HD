import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Paragraph> paragraphs;
    ArrayList<Image> images;
    ArrayList<Table> tables;

    public void print() {
        System.out.println(title);
        for(Paragraph p : paragraphs){
            System.out.println(p);
        }
        for(Image i : images){
            System.out.println(i);
        }
        for(Table t : tables){
            System.out.println(t);
        }

    }

    public Book(String title)
    {
        this.title = title;
        paragraphs = new ArrayList<Paragraph>();
        images = new ArrayList<Image>();
        tables = new ArrayList<Table>();
    }

    public void createNewParagraph(String name){
        Paragraph p1 = new Paragraph(name);
        paragraphs.add(p1);
    }

    public void createNewImage(String name){
        Image i1 = new Image (name);
        images.add(i1);

    }

    public void createNewTable(String name){
        Table t1 = new Table(name);
        tables.add(t1);

    }


}
