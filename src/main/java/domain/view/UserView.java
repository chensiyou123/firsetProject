package domain.view;

/**
 * 学生信息、教师信息
 * Created by dxm on 2017/11/17.
 */
public class UserView {
    private String id;//id

    private String userId;// 用户id

    private String userName;// 姓名

    private String classId;// 班级id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

}
