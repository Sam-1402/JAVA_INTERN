package SyntheticsGPTKQL;

import java.util.List;

public class StanfordNLPClient extends NLPProvider {
    @Override
    public List<String> getEntities(String userPrompt) {
        List<String> tableNames = null;
        return tableNames;
    }

    @Override
    public List<String> getIntents(String userPrompt) {
        return null;
    }
}
