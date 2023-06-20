package Similarity_Algorithms;

public abstract class Similarities implements Similarity_Algos{
    double[] vector1;
    double[] vector2;

    public abstract double findSimilarity();
}
