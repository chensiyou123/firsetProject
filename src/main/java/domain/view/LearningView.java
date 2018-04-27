package domain.view;

/**
 * Created by F.S.Zhang on 2017/11/10.
 */

public class LearningView extends DomainView {

    private String userId;

    private String studentId;

    private String classId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }


}
