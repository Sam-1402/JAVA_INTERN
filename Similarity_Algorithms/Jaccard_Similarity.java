package Similarity_Algorithms;

public class Jaccard_Similarity extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Jaccard Similarity Formula");
        int v1 = vector1.length;
        int v2 = vector2.length;

        int i=0, j=0;
        int similar_elements = 0;
        while(i<v1 && j<v2){
            if(vector1[i++] == vector2[j++]){
                similar_elements++;
            }
        }
        int total_unique_elements = v1+v2-similar_elements;

        double jaccard_ratio = similar_elements/total_unique_elements;

        return jaccard_ratio;
    }
}
