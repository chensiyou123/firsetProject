package domain.view;

import java.math.BigDecimal;

public class IntegralUserRecordView {
    private String userId;
    private BigDecimal totalScore;
    private BigDecimal currentScore;
    private BigDecimal consumeScore;
    private Integer degree;
    private String title;
    private Integer consumeDegree;
    private String consumeTitle;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public BigDecimal getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(BigDecimal currentScore) {
        this.currentScore = currentScore;
    }

    public BigDecimal getConsumeScore() {
        return consumeScore;
    }

    public void setConsumeScore(BigDecimal consumeScore) {
        this.consumeScore = consumeScore;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getConsumeDegree() {
        return consumeDegree;
    }

    public void setConsumeDegree(Integer consumeDegree) {
        this.consumeDegree = consumeDegree;
    }

    public String getConsumeTitle() {
        return consumeTitle;
    }

    public void setConsumeTitle(String consumeTitle) {
        this.consumeTitle = consumeTitle;
    }
}
