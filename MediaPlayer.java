import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements Playlist{
    private String name;
    private List<Element> elements;


    public MediaPlayer(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void print() {
        System.out.println(name);
        elements.forEach(Element::print);
    }
    public void add(Playlist p){
        elements.add(Playlist);
    }

    public void accept(){}

}
