package Similarity_Algorithms;

public abstract class Similarities implements ISimilarity_Algos {
    String inputFilename1;
    String inputFilename2;

    public abstract double findSimilarity();
}
