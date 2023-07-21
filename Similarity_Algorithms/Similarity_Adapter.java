package Similarity_Algorithms;

public class Similarity_Adapter {

    public static Similarities getSimilarityAlgo(String input){
        Similarities obj;
        if(input.equalsIgnoreCase("cosine")){
            obj = new Cosine_Similarity();
        }
        else if(input.equalsIgnoreCase("euclidean")){
            obj = new Euclidean_Similarity();
        }
        else if(input.equalsIgnoreCase("manhattan")){
            obj = new Manhattan_Distance();
        }
        else if(input.equalsIgnoreCase("jaccard")){
            obj = new Jaccard_Similarity();
        }
        else if(input.equalsIgnoreCase("minkowski")){
            obj = new Minkowski_Distance();
        }
        else{
            obj = new Cosine_Similarity();
        }
        return obj;
    }
}
