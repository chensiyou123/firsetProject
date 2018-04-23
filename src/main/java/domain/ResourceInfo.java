package domain;

import com.hanboard.educloud.resource.domain.view.ResourceEntityView;
import com.hanboard.educloud.resource.domain.view.ResourcePrepareView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "res_resource_info_new")
@ApiModel(description = "资源实体数据表")
public class ResourceInfo extends BaseExtDomain {

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "file_id")
    private String fileId;

    @ApiModelProperty(value = "创建人名")
    @Transient
    private String creatorName;

    @ApiModelProperty(value = "操作人id")
    @Column(name = "opreate_id")
    private String opreateId;

    @ApiModelProperty(value = "类型id",required = true)
    @Column(name = "type_id")
    private String typeId;

    @ApiModelProperty(value = "类型code",required = true)
    @Column(name = "type_code")
    private String typeCode;//类型code

    @ApiModelProperty(value = "类型Name")
    @Transient
    private String typeName;//类型code


    @ApiModelProperty(value = "分类id")
    @Column(name = "category_id")
    private String categoryId;


    @ApiModelProperty(value = "格式分组编码")
    @Column(name = "group_code")
    private String groupCode;


    @ApiModelProperty(value = "标题",required = true)
    private String title;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "关键字")
    private String keywords;

    @ApiModelProperty(value = "积分")
    private BigDecimal price;

    @ApiModelProperty(value = "浏览量")
    @Column(name = "browse_count")
    private Long browseCount;

    @ApiModelProperty(value = "下载量")
    @Column(name = "download_count")
    private Long downloadCount;

    @ApiModelProperty(value = "评论量")
    @Column(name = "comment_count")
    private Long commentCount;

    @ApiModelProperty(value = "收藏量")
    @Column(name = "collect_count")
    private Long collectCount;

    @ApiModelProperty(value = "总分")
    @Column(name = "total_score")
    private BigDecimal totalScore;

    @ApiModelProperty(value = "评分")
    @Column(name = "comment_score")
    private BigDecimal commentScore;

    @ApiModelProperty(value = "是否系统推优")
    @Column(name = "is_system_recommend")
    private Boolean isSystemRecommend;

    @ApiModelProperty(value = "推优总分数")
    @Column(name = "recommend_total_score")
    private BigDecimal recommendTotalScore;

    @ApiModelProperty(value = "是否校级推优",required = true)
    @Column(name = "is_recommend")
    private Boolean isRecommend;//

    @ApiModelProperty(value = "是否区级推优")
    @Column(name = "is_district_recommend")
    private Boolean isDistrictRecommend;

    @ApiModelProperty(value = "资源标签")
    @Column(name = "res_label")
    private String resLabel;

    @ApiModelProperty(value = "来源")
    private String source;


    @ApiModelProperty(value = "来源ID")
    @Column(name = "source_id")
    private String sourceId;

    @ApiModelProperty(value = "是否原创",required = true)
    @Column(name = "is_origin")
    private Boolean isOrigin;

    @ApiModelProperty(value = "资源自文件数")
    @Column(name = "sub_files")
    private Long subFiles;//

    @ApiModelProperty(value = "校级审核")
    @Column(name = "school_audit")
    private Integer schoolAudit;

    @ApiModelProperty(value = "区级审核",required = true)
    @Column(name = "district_audit")
    private Integer districtAudit;

    @ApiModelProperty(value = "机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

    @ApiModelProperty(value = "资源来源(存学校)")
    @Column(name = "resource_title")
    private String resourceTitle;

    @ApiModelProperty(value = "是否资源活动")
    @Column(name = "is_activity")
    private Boolean isActivity;

    @ApiModelProperty(value = "业务来源")
    @Column(name = "business_resource")
    private String businessResource;

    @ApiModelProperty(value = "业务来源id")
    @Column(name = "business_id")
    private String businessId;

    @ApiModelProperty(value = "引用资源id")
    @Column(name = "reference_id")
    private String referenceId;

    @ApiModelProperty(value = "试卷属性id")
    @Column(name = "exam_property_id")
    private String examPropertyId;

    @ApiModelProperty(value = "试卷属性code")
    @Column(name = "exam_property_code")
    private String examPropertyCode;

    @ApiModelProperty(value = "难易等级",required = true)
    @Column(name = "difficulty_level")
    private String difficultyLevel;

    @ApiModelProperty(value = "题型id",required = true)
    @Column(name = "question_type_id")
    private String questionTypeId;

    @ApiModelProperty(value = "题型code",required = true)
    @Column(name = "question_type_code")
    private String questionTypeCode;

    @ApiModelProperty(value = "资源年份",required = true)
    private Integer year;

    @ApiModelProperty(value = "资源运维类型",required = true)
    @Column(name = "maintenance_type")
    private Integer maintenanceType;

    @ApiModelProperty(value = "是否分享")
    @Transient
    private Boolean isShared;

    @ApiModelProperty(value = "教学反思")
    @Column(name = "prepare_teaching")
    private String prepareTeaching;

    @ApiModelProperty(value = "创建人机构id")
    @Column(name = "user_org_id")
    private String userOrgId;

    @ApiModelProperty(value = "封面")
    @Column(name = "prepare_cover")
    private String prepareCover;



    @ApiModelProperty(value = "上传量")
    @Transient
    private Long uploadCount;


    @ApiModelProperty(value = "统计数量")
    @Transient
    private Long staticsCount;

    //=============================文件扩展start=================//
    @Transient
    @ApiModelProperty(value = "试卷名")
    private String paperTitle;

    @Transient
    @ApiModelProperty(value = "及格分")
    private BigDecimal passScore;

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
    // =============================文件扩展end=================//

    //==============================业务扩展start===============//

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

    @ApiModelProperty(value = "学校id",required = true)
    @Transient
    private String schoolId;

    @ApiModelProperty(value = "学校编码")
    @Transient
    private String schoolCode;

    @ApiModelProperty(value = "学校名称")
    @Transient
    private String schoolName;

    @ApiModelProperty(value = "教材id",required = true)
    @Transient
    private String textbookId;

    @ApiModelProperty(value = "教材编码")
    @Transient
    private String textbookCode;

    @ApiModelProperty(value = "教材名称")
    @Transient
    private String textbookName;


    @ApiModelProperty(value = "教材版本id",required = true)
    @Transient
    private String versionId;

    @ApiModelProperty(value = "教材版本编码")
    @Transient
    private String versionCode;

    @ApiModelProperty(value = "章节id",required = true)
    @Transient
    private String chapterId;

    @ApiModelProperty(value = "章节编码")
    @Transient
    private String chapterCode;

    @ApiModelProperty(value = "章节名称")
    @Transient
    private String chapterName;


    @ApiModelProperty(value = "学年id",required = true)
    @Transient
    private String academicYearId;

    @ApiModelProperty(value = "学年编码")
    @Transient
    private String academicYearCode;

    @ApiModelProperty(value = "学年名称")
    @Transient
    private String academicYearName;

    @ApiModelProperty(value = "学期id",required = true)
    @Transient
    private String semesterId;

    @ApiModelProperty(value = "学期编码")
    @Transient
    private String semesterCode;

    //==============================业务扩展end===============//



    @Transient
    @ApiModelProperty(value = "对应教学包父包id")
    private String resourceId;



    @Transient
    @ApiModelProperty(value = "是否资源包文件{1.是0否}")
    private Integer isRrp;


    @Transient
    @ApiModelProperty(value = "辅助字段")
    private String auId;

    @ApiModelProperty(value = "共享文件数")
    @Transient
    private Integer ckNum;

    @ApiModelProperty(value = "是否收藏资源")
    @Transient
    private String myCount;


    @ApiModelProperty(value = "资源类型名称")
    @Transient
    private String name;

    @ApiModelProperty(value = "创建人名称")
    @Transient
    private String createName;

    @ApiModelProperty(value = "审核时间")
    @Transient
    private String approverTime;

    @ApiModelProperty(value = "推优状态")
    @Transient
    private String pushStatus;

    @ApiModelProperty(value = "推荐时间")
    @Transient
    private String recommendTime;

    @ApiModelProperty(value = "试卷总分数")
    @Transient
    private BigDecimal paperTotalScore;


    @Transient
    @ApiModelProperty(value = "试题")
    private PaperQuestion paperQuestion = new PaperQuestion();

    @ApiModelProperty(value = "试卷(电子作业)")
    @Transient
    private PaperExam paperExam = new PaperExam();

    @ApiModelProperty(value = "分卷(电子作业)")
    @Transient
    private List<PaperSubPaper> subPaperList = new ArrayList<>();

    @ApiModelProperty(value = "教学包")
    @Transient
    private ResourcePrepareView resourcePrepare = new ResourcePrepareView();

    @Transient
    @ApiModelProperty(value = "资源标签")
    private List<ResourceResLabel> resourceResLabel;


    @Transient
    @ApiModelProperty(value = "资源列表")
    private List<ResourceEntityView> resourceInfoList;

    @ApiModelProperty(value = "教学包中学案、素材、教学设计、课件、素材、试卷ids集合")
    @Transient
    private String downLoadIds;

    @ApiModelProperty(value = "资源被引用次数")
    @Transient
    private Integer records;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Long getStaticsCount() {
        return staticsCount;
    }

    public void setStaticsCount(Long staticsCount) {
        this.staticsCount = staticsCount;
    }

    public Long getUploadCount() {
        return uploadCount;
    }

    public void setUploadCount(Long uploadCount) {
        this.uploadCount = uploadCount;
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

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public BigDecimal getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(BigDecimal commentScore) {
        this.commentScore = commentScore;
    }

    public Boolean getIsSystemRecommend() {
        return isSystemRecommend;
    }

    public void setIsSystemRecommend(Boolean isSystemRecommend) {
        this.isSystemRecommend = isSystemRecommend;
    }

    public BigDecimal getRecommendTotalScore() {
        return recommendTotalScore;
    }

    public void setRecommendTotalScore(BigDecimal recommendTotalScore) {
        this.recommendTotalScore = recommendTotalScore;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getResLabel() {
        return resLabel;
    }

    public void setResLabel(String resLabel) {
        this.resLabel = resLabel == null ? null : resLabel.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }


    public Long getSubFiles() {
        return subFiles;
    }

    public void setSubFiles(Long subFiles) {
        this.subFiles = subFiles;
    }

    public Integer getSchoolAudit() {
        return schoolAudit;
    }

    public void setSchoolAudit(Integer schoolAudit) {
        this.schoolAudit = schoolAudit;
    }

    public Integer getDistrictAudit() {
        return districtAudit;
    }

    public void setDistrictAudit(Integer districtAudit) {
        this.districtAudit = districtAudit;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle == null ? null : resourceTitle.trim();
    }

    public Boolean getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(Boolean isActivity) {
        this.isActivity = isActivity;
    }

    public String getBusinessResource() {
        return businessResource;
    }

    public void setBusinessResource(String businessResource) {
        this.businessResource = businessResource == null ? null : businessResource.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId == null ? null : referenceId.trim();
    }

    public String getExamPropertyId() {
        return examPropertyId;
    }

    public void setExamPropertyId(String examPropertyId) {
        this.examPropertyId = examPropertyId == null ? null : examPropertyId.trim();
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel == null ? null : difficultyLevel.trim();
    }

    public String getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(String questionTypeId) {
        this.questionTypeId = questionTypeId == null ? null : questionTypeId.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public String getOpreateId() {
        return opreateId;
    }

    public void setOpreateId(String opreateId) {
        this.opreateId = opreateId;
    }

    public Boolean getSystemRecommend() {
        return isSystemRecommend;
    }

    public void setSystemRecommend(Boolean systemRecommend) {
        isSystemRecommend = systemRecommend;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
    }


    public Boolean getActivity() {
        return isActivity;
    }

    public void setActivity(Boolean activity) {
        isActivity = activity;
    }


    public PaperExam getPaperExam() {
        return paperExam;
    }

    public void setPaperExam(PaperExam paperExam) {
        this.paperExam = paperExam;
    }


    public ResourcePrepareView getResourcePrepare() {
        return resourcePrepare;
    }

    public void setResourcePrepare(ResourcePrepareView resourcePrepare) {
        this.resourcePrepare = resourcePrepare;
    }

    public List<ResourceResLabel> getResourceResLabel() {
        return resourceResLabel;
    }

    public void setResourceResLabel(List<ResourceResLabel> resourceResLabel) {
        this.resourceResLabel = resourceResLabel;
    }

    public List<ResourceEntityView> getResourceInfoList() {
        return resourceInfoList;
    }

    public void setResourceInfoList(List<ResourceEntityView> resourceInfoList) {
        this.resourceInfoList = resourceInfoList;
    }

    public Boolean getShared() {
        return isShared;
    }

    public void setShared(Boolean shared) {
        isShared = shared;
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

    public String getTextbookCode() {
        return textbookCode;
    }

    public void setTextbookCode(String textbookCode) {
        this.textbookCode = textbookCode;
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

    public String getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(String academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getAcademicYearCode() {
        return academicYearCode;
    }

    public void setAcademicYearCode(String academicYearCode) {
        this.academicYearCode = academicYearCode;
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterCode() {
        return semesterCode;
    }

    public void setSemesterCode(String semesterCode) {
        this.semesterCode = semesterCode;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public PaperQuestion getPaperQuestion() {
        return paperQuestion;
    }

    public void setPaperQuestion(PaperQuestion paperQuestion) {
        this.paperQuestion = paperQuestion;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getApproverTime() {
        return approverTime;
    }

    public void setApproverTime(String approverTime) {
        this.approverTime = approverTime;
    }

    public String getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus;
    }

    public String getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(String recommendTime) {
        this.recommendTime = recommendTime;
    }


    public List<PaperSubPaper> getSubPaperList() {
        return subPaperList;
    }

    public void setSubPaperList(List<PaperSubPaper> subPaperList) {
        this.subPaperList = subPaperList;
    }

    public String getAcademicYearName() {
        return academicYearName;
    }

    public void setAcademicYearName(String academicYearName) {
        this.academicYearName = academicYearName;
    }

    public Integer getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(Integer maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    public void setQuestionTypeCode(String questionTypeCode) {
        this.questionTypeCode = questionTypeCode;
    }

    public String getExamPropertyCode() {
        return examPropertyCode;
    }

    public void setExamPropertyCode(String examPropertyCode) {
        this.examPropertyCode = examPropertyCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPrepareTeaching() {
        return prepareTeaching;
    }

    public void setPrepareTeaching(String prepareTeaching) {
        this.prepareTeaching = prepareTeaching;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Boolean getOrigin() {
        return isOrigin;
    }

    public void setOrigin(Boolean origin) {
        isOrigin = origin;
    }

    public String getMyCount() {
        return myCount;
    }

    public void setMyCount(String myCount) {
        this.myCount = myCount;
    }

    public Integer getCkNum() {
        return ckNum;
    }

    public void setCkNum(Integer ckNum) {
        this.ckNum = ckNum;
    }

    public BigDecimal getPaperTotalScore() {
        return paperTotalScore;
    }

    public void setPaperTotalScore(BigDecimal paperTotalScore) {
        this.paperTotalScore = paperTotalScore;
    }

    public String getDownLoadIds() {
        return downLoadIds;
    }

    public void setDownLoadIds(String downLoadIds) {
        this.downLoadIds = downLoadIds;
    }

    public Boolean getDistrictRecommend() {
        return isDistrictRecommend;
    }

    public void setDistrictRecommend(Boolean districtRecommend) {
        isDistrictRecommend = districtRecommend;
    }

    public String getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(String userOrgId) {
        this.userOrgId = userOrgId;
    }

    public String getAuId() {
        return auId;
    }

    public void setAuId(String auId) {
        this.auId = auId;
    }

    public String getPrepareCover() {
        return prepareCover;
    }

    public void setPrepareCover(String prepareCover) {
        this.prepareCover = prepareCover;
    }

    public Integer getIsRrp() {
        return isRrp;
    }

    public void setIsRrp(Integer isRrp) {
        this.isRrp = isRrp;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public BigDecimal getPassScore() {
        return passScore;
    }

    public void setPassScore(BigDecimal passScore) {
        this.passScore = passScore;
    }
}