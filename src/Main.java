public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);

        graph.addEdge(v1, v2, 2);
        graph.addEdge(v2, v3, 4);
        graph.addEdge(v3, v4, 6);
        graph.addEdge(v5, v6, 8);

        graph.printGraph();

        //fill Vertexlist
        /*for(int i = 1; i <= 8; i++){
            graph.addVertex(new Vertex(i));
        }

        int j = 0;
        for(int i = 1; i <= 8; i++){
            j++;
            graph.addEdge(new Edge(i));
        }*/

    }
}