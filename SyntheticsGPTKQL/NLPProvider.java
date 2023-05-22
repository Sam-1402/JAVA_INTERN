package SyntheticsGPTKQL;
import java.util.List;
public abstract class NLPProvider implements INLPProvider{
    public abstract List<String> getEntities(String userPrompt);
    public abstract List<String> getIntents(String userPrompt);
}
