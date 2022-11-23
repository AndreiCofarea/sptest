public class gifs implements Element {
    private String name;
    private int dimension;

    public gifs(String name, int dimension) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}