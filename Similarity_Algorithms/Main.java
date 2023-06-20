package Similarity_Algorithms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Vectors: ");
        int n = sc.nextInt();

        System.out.println("Enter the Vector 1: ");
        double[] vector1 = new double[n];
        for(int i=0; i<n; i++){
            vector1[i] = sc.nextInt();
        }

        System.out.println("Enter the Vector 2: ");
        double[] vector2 = new double[n];
        for(int i=0; i<n; i++){
            vector2[i] = sc.nextInt();
        }

        System.out.println("Choose Algorithms: (1-Cosine Similarity, 2-Euclidean Distance, 3-Manhattan Distance, 4-Jaccard Similarity, 5-Minkowski Distance)");
        String algos[] = {"cosine", "euclidean", "manhattan", "jaccard", "minkoski"};
        int num = sc.nextInt();
        Similarities sm = Similarity_Adapter.getSimilarityAlgo(algos[num-1]);
        sm.vector1 = vector1;
        sm.vector2 = vector2;
        System.out.println("Similarity: "+sm.findSimilarity());
    }
}
