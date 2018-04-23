package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "res_label_new")
@ApiModel(description = "资源标签数据表")
public class ResourceResLabel extends BaseExtDomain {

    @ApiModelProperty(value = "标签名",required = true)
    private String name;

    @ApiModelProperty(value = "组织机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

    @ApiModelProperty(value = "学校id",required = true)
    @Column(name = "school_id")
    private String schoolId;

    @ApiModelProperty(value = "学校编码")
    @Column(name = "school_code")
    private String schoolCode;

    @ApiModelProperty(value = "学段id",required = true)
    @Column(name = "gradation_id")
    private String gradationId;

    @ApiModelProperty(value = "学段code")
    @Column(name = "gradation_code")
    private String gradationCode;

    @ApiModelProperty(value = "年级id",required = true)
    @Column(name = "grade_id")
    private String gradeId;

    @ApiModelProperty(value = "年级code")
    @Column(name = "grade_code")
    private String gradeCode;//

    @ApiModelProperty(value = "课程id",required = true)
    @Column(name = "course_id")
    private String courseId;

    @ApiModelProperty(value = "课程code")
    @Column(name = "course_code")
    private String courseCode;

    @ApiModelProperty(value = "教材id",required = true)
    @Column(name = "textbook_id")
    private String textbookId;

    @ApiModelProperty(value = "教材编码")
    @Column(name = "textbook_code")
    private String textbookCode;

    @ApiModelProperty(value = "章节id",required = true)
    @Column(name = "chapter_id")
    private String chapterId;

    @ApiModelProperty(value = "章节code")
    @Column(name = "chapter_code")
    private String chapterCode;

    @ApiModelProperty(value = "班级id",required = true)
    @Column(name = "class_id")
    private String classId;

    @ApiModelProperty(value = "班级code")
    @Column(name = "class_code")
    private String classCode;

    @ApiModelProperty(value = "学年id",required = true)
    @Column(name = "academic_year_id")
    private String academicYearId;//

    @ApiModelProperty(value = "学年code")
    @Column(name = "academic_year_code")
    private String academicYearCode;

    @ApiModelProperty(value = "学期id",required = true)
    @Column(name = "semester_id")
    private String semesterId;

    @ApiModelProperty(value = "学期code")
    @Column(name = "semester_code")
    private String semesterCode;

    @ApiModelProperty(value = "是否自定义标签")
    @Transient
    private Integer isSelf;

    @ApiModelProperty(value = "用户名")
    @Transient
    private String  userName;

    @ApiModelProperty(value = "学段")
    @Transient
    private String gradationName;
    @ApiModelProperty(value = "年级")
    @Transient
    private String gradeName;
    @ApiModelProperty(value = "课程")
    @Transient
    private String courseName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
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

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId == null ? null : gradationId.trim();
    }

    public String getGradationCode() {
        return gradationCode;
    }

    public void setGradationCode(String gradationCode) {
        this.gradationCode = gradationCode == null ? null : gradationCode.trim();
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode == null ? null : courseCode.trim();
    }

    public String getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(String textbookId) {
        this.textbookId = textbookId == null ? null : textbookId.trim();
    }

    public String getTextbookCode() {
        return textbookCode;
    }

    public void setTextbookCode(String textbookCode) {
        this.textbookCode = textbookCode == null ? null : textbookCode.trim();
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId == null ? null : chapterId.trim();
    }

    public String getChapterCode() {
        return chapterCode;
    }

    public void setChapterCode(String chapterCode) {
        this.chapterCode = chapterCode == null ? null : chapterCode.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(String academicYearId) {
        this.academicYearId = academicYearId == null ? null : academicYearId.trim();
    }

    public String getAcademicYearCode() {
        return academicYearCode;
    }

    public void setAcademicYearCode(String academicYearCode) {
        this.academicYearCode = academicYearCode == null ? null : academicYearCode.trim();
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

    public Integer getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Integer isSelf) {
        this.isSelf = isSelf;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
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
}