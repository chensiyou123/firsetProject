package domain.view;
import java.io.Serializable;

/**
 * 班级教材-实体
 *
 * @author anowls
 */

public class CourseDistView extends DomainView implements Serializable {

    private String orgId;

    private String schoolId;


    private String campusId;


    private String classId;


    private String gradationId;

    private String leamYearId;

    private String leamTermId;

    private String gradeId;

    private String textbookId;

    private String gradeCode;


    private String courseCode;


    private String gradationCode;


    private String courseId;


    private Integer sortNumber;


    private boolean status;

    private byte allotMode;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getLeamYearId() {
        return leamYearId;
    }

    public void setLeamYearId(String leamYearId) {
        this.leamYearId = leamYearId;
    }

    public String getLeamTermId() {
        return leamTermId;
    }

    public void setLeamTermId(String leamTermId) {
        this.leamTermId = leamTermId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(String textbookId) {
        this.textbookId = textbookId;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getGradationCode() {
        return gradationCode;
    }

    public void setGradationCode(String gradationCode) {
        this.gradationCode = gradationCode;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public byte getAllotMode() {
        return allotMode;
    }

    public void setAllotMode(byte allotMode) {
        this.allotMode = allotMode;
    }
}
