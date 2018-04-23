package domain.view;

/**
 * 年级信息
 * Created by dxm on 2017/11/17.
 */
public class GradeView {
    private String id;// id
    private String gradeName;// 年级名称
    private String code;//年级code
    private String gradationId;// 学段id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
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
}
