package SyntheticsGPTKQL;

import java.util.List;

public abstract class PromptBuilder implements IPromptBuilder {
    public abstract List<String> buildPrompts(List<String> tableschema, String userPrompt);
    public abstract void ShowPrompts();
}
