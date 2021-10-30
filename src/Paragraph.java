public class Paragraph implements Element{
    String title;

    public Paragraph(String title){
        this.title = title;
    }


    @Override
    public void print() {
        System.out.println("Paragraph: " + this.title);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int x) {
        return null;
    }
}
