package domain.mobile;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MobileResourceInfo {
    private String id;
    private String fileId;
    private String typeCode;
    private String title;
    private String prepareCover;
    private String gradeName;
    private String courseName;
    private String chapterName;
    private String createName;
    private String courseCode;
    private String gradeId;
    private String chapterId;
    private String creatorId;
    private String shareId;
    private String browseId;
    private String downloadId;
    private Integer shareType = 0;
    private BigDecimal commentScore = new BigDecimal(0);

    private Long downloadCount = new Long(0);
    private Long commentCount = new Long(0);
    private Long collectCount = new Long(0);


    private String suffix;
    private BigDecimal fileSize = new BigDecimal(0);
    private BigDecimal playLength = new BigDecimal(0);
    private Boolean isDelete = false;

    /**
     * 审核状态
     * 0 不审核 1 校级待审核  2 校级审核通过 3 校级审核不通过 4 区级待审核 5 区级审核通过 6 区级审核不通过 10 未知状态
     */
    private Integer auditStatus = 0;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp downloadTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp browseTime;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp shareTime;

    public String getBrowseId() {
        return browseId;
    }

    public void setBrowseId(String browseId) {
        this.browseId = browseId;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getShareType() {
        return shareType;
    }

    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public Timestamp getShareTime() {
        return shareTime;
    }

    public void setShareTime(Timestamp shareTime) {
        this.shareTime = shareTime;
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

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }

    public Timestamp getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Timestamp downloadTime) {
        this.downloadTime = downloadTime;
    }

    public Timestamp getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Timestamp browseTime) {
        this.browseTime = browseTime;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public BigDecimal getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(BigDecimal commentScore) {
        this.commentScore = commentScore;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrepareCover() {
        return prepareCover;
    }

    public void setPrepareCover(String prepareCover) {
        this.prepareCover = prepareCover;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
