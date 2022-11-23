public class videos implements Element {
    private String name;
    private int dimension;

    public videos(String name, int dimension) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}