package domain;

import com.hanboard.educloud.resource.domain.view.PaperQuestionOptionView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "试题表")
@Table(name = "paper_question")
@Entity
public class PaperQuestion extends BaseExtDomain{

    @ApiModelProperty(value = "来源")
    private String origin;

    @ApiModelProperty(value = "题号")
    @Column(name = "question_num")
    private Integer questionNum;

    @ApiModelProperty(value = "题型ID")
    @Column(name = "question_type_id")
    private String questionTypeId;

    @ApiModelProperty(value = "题型code")
    @Column(name = "question_type_code")
    private String questionTypeCode;

    @ApiModelProperty(value = "题型name")
    @Transient
    private String questionTypeName;

    @ApiModelProperty(value = "试题所属年份")
    @Column(name = "belong_year")
    private Long belongYear;

    @ApiModelProperty(value = "难度等级")
    @Column(name = "difficulty_level")
    private String difficultyLevel;

    @ApiModelProperty(value = "学段ID")
    @Column(name = "term_id")
    private String termId;

    @ApiModelProperty(value = "科目")
    @Column(name = "subject_id")
    private String subjectId;

    @ApiModelProperty(value = "科目code")
    @Column(name = "subject_code")
    private String subjectCode;

    @ApiModelProperty(value = "组织机构ID")
    @Column(name = "organization_id")
    private String organizationId;

    @ApiModelProperty(value = "小题数")
    @Column(name = "sub_amount")
    private Integer subAmount;

    @ApiModelProperty(value = "试题名称")
    @Column(name = "question_name")
    private String questionName;

    @ApiModelProperty(value = "题文" )
    @Transient
    private String questionContent;

    @ApiModelProperty(value = "答案" )
    @Transient
    private String questionResult;

    @ApiModelProperty(value = "解析" )
    @Transient
    private String analysis;



    //=============扩展============//

    @ApiModelProperty(value = "题目选项集合" )
    @Transient
    private List<PaperQuestionOptionView> optionList = new ArrayList<>();

    @ApiModelProperty(value = "题型Code" )
    @Transient
    private  String typeCode;

    @ApiModelProperty(value = "题型Name" )
    @Transient
    private  String typeName;

    @ApiModelProperty(value = "分数" )
    @Transient
    private BigDecimal source;

    @ApiModelProperty(value = "排序" )
    @Transient
    private String orderNum;

    @ApiModelProperty(value = "创建人" )
    @Transient
    private String creatorName;

    @ApiModelProperty(value = "科目名")
    @Transient
    private String subjectName;

    @ApiModelProperty(value = "分卷id(用于试题分组)" )
    @Transient
    private String subPaperId;

    @ApiModelProperty(value = "试题分值" )
    @Transient
    private BigDecimal score;

    @ApiModelProperty(value = "资源积分" )
    @Transient
    private BigDecimal price;


    @ApiModelProperty(value = "是否客观题" )
    @Transient
    private Boolean choiceType;
    @ApiModelProperty(value = "是否多选" )
    @Transient
    private Boolean isMultiple;

    @ApiModelProperty(value = "是否判断题" )
    @Transient
    private Boolean isJudge;

    @ApiModelProperty(value = "收藏次数" )
    @Transient
    private Integer myCount;

    public List<PaperQuestionOptionView> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<PaperQuestionOptionView> optionList) {
        this.optionList = optionList;
    }

    public Boolean getChoiceType() {
        return choiceType;
    }

    public void setChoiceType(Boolean choiceType) {
        this.choiceType = choiceType;
    }

    public Boolean getMultiple() {
        return isMultiple;
    }

    public void setMultiple(Boolean multiple) {
        isMultiple = multiple;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId == null ? null : questionTypeId.trim();
    }

    public Long getBelongYear() {
        return belongYear;
    }

    public void setBelongYear(Long belongYear) {
        this.belongYear = belongYear;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel == null ? null : difficultyLevel.trim();
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId == null ? null : termId.trim();
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public Integer getSubAmount() {
        return subAmount;
    }

    public void setSubAmount(Integer subAmount) {
        this.subAmount = subAmount;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionResult() {
        return questionResult;
    }

    public void setQuestionResult(String questionResult) {
        this.questionResult = questionResult;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }


    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    public void setQuestionTypeCode(String questionTypeCode) {
        this.questionTypeCode = questionTypeCode;
    }

    public String getSubPaperId() {
        return subPaperId;
    }

    public void setSubPaperId(String subPaperId) {
        this.subPaperId = subPaperId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public BigDecimal getSource() {
        return source;
    }

    public void setSource(BigDecimal source) {
        this.source = source;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }

    public Integer getMyCount() {
        return myCount;
    }

    public void setMyCount(Integer myCount) {
        this.myCount = myCount;
    }

    public Boolean getJudge() {
        return isJudge;
    }

    public void setJudge(Boolean judge) {
        isJudge = judge;
    }
}