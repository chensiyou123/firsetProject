package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * 试卷
 */
@ApiModel(description = "试卷表")
@Entity
@Table(name = "paper_exam")
public class PaperExam extends BaseExtDomain {

    @ApiModelProperty(value = "显示标题")
    @Column(name = "show_title")
    private Boolean showTitle;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "显示副标题")
    @Column(name = "show_subtitle")
    private Boolean showSubtitle;

    @ApiModelProperty(value = "副标题")
    private String subtitle;

    @ApiModelProperty(value = "显示装订线")
    @Column(name = "show_gutter")
    private Boolean showGutter;

    @ApiModelProperty(value = "显示保密标记")
    @Column(name = "show_security_flag")
    private Boolean showSecurityFlag;

    @ApiModelProperty(value = "保密标记")
    @Column(name = "security_flag")
    private String securityFlag;

    @ApiModelProperty(value = "显示试卷信息栏")
    @Column(name = "show_paper_info_bar")
    private Boolean showPaperInfoBar;

    @ApiModelProperty(value = "试卷信息栏")
    @Column(name = "paper_info_bar")
    private String paperInfoBar;

    @ApiModelProperty(value = "显示考生输入栏")
    @Column(name = "show_examinee_field")
    private Boolean showExamineeField;

    @ApiModelProperty(value = "考生输入栏")
    @Column(name = "examinee_field")
    private String examineeField;

    @ApiModelProperty(value = "显示誊分栏")
    @Column(name = "show_score_field")
    private Boolean showScoreField;

    @ApiModelProperty(value = "显示注意事项栏")
    @Column(name = "show_tips")
    private Boolean showTips;

    @ApiModelProperty(value = "注意事项栏")
    private String tips;

    @ApiModelProperty(value = "试卷存档名称")
    @Column(name = "save_name")
    private String saveName;

    @ApiModelProperty(value = "试卷下载名称")
    @Column(name = "download_name")
    private String downloadName;

    @ApiModelProperty(value = "试卷总分")
    @Column(name = "paper_total_score")
    private BigDecimal paperTotalScore;

    @ApiModelProperty(value = "合格分")
    @Column(name = "pass_score")
    private BigDecimal passScore;

    @ApiModelProperty(value = "支持在线答题")
    @Column(name = "support_online")
    private Boolean supportOnline;

    @ApiModelProperty(value = "试卷来源")
    private Integer source;

    @ApiModelProperty(value = "组织机构id")
    @Column(name = "organization_id")
    private String organizationId;

    @ApiModelProperty(value = "试题数量")
    @Column(name = "paper_question_number")
    private Integer paperQuestionNumber;

    @ApiModelProperty(value = "分卷")
    @Transient
    private List<PaperSubPaper> paperSubPaperList;

    @ApiModelProperty(value = "试卷试题")
    @Transient
    private List<PaperQuestion> questionList;

    public Integer getPaperQuestionNumber() {
        return paperQuestionNumber;
    }

    public void setPaperQuestionNumber(Integer paperQuestionNumber) {
        this.paperQuestionNumber = paperQuestionNumber;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Boolean getShowSubtitle() {
        return showSubtitle;
    }

    public void setShowSubtitle(Boolean showSubtitle) {
        this.showSubtitle = showSubtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Boolean getShowGutter() {
        return showGutter;
    }

    public void setShowGutter(Boolean showGutter) {
        this.showGutter = showGutter;
    }

    public Boolean getShowSecurityFlag() {
        return showSecurityFlag;
    }

    public void setShowSecurityFlag(Boolean showSecurityFlag) {
        this.showSecurityFlag = showSecurityFlag;
    }

    public String getSecurityFlag() {
        return securityFlag;
    }

    public void setSecurityFlag(String securityFlag) {
        this.securityFlag = securityFlag == null ? null : securityFlag.trim();
    }

    public Boolean getShowPaperInfoBar() {
        return showPaperInfoBar;
    }

    public void setShowPaperInfoBar(Boolean showPaperInfoBar) {
        this.showPaperInfoBar = showPaperInfoBar;
    }

    public String getPaperInfoBar() {
        return paperInfoBar;
    }

    public void setPaperInfoBar(String paperInfoBar) {
        this.paperInfoBar = paperInfoBar == null ? null : paperInfoBar.trim();
    }

    public Boolean getShowExamineeField() {
        return showExamineeField;
    }

    public void setShowExamineeField(Boolean showExamineeField) {
        this.showExamineeField = showExamineeField;
    }

    public String getExamineeField() {
        return examineeField;
    }

    public void setExamineeField(String examineeField) {
        this.examineeField = examineeField == null ? null : examineeField.trim();
    }

    public Boolean getShowScoreField() {
        return showScoreField;
    }

    public void setShowScoreField(Boolean showScoreField) {
        this.showScoreField = showScoreField;
    }

    public Boolean getShowTips() {
        return showTips;
    }

    public void setShowTips(Boolean showTips) {
        this.showTips = showTips;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName == null ? null : saveName.trim();
    }

    public String getDownloadName() {
        return downloadName;
    }

    public void setDownloadName(String downloadName) {
        this.downloadName = downloadName == null ? null : downloadName.trim();
    }

    public BigDecimal getPaperTotalScore() {
        return paperTotalScore;
    }

    public void setPaperTotalScore(BigDecimal paperTotalScore) {
        this.paperTotalScore = paperTotalScore;
    }

    public BigDecimal getPassScore() {
        return passScore;
    }

    public void setPassScore(BigDecimal passScore) {
        this.passScore = passScore;
    }

    public Boolean getSupportOnline() {
        return supportOnline;
    }

    public void setSupportOnline(Boolean supportOnline) {
        this.supportOnline = supportOnline;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public List<PaperSubPaper> getPaperSubPaperList() {
        return paperSubPaperList;
    }

    public void setPaperSubPaperList(List<PaperSubPaper> paperSubPaperList) {
        this.paperSubPaperList = paperSubPaperList;
    }

    public List<PaperQuestion> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<PaperQuestion> questionList) {
        this.questionList = questionList;
    }
}