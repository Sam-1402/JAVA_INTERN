package Similarity_Algorithms;

import static java.lang.Math.sqrt;

public class Cosine_Similarity extends Similarities{
    @Override
    public double findSimilarity() {
        System.out.println("Using Cosine Similarity Formula");
        int n = vector1.length;

        //first we will obtain x.y
        double xy = 0;
        for(int i=0; i<n; i++){
            xy = xy + (vector1[i]*vector2[i]);
        }

        //Now we will obtain the ||X|| x ||Y||
        double modx = 0;
        double mody = 0;
        double sumx = 0;
        double sumy = 0;
        for(int i=0; i<n; i++){
            sumx = sumx + (vector1[i]*vector1[i]);
            sumy = sumy + (vector2[i]*vector2[i]);
        }
        modx = sqrt(sumx);
        mody = sqrt(sumy);

        double XxY = modx*mody;

        double cosineRatio = xy/XxY;

        return cosineRatio;
    }
}
