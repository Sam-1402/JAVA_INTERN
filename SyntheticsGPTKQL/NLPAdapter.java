package SyntheticsGPTKQL;

public class NLPAdapter {
    public static NLPProvider getNLPClient(){
        NLPProvider nlpclient = new StanfordNLPClient();
        return nlpclient;
    }
}
