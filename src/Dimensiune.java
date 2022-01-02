public class Dimensiune {
    private int lungime;
    private int latime;

    public Dimensiune(int L, int l) {
        this.lungime = L;
        this.latime = l;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Dimensiunea este de :" + lungime + "," + latime;
    }
}
