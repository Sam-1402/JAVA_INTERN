package Similarity_Algorithms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Algorithms: (1-Cosine Similarity, 2-Euclidean Distance, 3-Manhattan Distance, 4-Jaccard Similarity, 5-Minkowski Distance)");
        String algos[] = {"cosine", "euclidean", "manhattan", "jaccard", "minkowski"};
        int num = sc.nextInt();
        Similarities sm = Similarity_Adapter.getSimilarityAlgo(algos[num-1]);
        sm.inputFilename1 = "C:\\Users\\HP\\IdeaProjects\\Internship\\src\\Similarity_Algorithms\\Dummy_text1.txt";
        sm.inputFilename2 = "C:\\Users\\HP\\IdeaProjects\\Internship\\src\\Similarity_Algorithms\\Dummy_text2.txt";
        System.out.println("Similarity: "+sm.findSimilarity());
    }
}
