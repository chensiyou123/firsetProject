package domain.view;

/**
 * 教师授课班级信息（包含分组信息）
 * Created by dxm on 2017/11/16.
 */
public class TeachClassView {
    private String classId;
    private String className;
    private String classCode;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

}
