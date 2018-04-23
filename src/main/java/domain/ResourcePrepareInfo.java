package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.security.Timestamp;

/**
 * 备课表
 */
@ApiModel(description = "个人备课信息")
@Entity
@Table(name = "res_prepare_info")
public class ResourcePrepareInfo extends BaseExtDomain {
    @Transient
    private String prepareId;// 单个资源文件res_prepare_info表的id

    @ApiModelProperty(value = "资源id(教学包ID)")
    @Column(name = "resource_id")
    private String resourceId;

    @ApiModelProperty(value = "资源类型id(资源类型id)")
    @Column(name = "type_id")
    private String typeId;

    @ApiModelProperty(value = "资源类型code(资源类型编号)")
    @Column(name = "type_code")
    private String typeCode;

    @ApiModelProperty(value = "资源类型资源主键（分类资源ID）")
    @Column(name = "type_resource_id")
    private String typeResourceId;




    //====资源扩展===//
    @Transient
    private String referenceId;//引用id

    @Transient
    private String  title;//资源名称

    @Transient
    private BigDecimal  price;

    @ApiModelProperty(value = "资源id")
    @Transient
    private String fileId;

    @ApiModelProperty(value = "文件类型")
    @Transient
    private  String groupCode;

    @ApiModelProperty(value = "收藏次数")
    @Transient
    private Long collectCount;

    @ApiModelProperty(value = "我下载的次数")
    @Transient
    private  Long downloadCount;

    @ApiModelProperty(value = "我收藏的次数")
    @Transient
    private Long myCount;



    @ApiModelProperty(value = "来源")
    @Transient
    private String source;


    @ApiModelProperty(value = "课程id",required = true)
    @Transient
    private String courseId;

    @ApiModelProperty(value = "课程名称")
    @Transient
    private String courseName;



    //==============文件扩展=========//
    @Transient
    @ApiModelProperty(value = "文件名",required = true)
    private String fileName;

    @Transient
    @ApiModelProperty(value = "后缀",required = true)
    private String suffix;

    @Transient
    @ApiModelProperty(value = "文件大小",required = true)
    private BigDecimal fileSize;

    @Transient
    @ApiModelProperty(value = "播放时长")
    private BigDecimal playLength;//播放时长


    //===================试题扩展===========//


    @ApiModelProperty(value = "题型ID")
    @Transient
    private String questionTypeId;
    @ApiModelProperty(value = "题型Code")
    @Transient
    private String questionTypeCode;

    @ApiModelProperty(value = "题型名称")
    @Transient
    private String questionTypeName;

    @ApiModelProperty(value = "难度等级")
    @Transient
    private String difficultyLevel;

    @ApiModelProperty(value = "来源")
    @Transient
    private String origin;

    @ApiModelProperty(value = "试题所属年份")
    @Transient
    private Long belongYear;

    @ApiModelProperty(value = "题文" )
    @Transient
    private String questionContent;

    @ApiModelProperty(value = "答案" )
    @Transient
    private String questionResult;

    @ApiModelProperty(value = "解析" )
    @Transient
    private String analysis;

    @ApiModelProperty(value = "完成时间" )
    @Transient
    private Timestamp finishTime;


    @ApiModelProperty(value = "作业总分" )
    @Transient
    private BigDecimal paperTotalScore;

    @ApiModelProperty(value = "试题数量")
    @Transient
    private Integer paperQuestionNumber;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getPaperQuestionNumber() {
        return paperQuestionNumber;
    }

    public void setPaperQuestionNumber(Integer paperQuestionNumber) {
        this.paperQuestionNumber = paperQuestionNumber;
    }

    public BigDecimal getPaperTotalScore() {
        return paperTotalScore;
    }

    public void setPaperTotalScore(BigDecimal paperTotalScore) {
        this.paperTotalScore = paperTotalScore;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeResourceId() {
        return typeResourceId;
    }

    public void setTypeResourceId(String typeResourceId) {
        this.typeResourceId = typeResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public BigDecimal getPlayLength() {
        return playLength;
    }

    public void setPlayLength(BigDecimal playLength) {
        this.playLength = playLength;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Long getBelongYear() {
        return belongYear;
    }

    public void setBelongYear(Long belongYear) {
        this.belongYear = belongYear;
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


    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    public Long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Long getMyCount() {
        return myCount;
    }

    public void setMyCount(Long myCount) {
        this.myCount = myCount;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    public void setQuestionTypeCode(String questionTypeCode) {
        this.questionTypeCode = questionTypeCode;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }

    public String getPrepareId() {
        return prepareId;
    }

    public void setPrepareId(String prepareId) {
        this.prepareId = prepareId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}