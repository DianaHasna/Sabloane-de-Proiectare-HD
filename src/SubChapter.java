import java.util.ArrayList;

public class SubChapter {
    String name;
    ArrayList<Paragraph> paragraphs;
    ArrayList<Image> images;
    ArrayList<Table> tables;

    public SubChapter(String name){
        this.name = name;
        paragraphs = new ArrayList<Paragraph>();
        images = new ArrayList<Image>();
        tables = new ArrayList<Table>();
    }

    public void createNewParagraph(String string){
        Paragraph p = new Paragraph(string);
        paragraphs.add(p);
    }

    public void createNewImage(String string){
        Image i = new Image(string);
        images.add(i);
    }

    public void createNewTable(String string){
        Table t = new Table(string);
        tables.add(t);
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for(Paragraph p : paragraphs){
            System.out.println("Paragraph: " + p);
        }
        for(Image i : images){
            System.out.println("Image with name: " + i);
        }
        for(Table t : tables){
            System.out.println("Table with Title: " + t);
        }

    }

}
