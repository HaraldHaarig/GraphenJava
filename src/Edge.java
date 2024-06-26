public class Edge {
    private int weight;
    private Vertex vertex1;
    private Vertex vertex2;

    public Edge(Vertex vertex1, Vertex vertex2, int weight) {
        this.weight = weight;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }
}
