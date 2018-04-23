package domain.view;

import java.io.Serializable;

public class TeachView extends DomainView implements Serializable {

    private static final long serialVersionUID = 3949104609620630003L;

    private String userId;



    private String teacherId;



    private String courseId;


    private String classId;


    private Integer masterFlag;
    /**
     * 教师名字
     */

    private String userName;
    /**
     * 创建者名称
     */

    private String creatorName;
    /**
     * 年级名称
     */

    private String gradeName;
    /**
     * 年级id
     */

    private String gradeId;
    /**
     * 学段id
     */

    private String gradationId;
    /**
     * 学段名称
     */

    private String gradationName;
    /**
     * 学校id
     */

    private String schoolId;
    /**
     * 学校名称
     */

    private String schoolName;
    /**
     * 校区id
     */

    private String campusId;
    /**
     * 校区名称
     */

    private String campusName;
    /**
     * 班级名称
     */

    private String className;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Integer getMasterFlag() {
        return masterFlag;
    }

    public void setMasterFlag(Integer masterFlag) {
        this.masterFlag = masterFlag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
