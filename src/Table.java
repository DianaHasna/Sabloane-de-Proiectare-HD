public class Table implements Element{
    String tab;

    public Table (String tab)
    {
        this.tab = tab;
    }



    @Override
    public void print() {
        System.out.println("Table: " + this.tab);
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
