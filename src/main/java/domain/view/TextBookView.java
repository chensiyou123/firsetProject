package domain.view;

/**
 * 教材信息
 * Created by dxm on 2017/11/17.
 */
public class TextBookView {
    private String id;

    private String gradeId;

    private String courseId;

    private String gradationId;

    private String code;

    private String textbookName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }
}
