import java.util.ArrayList;

public class Vertex {
    private int num;
    private ArrayList<Edge> edgelist;

    public Vertex(int num) {
        this.num = num;
        edgelist = new ArrayList<Edge>();
    }

    public int getNum() {
        return num;
    }

    public ArrayList<Edge> getEdgelist() {
        return edgelist;
    }
}
