package Similarity_Algorithms;

import java.util.ArrayList;

import static Similarity_Algorithms.Vectorizer.ConverttoVector;
import static java.lang.Math.abs;

public class Manhattan_Distance extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Manhattan Distance Formula");
        ArrayList<Double> vector1 = new ArrayList<>();
        ArrayList<Double> vector2 = new ArrayList<>();
        ConverttoVector(inputFilename1, inputFilename2, vector1, vector2);
        int n = vector1.size();
        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + abs(vector1.get(i) - vector2.get(i));
        }

        return sum;
    }
}
