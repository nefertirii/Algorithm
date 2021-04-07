package Prim;

public class PrimTest {

    public static void main(String[] args) {

        int[][] graph = {
            {0,32,31,0,0,60,51},
            {32,0,21,0,0,0,0},
            {31,21,0,0,46,0,25},
            {0,0,0,0,34,18,0},
            {0,0,46,34,0,40,51},
            {60,0,0,18,40,0,0},
            {51,0,25,0,51,0,0}
        };

        PrimWithArray primWithArray = new PrimWithArray(graph, 7);
        System.out.println(primWithArray.getMinimumCost());

        PrimWithPriorityQueue primWithPriorityQueue = new PrimWithPriorityQueue(graph, 7);
        System.out.println(primWithPriorityQueue.getMinimumCost());
    }
}
