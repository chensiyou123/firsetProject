package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 试题题型表
 */
@ApiModel(description = "题型表")
@Entity
@Table(name = "paper_question_type")
public class PaperQuestionType extends BaseExtDomain{

    @ApiModelProperty(value = "名称码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "客观题型")
    @Column(name = "choice_type")
    private Boolean choiceType;

    @ApiModelProperty(value = "题型分类")
    @Column(name = "type_class")
    private Long typeClass;

    @ApiModelProperty(value = "所属学科")
    @Column(name = "within_subject_id")
    private String withinSubjectId;

    @ApiModelProperty(value = "学科编码")
    @Column(name = "within_subject_code")
    private String withinSubjectCode;

    @ApiModelProperty(value = "所属学科")
    @Transient
    private String withinSubjectName;

    @ApiModelProperty(value = "是否多选")
    @Column(name = "is_multiple")
    private Boolean isMultiple;

    @ApiModelProperty(value = "试题名称")
    @Column(name = "is_judge")
    private Boolean isJudge;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getChoiceType() {
        return choiceType;
    }

    public void setChoiceType(Boolean choiceType) {
        this.choiceType = choiceType;
    }

    public Long getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(Long typeClass) {
        this.typeClass = typeClass;
    }

    public String getWithinSubjectId() {
        return withinSubjectId;
    }

    public void setWithinSubjectId(String withinSubjectId) {
        this.withinSubjectId = withinSubjectId == null ? null : withinSubjectId.trim();
    }

    public String getWithinSubjectCode() {
        return withinSubjectCode;
    }

    public void setWithinSubjectCode(String withinSubjectCode) {
        this.withinSubjectCode = withinSubjectCode == null ? null : withinSubjectCode.trim();
    }

    public String getWithinSubjectName() {
        return withinSubjectName;
    }

    public void setWithinSubjectName(String withinSubjectName) {
        this.withinSubjectName = withinSubjectName;
    }

    public Boolean getMultiple() {
        return isMultiple;
    }

    public void setMultiple(Boolean multiple) {
        isMultiple = multiple;
    }

    public Boolean getJudge() {
        return isJudge;
    }

    public void setJudge(Boolean judge) {
        isJudge = judge;
    }
}