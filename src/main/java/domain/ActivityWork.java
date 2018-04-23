package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author Administrator
 */
@Entity
@Table(name = "activity_work_new")
@ApiModel(description = "活动实体数据表")
public class ActivityWork implements Serializable{
    private static final long serialVersionUID = -7582010624104320703L;
    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动ID",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "评分总分",required = true)
    @Column(name = "total_score")
    private BigDecimal totalScore;

    @ApiModelProperty(value = "作品说明",required = true)
    @Column(name = "remark")
    private String remark;

    @ApiModelProperty(value = "评分等级ID",required = true)
    @Column(name = "level_id")
    private String levelId;

    @ApiModelProperty(value = "原始评分等级ID",required = true)
    @Column(name = "old_level_id")
    private String oldLevelId;

    @ApiModelProperty(value = "更新时间",required = true)
    @Column(name = "update_time")
    private Date updateTime;

    @ApiModelProperty(value = "创建人",required = true)
    @Column(name = "creator")
    private String creator;

    @ApiModelProperty(value = "创建人id",required = true)
    @Column(name = "creator_id")
    private String creatorId;

    @ApiModelProperty(value = "创建时间",required = true)
    @Column(name = "create_time")
    private Date createTime;

    @ApiModelProperty(value = "作品名称",required = true)
    @Column(name = "work_title")
    private String workTitle;

    @ApiModelProperty(value = "作者名称",required = true)
    @Column(name = "author")
    private String author;

    @ApiModelProperty(value = "联系电话",required = true)
    @Column(name = "contact_number")
    private String contactNumber;

    @ApiModelProperty(value = "学校名称",required = true)
    @Column(name = "school_name")
    private String schoolName;

    @ApiModelProperty(value = "浏览次数",required = true)
    @Column(name = "browse_count")
    private Long browseCount;

    @ApiModelProperty(value = "下载次数",required = true)
    @Column(name = "download_count")
    private Long downloadCount;

    @ApiModelProperty(value = "收藏次数",required = true)
    @Column(name = "collection_count")
    private Long collectionCount;

    @ApiModelProperty(value = "评论次数",required = true)
    @Column(name = "comment_count")
    private Long commentCount;

    @ApiModelProperty(value = "状态 0正常 1 移除",required = true)
    @Column(name = "status")
    private Byte status;

    @ApiModelProperty(value = "活动名称",required = true)
    @Column(name = "cover")
    private String cover;

    @ApiModelProperty(value = "保存者类型(管理员1,上传者0)")
    @Transient
    private Integer updateType;

    @ApiModelProperty(value = "配置")
    @Transient
    private List<ActivityTypeConfig> typeConfigList;

    @ApiModelProperty(value = "是否原创")
    @Transient
    private Boolean isOrigin;

    @ApiModelProperty(value = "学段id",required = true)
    @Transient
    private String gradationId;

    @ApiModelProperty(value = "学段编码")
    @Transient
    private String gradationCode;

    @ApiModelProperty(value = "学段名称")
    @Transient
    private String gradationName;

    @ApiModelProperty(value = "年级id",required = true)
    @Transient
    private String gradeId;

    @ApiModelProperty(value = "年级编码")
    @Transient
    private String gradeCode;

    @ApiModelProperty(value = "年级名称")
    @Transient
    private String gradeName;

    @ApiModelProperty(value = "课程id",required = true)
    @Transient
    private String courseId;

    @ApiModelProperty(value = "课程编码")
    @Transient
    private String courseCode;

    @ApiModelProperty(value = "课程名称")
    @Transient
    private String courseName;

    @ApiModelProperty(value = "活动名称")
    @Transient
    private String activityName;

    @ApiModelProperty(value = "主办单位")
    @Transient
    private String organizerName;

    @ApiModelProperty(value = "机构")
    @Transient
    private String orgName;
    /**
     * 学校id
     */
    @ApiModelProperty(value = "学校id")
    @Transient
    private String schoolId;

    @ApiModelProperty(value = "评审专家id")
    @Transient
    private String participantId;

    @ApiModelProperty(value = "评审专家Name")
    @Transient
    private String participantName;

    @ApiModelProperty(value = "评分等级名称")
    @Transient
    private String levelName;

    @ApiModelProperty(value = "评分")
    @Transient
    private BigDecimal score;

    @ApiModelProperty(value = "活动开始时间")
    @Transient
    private Timestamp startTime;

    @ApiModelProperty(value = "活动结束时间")
    @Transient
    private Timestamp endTime;

    @ApiModelProperty(value = "评语")
    @Transient
    private String gradingMark;

    @ApiModelProperty(value = "是否评审")
    @Transient
    private int isAudit;


    @ApiModelProperty(value = "量规分数")
    @Transient
    private BigDecimal gaugeScores;


    @ApiModelProperty(value = "作者参赛资格是否被移除")
    @Transient
    private Integer isDelete;

    @ApiModelProperty(value = "是否区级推优")
    @Transient
    private boolean districtRecommend;


    @ApiModelProperty(value = "活动评审状态")
    @Transient
    private Integer reviewStatus;

    @ApiModelProperty(value = "作品查看路径")
    @Transient
    private String workUrl;

    @ApiModelProperty(value = "作品被评次数")
    @Transient
    private Integer count;

    @ApiModelProperty(value = "活动状态")
    @Transient
    private Integer activityStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public BigDecimal getTotalScore() {
        return Objects.isNull(totalScore) ? BigDecimal.valueOf(0) : totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId == null ? null : levelId.trim();
    }

    public String getOldLevelId() {
        return oldLevelId;
    }

    public void setOldLevelId(String oldLevelId) {
        this.oldLevelId = oldLevelId == null ? null : oldLevelId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle == null ? null : workTitle.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Long getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Long browseCount) {
        this.browseCount = browseCount;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Long getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Long collectionCount) {
        this.collectionCount = collectionCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public List<ActivityTypeConfig> getTypeConfigList() {
        return typeConfigList;
    }

    public void setTypeConfigList(List<ActivityTypeConfig> typeConfigList) {
        this.typeConfigList = typeConfigList;
    }

    public Boolean getOrigin() {
        return isOrigin;
    }

    public void setOrigin(Boolean origin) {
        isOrigin = origin;
    }

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getGradationCode() {
        return gradationCode;
    }

    public void setGradationCode(String gradationCode) {
        this.gradationCode = gradationCode;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getGradingMark() {
        return gradingMark;
    }

    public void setGradingMark(String gradingMark) {
        this.gradingMark = gradingMark;
    }

    public int getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(int isAudit) {
        this.isAudit = isAudit;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getGaugeScores() {
        return gaugeScores;
    }

    public void setGaugeScores(BigDecimal gaugeScores) {
        this.gaugeScores = gaugeScores;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public boolean isDistrictRecommend() {
        return districtRecommend;
    }

    public void setDistrictRecommend(boolean districtRecommend) {
        this.districtRecommend = districtRecommend;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getWorkUrl() {
        return workUrl;
    }

    public void setWorkUrl(String workUrl) {
        this.workUrl = workUrl;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }
}