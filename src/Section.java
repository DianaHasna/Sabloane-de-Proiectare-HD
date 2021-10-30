import java.util.ArrayList;

public class Section implements Element{
    String title;
    ArrayList<Element> elements;

    public Section(String title){
        this.title = title;
        elements = new ArrayList<Element>();
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element e : this.elements){
            e.print();
        }
    }

    @Override
    public void add(Element e) {
        this.elements.add(e);
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int x) {
        return null;
    }
}
