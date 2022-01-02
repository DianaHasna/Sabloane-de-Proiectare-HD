public class ImageProxy implements  Element{
    private String url;
    private Dimensiune dim = new Dimensiune(250, 250);
    private Image img;

    public ImageProxy(String url) {
        this.url = url;
    }

    public ImageProxy(ImageProxy imageProxy) {
        this.url = imageProxy.url;
        this.dim = imageProxy.dim;
        this.img = imageProxy.img;
    }

    @Override
    public void print() {
        System.out.println("Url-ul imaginii:" + url + " cu dimensiunea:" + dim);

        loadImage().print();
    }

    private Image loadImage() {
        if (this.img == null) {
            this.img = new Image(url);
        }

        return this.img;
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int x){
        return null;
    }

    @Override
    public Element clone() {
        return new ImageProxy(this.url);
    }


}

