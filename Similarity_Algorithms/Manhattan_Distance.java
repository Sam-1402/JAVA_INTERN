package Similarity_Algorithms;

import static java.lang.Math.abs;

public class Manhattan_Distance extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Manhattan Distance Formula");
        int n = vector1.length;
        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + abs(vector1[i] - vector2[i]);
        }

        return sum;
    }
}
