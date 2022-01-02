public class Paragraph implements Element{
    String title;
    AliniereStrategy aliniereStrategy;


    public Paragraph(String title){
        this.title = title;
    }


    @Override
    public void print() {
        if (this.aliniereStrategy !=null){
            this.aliniereStrategy.render(this.title);
        }
        else
            System.out.println(this.title);
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

    public void setAlignStrategy(AliniereStrategy alignStrategy) {
        this.aliniereStrategy = alignStrategy;

    }

}
