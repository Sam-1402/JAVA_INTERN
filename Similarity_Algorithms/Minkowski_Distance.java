package Similarity_Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

import static Similarity_Algorithms.Vectorizer.ConverttoVector;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Minkowski_Distance extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Minkowski Distance Formula");
        ArrayList<Double> vector1 = new ArrayList<>();
        ArrayList<Double> vector2 = new ArrayList<>();
        ConverttoVector(inputFilename1, inputFilename2, vector1, vector2);
        int n = vector1.size();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'p': ");
        double p = sc.nextDouble();

        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + pow(abs(vector1.get(i) - vector2.get(i)), p);
        }

        double minkowski_dist = pow(sum, 1/p);

        return minkowski_dist;
    }
}
