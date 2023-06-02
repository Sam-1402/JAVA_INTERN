package org.dei.client;

import java.io.FileWriter;
import java.io.IOException;

public class inputcreator {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\asus\\IdeaProjects\\dsaljava\\unsorted.txt");
        for(int i=17000; i>0; i--){
            if(i == 1){
                fw.write(i+"");
            }
            else{
                fw.write(i+",");
            }
        }
        fw.close();
    }
}
