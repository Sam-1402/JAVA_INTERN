package Similarity_Algorithms;
import java.util.ArrayList;
import static java.lang.Math.sqrt;

public class Cosine_Similarity extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Cosine Similarity Formula: ");
        System.out.println("Obtaining Vectors...");

        ArrayList<Double> vector1 = new ArrayList<>();
        ArrayList<Double> vector2 = new ArrayList<>();
        Vectorizer.ConverttoVector(inputFilename1, inputFilename2, vector1, vector2);

        int n = vector1.size();

        //first we will obtain x.y
        double xy = 0;

        for(int i=0; i<n; i++){
            xy = xy + (vector1.get(i)*vector2.get(i));
        }

        //Now we will obtain the ||X|| x ||Y||
        double modx = 0;
        double mody = 0;
        double sumx = 0;
        double sumy = 0;
        for(int i=0; i<n; i++){
            sumx = sumx + (vector1.get(i)*vector1.get(i));
            sumy = sumy + (vector2.get(i)*vector2.get(i));
        }
        modx = sqrt(sumx);
        mody = sqrt(sumy);

        double XxY = modx*mody;
        double cosineRatio = xy/XxY;

        return cosineRatio;
    }
}
