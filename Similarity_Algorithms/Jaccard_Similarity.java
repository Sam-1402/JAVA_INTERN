package Similarity_Algorithms;

import java.util.ArrayList;

import static Similarity_Algorithms.Vectorizer.ConverttoVector;

public class Jaccard_Similarity extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Jaccard Similarity Formula");
        ArrayList<Double> vector1 = new ArrayList<>();
        ArrayList<Double> vector2 = new ArrayList<>();
        ConverttoVector(inputFilename1, inputFilename2, vector1, vector2);

        int v1 = vector1.size();
        int v2 = vector2.size();

        int i=0, j=0;
        int similar_elements = 0;
        while(i<v1 && j<v2){
            if((vector1.get(i++) >=1 )&& (vector2.get(j++) >=1)){
                similar_elements++;
            }
        }
        int total_unique_elements = v1+v2-similar_elements;

        double jaccard_ratio = similar_elements/total_unique_elements;

        return jaccard_ratio;
    }
}
