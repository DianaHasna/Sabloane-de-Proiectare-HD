public class AliniereCentru implements AliniereStrategy {
    Paragraph text;
    AliniereStrategy aliniereStrategy;


    @Override
    public void setAlignStrategy(AliniereStrategy alignStrategy) {
        this.aliniereStrategy = alignStrategy;}



    @Override
    public void render (String text){
        System.out.println("###" + text + "###");
    }

}