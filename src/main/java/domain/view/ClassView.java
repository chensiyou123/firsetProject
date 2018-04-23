package domain.view;

import java.util.List;

/**
 * 班级信息
 * Created by dxm on 2017/11/17.
 */
public class ClassView {
    private String id;

    private String code;

    private String className;

    private Integer graduation;

    private String schoolId;

    private String campusId;

    private String gradationId;

    private String gradeId;

    private String teacherUserId;

    /**
     * 学生集合
     */
    private List<UserView> systemStudents;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public void setGraduation(Integer graduation) {
        this.graduation = graduation;
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

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getTeacherUserId() {
        return teacherUserId;
    }

    public void setTeacherUserId(String teacherUserId) {
        this.teacherUserId = teacherUserId;
    }

    public List<UserView> getSystemStudents() {
        return systemStudents;
    }

    public void setSystemStudents(List<UserView> systemStudents) {
        this.systemStudents = systemStudents;
    }
}
