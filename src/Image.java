import java.util.concurrent.TimeUnit;

public class Image implements Element{
    String img;

    public Image (String img){
        this.img = img ;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
