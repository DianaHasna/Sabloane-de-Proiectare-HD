public class Image implements Element{
    String img;

    public Image (String img){
        this.img = img ;
    }


    @Override
    public void print() {
        System.out.println("Image with name: " + img);
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
