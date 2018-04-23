package domain.view;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 课时备课基础信息
 */

public class PrepareLessonInfoView {

    private String id;

    private Long sortNumber;

    private String creatorId;

    private Timestamp createTime;

    private String modifierId;

    private Timestamp modifyTime;

    private Boolean isDelete;

    private Integer status;

    private String creatorName;// 创建人姓名

    private String lessonsTitle;//课时标题

    private String schoolId;//学校ID

    private String schoolCode;//学校code

    private String yearId;//学年ID

    private String yearCode;//学年code

    private String semesterId;//学期ID

    private String semesterCode;//学期code

    private String sectionId;//学段ID

    private String sectionName;

    private String sectionCode;//学段code

    private String gradeId;//年级ID

    private String gradeName;

    private String gradeCode;//年级code

    private String subjectId;//科目ID

    private String subjectName;

    private String textbookId;//教材id

    private String textbookCode;//教材code

    private String subjectCode;//科目code

    private String lessonsId;//章节ID

    private String lessonsCode;//章节code

    private Timestamp teachingTime;//授课时间

    private String imgUrl;//图片地址

    private Timestamp finishTime;//结束时间

    private Integer finishStatus;//结束标识(0:未结束，1:结束)

    private Integer mainStatus;//复备标识(0:主备，1：复备)

    private Boolean isShared;//是否共享(0:不共享，1:共享)

    private Boolean isCooperation;//协同标识（1协同备课，0个人备课)

    private Boolean isSynchro;//是否已同步：1-是

    private BigDecimal price;

    private Boolean isEnjoy;// 是否共享资源平台

    private PrepareLessonExtView prepareLessonExt;

    public Boolean getEnjoy() {
        return isEnjoy;
    }

    public void setEnjoy(Boolean enjoy) {
        isEnjoy = enjoy;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Long sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLessonsTitle() {
        return lessonsTitle;
    }

    public void setLessonsTitle(String lessonsTitle) {
        this.lessonsTitle = lessonsTitle == null ? null : lessonsTitle.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode == null ? null : schoolCode.trim();
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId == null ? null : yearId.trim();
    }

    public String getYearCode() {
        return yearCode;
    }

    public void setYearCode(String yearCode) {
        this.yearCode = yearCode == null ? null : yearCode.trim();
    }

    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId == null ? null : semesterId.trim();
    }

    public String getSemesterCode() {
        return semesterCode;
    }

    public void setSemesterCode(String semesterCode) {
        this.semesterCode = semesterCode == null ? null : semesterCode.trim();
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

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode == null ? null : gradeCode.trim();
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

    public String getLessonsId() {
        return lessonsId;
    }

    public void setLessonsId(String lessonsId) {
        this.lessonsId = lessonsId == null ? null : lessonsId.trim();
    }

    public String getLessonsCode() {
        return lessonsCode;
    }

    public void setLessonsCode(String lessonsCode) {
        this.lessonsCode = lessonsCode == null ? null : lessonsCode.trim();
    }

    public Timestamp getTeachingTime() {
        return teachingTime;
    }

    public void setTeachingTime(Timestamp teachingTime) {
        this.teachingTime = teachingTime;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(Integer finishStatus) {
        this.finishStatus = finishStatus;
    }

    public Integer getMainStatus() {
        return mainStatus;
    }

    public void setMainStatus(Integer mainStatus) {
        this.mainStatus = mainStatus;
    }

    public Boolean getShared() {
        return isShared;
    }

    public void setShared(Boolean shared) {
        isShared = shared;
    }

    public Boolean getCooperation() {
        return isCooperation;
    }

    public void setCooperation(Boolean cooperation) {
        isCooperation = cooperation;
    }

    public Boolean getSynchro() {
        return isSynchro;
    }

    public void setSynchro(Boolean synchro) {
        isSynchro = synchro;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public PrepareLessonExtView getPrepareLessonExt() {
        return prepareLessonExt;
    }

    public void setPrepareLessonExt(PrepareLessonExtView prepareLessonExt) {
        this.prepareLessonExt = prepareLessonExt;
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
}