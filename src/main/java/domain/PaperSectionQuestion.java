package domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * 章节目录试题表
 */
@ApiModel(description = "章节目录试题表")
@Entity
@Table(name = "paper_section_question")
public class PaperSectionQuestion {

    @ApiModelProperty(value = "章节目录试题表主键",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "试题id",required = true)
    @Column(name = "question_id")
    private String questionId;

    @ApiModelProperty(value = "章节目录id",required = true)
    @Column(name = "section_id")
    private String sectionId;

    @ApiModelProperty(value = "章节目录编码")
    @Column(name = "section_code")
    private String sectionCode;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode == null ? null : sectionCode.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}