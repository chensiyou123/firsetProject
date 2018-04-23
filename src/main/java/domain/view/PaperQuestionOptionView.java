package domain.view;

public class PaperQuestionOptionView {
    private String optionKey;
    private String optionValue;
    private Integer optionSort = 0;
    private Boolean isAnswer = false;

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

    public Integer getOptionSort() {
        return optionSort;
    }

    public void setOptionSort(Integer optionSort) {
        this.optionSort = optionSort;
    }

    public Boolean getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Boolean answer) {
        isAnswer = answer;
    }
}
