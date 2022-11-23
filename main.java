import javax.print.attribute.standard.Media;

public class main {
    public static void main(String args[]){
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new songs("BudaBar", 3000));
        p.add(new videos("Waves in Caraibe", 20000));
        p.add(new songs("Simple things", 4000));
        p.add(new gifs("sunglasses", 500));
        m.add(p);

        Visitor v = new MediaSizeVisitor();
        m.accept(v);
        v.printSizes();
        
    }
}
