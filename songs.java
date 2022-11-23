public class songs implements Element {
    private String name;
    private int dimension;

    public songs(String name, int dimension) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}