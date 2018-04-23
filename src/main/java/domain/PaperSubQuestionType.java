package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

@ApiModel(description = "分卷类型表")
@Entity
@Table(name = "paper_sub_question_type")
public class PaperSubQuestionType extends BaseExtDomain {

    @ApiModelProperty(value = "分卷id")
    @Column(name = "sub_paper_id")
    private String subPaperId;

    @ApiModelProperty(value = "是否显示")
    @Column(name = "is_show")
    private Boolean isShow;

    @ApiModelProperty(value = "是否显示评分栏")
    @Column(name = "show_score_field")
    private Boolean showScoreField;

    @ApiModelProperty(value = "题型名称")
    @Column(name = "question_type_name")
    private String questionTypeName;

    @ApiModelProperty(value = "题型注释")
    @Column(name = "question_type_tip")
    private String questionTypeTip;

    @ApiModelProperty(value = "排序")
    @Column(name = "order_num")
    private Long orderNum;


    @Transient
    @ApiModelProperty(value = "分卷题型code")
    private String questionTypeCode;

    @ApiModelProperty(value = "题型题目关联实体")

    @Transient
    private List<PaperSubRefQuestion> paperSubRefQuestion;

    public String getSubPaperId() {
        return subPaperId;
    }

    public void setSubPaperId(String subPaperId) {
        this.subPaperId = subPaperId == null ? null : subPaperId.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getShowScoreField() {
        return showScoreField;
    }

    public void setShowScoreField(Boolean showScoreField) {
        this.showScoreField = showScoreField;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName == null ? null : questionTypeName.trim();
    }

    public String getQuestionTypeTip() {
        return questionTypeTip;
    }

    public void setQuestionTypeTip(String questionTypeTip) {
        this.questionTypeTip = questionTypeTip == null ? null : questionTypeTip.trim();
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }


    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    public List<PaperSubRefQuestion> getPaperSubRefQuestion() {
        return paperSubRefQuestion;
    }

    public void setPaperSubRefQuestion(List<PaperSubRefQuestion> paperSubRefQuestion) {
        this.paperSubRefQuestion = paperSubRefQuestion;
    }

    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    public void setQuestionTypeCode(String questionTypeCode) {
        this.questionTypeCode = questionTypeCode;
    }
}