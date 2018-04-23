package domain.view;

import java.util.List;

public class OptionView {
    private String questionId;
    private String optionKey;
    private String optionValue;
    private String subAnswer;
    private List<OptionView> options;
    private String standardAnswer;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getOptionKey() {
        return optionKey;
    }

    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getSubAnswer() {
        return subAnswer;
    }

    public void setSubAnswer(String subAnswer) {
        this.subAnswer = subAnswer;
    }

    public List<OptionView> getOptions() {
        return options;
    }

    public void setOptions(List<OptionView> options) {
        this.options = options;
    }

    public String getStandardAnswer() {
        return standardAnswer;
    }

    public void setStandardAnswer(String standardAnswer) {
        this.standardAnswer = standardAnswer;
    }
}
