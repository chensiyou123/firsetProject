package domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "res_favorite")
@ApiModel(description = "常用教材数据表")
public class ResourceFavorite extends BaseExtDomain {

    @ApiModelProperty(value = "学校id",required = true)
    @Column(name = "school_id")
    private String schoolId;

    @ApiModelProperty(value = "学校code")
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
    private String gradeCode;

    @ApiModelProperty("年级名称")
    @Transient
    private String gradeName;

    @ApiModelProperty(value = "学科id",required = true)
    @Column(name = "course_id")
    private String courseId;

    @ApiModelProperty("学科名称")
    @Transient
    private String courseName;

    @ApiModelProperty(value = "学科code")
    @Column(name = "course_code")
    private String courseCode;

    @ApiModelProperty(value = "教材id",required = true)
    @Column(name = "textbook_id")
    private String textbookId;

    @ApiModelProperty(value = "教材code")
    @Column(name = "textbook_code")
    private String textbookCode;

    @ApiModelProperty("教材名称")
    @Transient
    private String textbookName;

    @ApiModelProperty(value = "学年id",required = true)
    @Column(name = "academic_year_id")
    private String academicYearId;

    @ApiModelProperty(value = "学年code")
    @Column(name = "academic_year_code")
    private String academicYearCode;


    @ApiModelProperty(value = "学期id",required = true)
    @Column(name = "semester_id")
    private String semesterId;

    @ApiModelProperty(value = "学期code")
    @Column(name = "semester_code")
    private String semesterCode;

    @ApiModelProperty(value = "版本id",required = true)
    @Column(name = "version_id")
    private String versionId;

    @ApiModelProperty(value = "版本code")
    @Column(name = "version_code")
    private String versionCode;

    @ApiModelProperty("版本名称")
    @Transient
    private String publishName;

    @ApiModelProperty(value = "设置类型",required = true)
    @Column(name = "set_type")
    private Integer setType;

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

    public Integer getSetType() {
        return setType;
    }

    public void setSetType(Integer setType) {
        this.setType = setType;
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

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }
}