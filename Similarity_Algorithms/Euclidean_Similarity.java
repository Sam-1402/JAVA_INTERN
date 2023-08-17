package Similarity_Algorithms;

import java.util.ArrayList;
import static java.lang.Math.sqrt;

public class Euclidean_Similarity extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Euclidean Distance Formula");
        double sum = 0;
        ArrayList<Double> vector1 = new ArrayList<>();
        ArrayList<Double> vector2 = new ArrayList<>();
        Vectorizer.ConverttoVector(inputFilename1, inputFilename2, vector1, vector2);
        int n = vector1.size();
        for(int i=0; i<n; i++){
            sum = sum + ((vector1.get(i) - vector2.get(i))*(vector1.get(i) - vector2.get(i)));
        }
        double euclidean_distance = sqrt(sum);
        return euclidean_distance;
    }
}
