package domain;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "activities_new")
@ApiModel(description = "活动实体数据表")
public class Activitie {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动名称",required = true)
    @Column(name = "activity_name")
    private String activityName;

    @ApiModelProperty(value = "活动描述",required = true)
    @Column(name = "description")
    private String description;

    @ApiModelProperty(value = "状态",required = true)
    @Column(name = "status")
    private Integer status;

    @ApiModelProperty(value = "上级评比活动")
    @Column(name = "super_compar_activity")
    private String superComparActivity;

    @ApiModelProperty(value = "主办单位名称")
    @Column(name = "organizer_name")
    private String organizerName;

    @ApiModelProperty(value = "主办单位机构id",required = true)
    @Column(name = "organizer_id")
    private String organizerId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "开始时间",required = true)
    @Column(name = "start_time")
    private Timestamp startTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "结束时间",required = true)
    @Column(name = "end_time")
    private Timestamp endTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "作品提交截止时间",required = true)
    @Column(name = "submission_date")
    private Timestamp submissionDate;

    @ApiModelProperty(value = "封面",required = true)
    @Column(name = "cover")
    private String cover;

    @ApiModelProperty(value = "是否公开")
    @Column(name = "is_open")
    private Boolean isOpen;

    @ApiModelProperty(value = "资源类型",required = true)
    @Column(name = "source_type")
    private Integer sourceType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间",required = true)
    @Column(name = "create_time")
    private Timestamp createTime;

    @ApiModelProperty(value = "创建人",required = true)
    @Column(name = "creator")
    private String creator;

    @ApiModelProperty(value = "创建人Id",required = true)
    @Column(name = "creator_id")
    private String creatorId;

    @ApiModelProperty(value = "学段id",required = true)
    @Column(name = "gradation_id")
    private String gradationId;

    @ApiModelProperty(value = "学校Id",required = true)
    @Column(name = "school_id")
    private String schoolId;

    @ApiModelProperty(value = "年级id",required = true)
    @Column(name = "grade_id")
    private String gradeId;

    @ApiModelProperty(value = "课程id",required = true)
    @Column(name = "course_id")
    private String courseId;

    @ApiModelProperty(value = "课程Code",required = true)
    @Column(name = "course_code")
    private String courseCode;

    @ApiModelProperty(value = "教材id",required = true)
    @Column(name = "textbook_id")
    private String textbookId;

    @ApiModelProperty(value = "章节id",required = true)
    @Column(name = "chapter_id")
    private String chapterId;

    @ApiModelProperty(value = "班级Id",required = true)
    @Column(name = "class_id")
    private String classId;

    @ApiModelProperty(value = "学期Id",required = true)
    @Column(name = "semester_id")
    private String semesterId;

    @ApiModelProperty(value = "学年id",required = true)
    @Column(name = "school_year_id")
    private String schoolYearId;

    @ApiModelProperty(value = "是否关联教材")
    @Column(name = "is_related_materials")
    private Boolean isRelatedMaterials;

    @ApiModelProperty(value = "浏览量",required = true)
    @Column(name = "browse_count")
    private Long browseCount;

    @ApiModelProperty(value = "下载量",required = true)
    @Column(name = "download_count")
    private Long downloadCount;

    @ApiModelProperty(value = "收藏量",required = true)
    @Column(name = "collection_count")
    private Long collectionCount;

    @ApiModelProperty(value = "评论量",required = true)
    @Column(name = "comment_count")
    private Long commentCount;

    @ApiModelProperty(value = "是否启用排名")
    @Column(name = "used_awards_card")
    private Boolean usedAwardsCard;

    @ApiModelProperty(value = "评审开始是否显示作品",required = true)
    @Column(name = "is_show")
    private Boolean isShow;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "报名截止日期",required = true)
    @Column(name = "signup_time")
    private Timestamp signupTime;

    @ApiModelProperty(value = "是否删除",required = true)
    @Column(name = "is_delete")
    private Boolean isDelete;

    @ApiModelProperty(value = "参与类型",required = true)
    @Column(name = "set_people")
    private Integer setPeople;

    @ApiModelProperty(value = "分类id",required = true)
    @Column(name = "category_id")
    private String categoryId;


    @ApiModelProperty(value = "是否推荐活动",required = true)
    @Column(name = "is_recommend")
    private Boolean isRecommend;

    @ApiModelProperty(value = "是否组织评审")
    @Column(name = "is_judge")
    private Boolean isJudge;

    @ApiModelProperty(value = "评审状态",required = true)
    @Column(name = "review_status")
    private Integer reviewStatus;

    @ApiModelProperty(value = "作者数",required = true)
    @Column(name = "author_num")
    private Integer authorNum;

    @ApiModelProperty(value = "获奖作品数",required = true)
    @Column(name = "author_num")
    private Integer levelWork;



    @ApiModelProperty(value = "机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

    @ApiModelProperty(value = "校机构id",required = true)
    @Column(name = "user_org_id")
    private String userOrgId;


    @ApiModelProperty(value = "作品上传最大数",required = true)
    @Column(name = "work_maxnum")
    private Integer workMaxnum;

    @ApiModelProperty(value = "作品分配方式{0：平均分配；1：手动分配}")
    @Column(name = "allotation_type")
    private Integer allotationType;

    //=========扩展属性========//

    @ApiModelProperty(value = "活动状态")
    @Transient
    private Integer actStatus;

    @ApiModelProperty(value = "参加活动数")
    @Transient
    private Integer actCount;



    @ApiModelProperty(value = "作品提交数")
    @Transient
    private Integer workNum;


    @ApiModelProperty(value = "参赛人数")
    @Transient
    private Integer partNum;

    @ApiModelProperty(value = "该活动中我获奖次数")
    @Transient
    private Integer levelNum;

    @ApiModelProperty(value = "活动对应奖项数量")
    @Transient
    private Integer  levelCont;

    @ApiModelProperty(value = "是否关联教材中文显示")
    @Transient
    private String relatedMaterialsShow;

    @ApiModelProperty(value = "活动状态中文显示")
    @Transient
    private String statusShow;

    @ApiModelProperty(value = "评审方式中文显示")
    @Transient
    private String judgeShow;



    @ApiModelProperty(value = "评审设置状态")
    @Transient
    private Integer auditStatus;


    @ApiModelProperty(value = "分类名")
    @Transient
    private String categoryName;


    @ApiModelProperty(value = "机构Name")
    @Transient
    private String orgName;

    @ApiModelProperty(value = "活动负责人")
    @Transient
    private String managersName;

    @ApiModelProperty(value = "可以上传的作品的类型")
    @Transient
    private String typeNames;

    @ApiModelProperty(value = "适应学段")
    @Transient
    private String gradationNames;

    @ApiModelProperty(value = "适应年级")
    @Transient
    private String gradeNames;

    @ApiModelProperty(value = "适应课程")
    @Transient
    private String courseNames;

    @ApiModelProperty(value = "参与人审核状态")
    @Transient
    private String partStatus;



    @ApiModelProperty(value = "配置")
    @Transient
    private List<ActivityTypeConfig> actTypeConfigList;

    @ApiModelProperty(value = "附件")
    @Transient
    private List<ActivityAttachment> actAttachments;

    @ApiModelProperty(value = "附件")
    @Transient
    private List<ActivityParticipant> actParticipantList;

    @ApiModelProperty(value = "附件")
    @Transient
    private List<ActivityScope> actScopeList;

    @ApiModelProperty(value = "管理者")
    @Transient
    private List<ActivityManager> managers = new ArrayList<>();

    @ApiModelProperty(value = "评审关系")
    @Transient
    private List<ActivityAllotation> actAllotationList = new ArrayList<>();

    @ApiModelProperty(value = "活动量规")
    @Transient
    private List<ActivityComparisonGauge> actComparisonGaugeList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSuperComparActivity() {
        return superComparActivity;
    }

    public void setSuperComparActivity(String superComparActivity) {
        this.superComparActivity = superComparActivity;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
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

    public Timestamp getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Timestamp submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
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

    public String getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(String textbookId) {
        this.textbookId = textbookId;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public String getSchoolYearId() {
        return schoolYearId;
    }

    public void setSchoolYearId(String schoolYearId) {
        this.schoolYearId = schoolYearId;
    }

    public Boolean getRelatedMaterials() {
        return isRelatedMaterials;
    }

    public void setRelatedMaterials(Boolean relatedMaterials) {
        isRelatedMaterials = relatedMaterials;
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

    public Boolean getUsedAwardsCard() {
        return usedAwardsCard;
    }

    public void setUsedAwardsCard(Boolean usedAwardsCard) {
        this.usedAwardsCard = usedAwardsCard;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    public Timestamp getSignupTime() {
        return signupTime;
    }

    public void setSignupTime(Timestamp signupTime) {
        this.signupTime = signupTime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getSetPeople() {
        return setPeople;
    }

    public void setSetPeople(Integer setPeople) {
        this.setPeople = setPeople;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
    }

    public Boolean getJudge() {
        return isJudge;
    }

    public void setJudge(Boolean judge) {
        isJudge = judge;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Integer getAuthorNum() {
        return authorNum;
    }

    public void setAuthorNum(Integer authorNum) {
        this.authorNum = authorNum;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Integer getWorkMaxnum() {
        return workMaxnum;
    }

    public void setWorkMaxnum(Integer workMaxnum) {
        this.workMaxnum = workMaxnum;
    }

    public List<ActivityTypeConfig> getActTypeConfigList() {
        return actTypeConfigList;
    }

    public void setActTypeConfigList(List<ActivityTypeConfig> actTypeConfigList) {
        this.actTypeConfigList = actTypeConfigList;
    }

    public List<ActivityAttachment> getActAttachments() {
        return actAttachments;
    }

    public void setActAttachments(List<ActivityAttachment> actAttachments) {
        this.actAttachments = actAttachments;
    }

    public List<ActivityParticipant> getActParticipantList() {
        return actParticipantList;
    }

    public void setActParticipantList(List<ActivityParticipant> actParticipantList) {
        this.actParticipantList = actParticipantList;
    }

    public List<ActivityScope> getActScopeList() {
        return actScopeList;
    }

    public void setActScopeList(List<ActivityScope> actScopeList) {
        this.actScopeList = actScopeList;
    }

    public List<ActivityManager> getManagers() {
        return managers;
    }

    public void setManagers(List<ActivityManager> managers) {
        this.managers = managers;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getManagersName() {
        return managersName;
    }

    public void setManagersName(String managersName) {
        this.managersName = managersName;
    }

    public Integer getActStatus() {
        return actStatus;
    }

    public void setActStatus(Integer actStatus) {
        this.actStatus = actStatus;
    }

    public List<ActivityAllotation> getActAllotationList() {
        return actAllotationList;
    }

    public void setActAllotationList(List<ActivityAllotation> actAllotationList) {
        this.actAllotationList = actAllotationList;
    }

    public List<ActivityComparisonGauge> getActComparisonGaugeList() {
        return actComparisonGaugeList;
    }

    public void setActComparisonGaugeList(List<ActivityComparisonGauge> actComparisonGaugeList) {
        this.actComparisonGaugeList = actComparisonGaugeList;
    }

    public Integer getWorkNum() {
        return workNum;
    }

    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    public Integer getPartNum() {
        return partNum;
    }

    public void setPartNum(Integer partNum) {
        this.partNum = partNum;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
    }

    public Integer getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(Integer levelNum) {
        this.levelNum = levelNum;
    }

    public String getGradationNames() {
        return gradationNames;
    }

    public void setGradationNames(String gradationNames) {
        this.gradationNames = gradationNames;
    }

    public String getGradeNames() {
        return gradeNames;
    }

    public void setGradeNames(String gradeNames) {
        this.gradeNames = gradeNames;
    }

    public String getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(String courseNames) {
        this.courseNames = courseNames;
    }

    public Integer getAllotationType() {
        return allotationType;
    }

    public void setAllotationType(Integer allotationType) {
        this.allotationType = allotationType;
    }

    public Integer getLevelCont() {
        return levelCont;
    }

    public void setLevelCont(Integer levelCont) {
        this.levelCont = levelCont;
    }

    public String getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(String typeNames) {
        this.typeNames = typeNames;
    }

    public Integer getLevelWork() {
        return levelWork;
    }

    public void setLevelWork(Integer levelWork) {
        this.levelWork = levelWork;
    }

    public String getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(String userOrgId) {
        this.userOrgId = userOrgId;
    }

    public Integer getActCount() {
        return actCount;
    }

    public void setActCount(Integer actCount) {
        this.actCount = actCount;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getRelatedMaterialsShow() {
        return relatedMaterialsShow;
    }

    public void setRelatedMaterialsShow(String relatedMaterialsShow) {
        this.relatedMaterialsShow = relatedMaterialsShow;
    }

    public String getStatusShow() {
        return statusShow;
    }

    public void setStatusShow(String statusShow) {
        this.statusShow = statusShow;
    }

    public String getJudgeShow() {
        return judgeShow;
    }

    public void setJudgeShow(String judgeShow) {
        this.judgeShow = judgeShow;
    }

    public String getPartStatus() {
        return partStatus;
    }

    public void setPartStatus(String partStatus) {
        this.partStatus = partStatus;
    }
}