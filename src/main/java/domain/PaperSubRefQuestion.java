package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 分卷题型与题目关联表
 */
@ApiModel(description = "分卷题型与题目关联表")
@Entity
@Table(name = "paper_sub_ref_question")
public class PaperSubRefQuestion {

    @ApiModelProperty(value = "分卷题型与题目关联表主键",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "分卷题型id",required = true)
    @Column(name="sub_paper_question_type_id")
    private String subPaperQuestionTypeId;

    @ApiModelProperty(value = "试题ID",required = true)
    @Column(name="question_id")
    private String questionId;

    @ApiModelProperty(value = "分数")
    private BigDecimal score;

    @ApiModelProperty(value = "排序")
    @Column(name="order_num")
    private Long orderNum;

    @ApiModelProperty(value = "题型ID")
    @Column(name = "question_type_id")
    private String questionTypeId;

    @ApiModelProperty(value = "题型code")
    @Column(name = "question_type_code")
    private String questionTypeCode;

    @ApiModelProperty(value = "客观题型，0-否，1-是，默认1")
    @Column(name = "question_type_choice_type")
    private Boolean questionTypeChoiceType;

    @ApiModelProperty(value = "是否删除")
    @Column(name = "is_delete")
    private Boolean isDelete;

    @Transient
    private PaperQuestion paperQuestion;

    public String getSubPaperQuestionTypeId() {
        return subPaperQuestionTypeId;
    }

    public void setSubPaperQuestionTypeId(String subPaperQuestionTypeId) {
        this.subPaperQuestionTypeId = subPaperQuestionTypeId == null ? null : subPaperQuestionTypeId.trim();
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    public void setQuestionTypeCode(String questionTypeCode) {
        this.questionTypeCode = questionTypeCode;
    }

    public Boolean getQuestionTypeChoiceType() {
        return questionTypeChoiceType;
    }

    public void setQuestionTypeChoiceType(Boolean questionTypeChoiceType) {
        this.questionTypeChoiceType = questionTypeChoiceType;
    }

    public PaperQuestion getPaperQuestion() {
        return paperQuestion;
    }

    public void setPaperQuestion(PaperQuestion paperQuestion) {
        this.paperQuestion = paperQuestion;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}