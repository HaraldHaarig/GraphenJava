import java.util.ArrayList;
public class Graph {
    private ArrayList<Vertex> vertexlist;

    public Graph() {
        vertexlist = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex vertex){
        vertexlist.add(vertex);
    }

    public void addEdge(Vertex v1, Vertex v2, int weight){
        v1.getEdgelist().add(new Edge(v1, v2, weight));
        v2.getEdgelist().add(new Edge(v2, v1, weight));
        //edgelist.add(new Edge(v1, v2, weight));
    }

    public void printGraph(){
        for(Vertex vertex: vertexlist){
            //Vertex temp = vertex.getEdgelist()
            System.out.println(vertex.getNum() + " - " + vertex.getNum());
            //System.out.println(edge.getVertex1().getNum() + " - " + edge.getVertex2().getNum());
        }
    }
}
