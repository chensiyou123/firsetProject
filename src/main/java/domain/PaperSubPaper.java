package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 分卷实体
 */
@ApiModel(description = "分卷表")
@Entity
@Table(name="paper_sub_paper")
public class PaperSubPaper extends BaseExtDomain {

    @ApiModelProperty(value = "试卷id")
    @Column(name = "paper_id")
    private String paperId;

    @ApiModelProperty(value = "是否显示")
    @Column(name = "is_show")
    private Boolean isShow;

    @ApiModelProperty(value = "卷标")
    @Column(name = "sub_label")
    private String subLabel;

    @ApiModelProperty(value = "卷注")
    private String tips;

    @ApiModelProperty(value = "排序")
    @Column(name = "order_num")
    private Long orderNum;

    @ApiModelProperty(value = "分卷题型")
    @Transient
    private List<PaperSubQuestionType> paperSubQuestionType;




    //=====================试题扩展======================//

    @ApiModelProperty(value = "试题")
    @Transient
    private List<PaperQuestion> questionList = new ArrayList<>();

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getSubLabel() {
        return subLabel;
    }

    public void setSubLabel(String subLabel) {
        this.subLabel = subLabel == null ? null : subLabel.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
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

    public List<PaperSubQuestionType> getPaperSubQuestionType() {
        return paperSubQuestionType;
    }

    public void setPaperSubQuestionType(List<PaperSubQuestionType> paperSubQuestionType) {
        this.paperSubQuestionType = paperSubQuestionType;
    }

    public List<PaperQuestion> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<PaperQuestion> questionList) {
        this.questionList = questionList;
    }
}