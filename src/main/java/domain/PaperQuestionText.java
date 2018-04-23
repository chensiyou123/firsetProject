package domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * 试题表字段分离
 */
@ApiModel(description = "试题表字段分离表")
@Entity
@Table(name = "paper_question_text")

public class PaperQuestionText {

    @ApiModelProperty(value = "试题表字段分离表主键" ,required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "题文" )
    @Column(name = "question_content")
    private String questionContent;

    @ApiModelProperty(value = "答案" )
    @Column(name = "question_result")
    private String questionResult;

    @ApiModelProperty(value = "解析" )
    private String analysis;

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public String getQuestionResult() {
        return questionResult;
    }

    public void setQuestionResult(String questionResult) {
        this.questionResult = questionResult == null ? null : questionResult.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}