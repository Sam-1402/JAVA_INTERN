package Similarity_Algorithms;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Minkowski_Distance extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Minkowski Distance Formula");
        int n = vector1.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'p': ");
        double p = sc.nextDouble();

        double sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + pow(abs(vector1[i] - vector2[i]), p);
        }

        double minkowski_dist = pow(sum, 1/p);

        return minkowski_dist;
    }
}
