package Similarity_Algorithms;

import static java.lang.Math.sqrt;

public class Euclidean_Similarity extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Euclidean Distance Formula");
        double sum = 0;
        int n = vector1.length;
        for(int i=0; i<n; i++){
            sum = sum + ((vector1[i] - vector2[i])*(vector1[i] - vector2[i]));
        }
        double euclidean_distance = sqrt(sum);
        return euclidean_distance;
    }
}
