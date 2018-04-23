package domain.view;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 文件实体
 *
 * @author anowls
 */
public class ResourceEntityView {

    @ApiModelProperty(value = "资源id")
    private String id;

    //文件相关
    @ApiModelProperty(value = "文件id")
    private String fileId;

    @ApiModelProperty(value = "文件名")
    private String fileName;

    @ApiModelProperty(value = "文件后缀")
    private String suffix;

    @ApiModelProperty(value = "播放长度")
    private BigDecimal playLength;

    @ApiModelProperty(value = "文件大小")
    private BigDecimal fileSize;


    //资源相关
    @ApiModelProperty(value = "资源titile")
    private String title;

    @ApiModelProperty(value = "文件积分")
    private BigDecimal price;


    @ApiModelProperty(value = "文件类型Id")
    private String typeId;

    @ApiModelProperty(value = "文件类型code")
    private String typeCode;


    @ApiModelProperty(value = "文件类型Id")
    private String setGroupId;//文件分组code

    @ApiModelProperty(value = "文件类型code")
    private String setGroupCode;

    @ApiModelProperty(value = "引用资源id")
    private String referenceId;

    //业务相关,
    @ApiModelProperty(value = "教材id")
    private String textbookId;

    @ApiModelProperty(value = "教材Code")
    private String textbookCode;

    @ApiModelProperty(value = "教材名称")
    private String textbookName;

    @ApiModelProperty(value = "章节Id")
    private String chapterId;

    @ApiModelProperty(value = "章节Code")
    private String chapterCode;


    @ApiModelProperty(value = "章节名称")
    private String chapterName;

    @ApiModelProperty(value = "版本id")
    private String versionId;

    @ApiModelProperty(value = "版本Code")
    private String versionCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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

    public BigDecimal getPlayLength() {
        return playLength;
    }

    public void setPlayLength(BigDecimal playLength) {
        this.playLength = playLength;
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
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

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(String textbookId) {
        this.textbookId = textbookId;
    }

    public String getTextbookCode() {
        return textbookCode;
    }

    public void setTextbookCode(String textbookCode) {
        this.textbookCode = textbookCode;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterCode() {
        return chapterCode;
    }

    public void setChapterCode(String chapterCode) {
        this.chapterCode = chapterCode;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getSetGroupId() {
        return setGroupId;
    }

    public void setSetGroupId(String setGroupId) {
        this.setGroupId = setGroupId;
    }

    public String getSetGroupCode() {
        return setGroupCode;
    }

    public void setSetGroupCode(String setGroupCode) {
        this.setGroupCode = setGroupCode;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }
}
