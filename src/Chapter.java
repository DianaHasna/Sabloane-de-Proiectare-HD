import java.util.ArrayList;

public class Chapter {
    String name;
    ArrayList<SubChapter> subChapters;

    public Chapter(String name){
        this.name = name;
        subChapters = new ArrayList<SubChapter>();
    }

    public int createSubChapter(String string){
        SubChapter chp1 = new SubChapter(string);
        subChapters.add(chp1);
        return subChapters.indexOf(chp1);
    }

    public SubChapter getSubChapter(int index){
        return subChapters.get(index);
    }

}
