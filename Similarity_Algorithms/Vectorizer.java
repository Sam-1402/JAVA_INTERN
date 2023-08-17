package Similarity_Algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Math.log;

public class Vectorizer {
    public static void ConverttoVector(String inputfile1, String inputfile2, ArrayList<Double> vector1, ArrayList<Double> vector2) {
        String A = null;
        String B = null;
        ArrayList<String> A_Dissected = new ArrayList<>();
        ArrayList<String> B_Dissected = new ArrayList<>();

        //Loading the words in to the respective Arraylist
        loadArrays(A_Dissected, inputfile1);
        loadArrays(B_Dissected, inputfile2);


        //Loading Stopwords
        ArrayList<String> stopwords = new ArrayList<>();
        try {
            FileReader fr = new FileReader("C:\\Users\\HP\\IdeaProjects\\Internship\\src\\Similarity_Algorithms\\English_Stopwords.txt");
            BufferedReader reader = new BufferedReader(fr);
            String word = null;
            while((word = reader.readLine())!=null){
                stopwords.add(word);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Creating the TF Map
        Map<String, double[]> TF_map = new TreeMap<>();

        //Getting Frequencies of terms in A_Dissected Arraylist(simultaneously removing spaces and stopwords)
        int notUseful=0;
        for(int i=0; i<A_Dissected.size(); i++){
            if(A_Dissected.get(i).equalsIgnoreCase("") || stopwords.contains(A_Dissected.get(i))){
                notUseful++;
            }
            else{
                TF_map.putIfAbsent(A_Dissected.get(i), new double[]{0, 0});
                TF_map.get(A_Dissected.get(i))[0]++;
            }
        }

        //Getting Frequencies of terms in A_Dissected Arraylist(simultaneously removing spaces and stopwords)
        int notusefulB=0;
        for(int i=0; i<B_Dissected.size(); i++){
            if(B_Dissected.get(i).equalsIgnoreCase("") || stopwords.contains(B_Dissected.get(i))){
                notusefulB++;
            }
            else{
                TF_map.putIfAbsent(B_Dissected.get(i), new double[]{0, 0});
                TF_map.get(B_Dissected.get(i))[1]++;
            }
        }


        //Creating the IDF map for the words present in TF Map
//        Map <String, Double> IDF_map = new TreeMap<>();
//
//        for (Map.Entry<String, double[]> entry : TF_map.entrySet()) {
//            double count = 0;
//            for(int i=0; i<entry.getValue().length; i++){
//                if(entry.getValue()[i]>0){
//                    count++;
//                }
//            }
//            double ratio = log(entry.getValue().length/count);
//            IDF_map.putIfAbsent(entry.getKey(), ratio);
//        }


        //Printing the Frequency of terms in each Document
        System.out.println("--------Frequency Map----------");
        for (Map.Entry<String, double[]> entry : TF_map.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int l = 0; l < entry.getValue().length; l++){
                System.out.print(entry.getValue()[l]+",  ");
            }
            System.out.println();
        }

        System.out.println();

        //Printing the IDF Map
//        System.out.println("-------------IDF MAP--------------");
//        for (Map.Entry<String, Double> entry : IDF_map.entrySet()) {
//            System.out.println(entry.getKey() + ": "+ entry.getValue());
//        }

        //Filling up the Vectors

        for (Map.Entry<String, double[]> entry : TF_map.entrySet()) {
            vector1.add(entry.getValue()[0]);
            vector2.add(entry.getValue()[1]);
        }

        //Printing the Vectors
        System.out.println("vector1: ");
        for(int l=0; l<vector1.size(); l++){
            System.out.print(vector1.get(l)+ " ");
        }
        System.out.println("\nvector2: ");
        for (int l=0; l< vector2.size(); l++){
            System.out.print(vector2.get(l)+" ");
        }
        System.out.println();
    }
    public static void loadArrays(ArrayList<String> arraylist, String inputfile){
        String A = null;
        try {
            FileReader mainFr = new FileReader(inputfile);
            BufferedReader br = new BufferedReader(mainFr);
            while((A = br.readLine()) != null){
                Collections.addAll(arraylist, A.toLowerCase().split("[-';,.\\s*]"));
            }
            br.close();
            mainFr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

