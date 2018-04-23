package domain.view;

/**
 * 用户基本信息
 * Created by HBD on 2017/12/7.
 */
public class AccountView {

    private String id;//id

    private String orgId;//机构id

    private String campusId;//校区id

    private String schoolId;//学校id

    private String gradationId;//学段id

    private String userName;//用户名

    private String logonName;//登录名


    private String accountAvatar;

    private SchoolView school;

    private String orgName;
    private String systemCode;

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public SchoolView getSchool() {
        return school;
    }

    public void setSchool(SchoolView school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountAvatar() {
        return accountAvatar;
    }

    public void setAccountAvatar(String accountAvatar) {
        this.accountAvatar = accountAvatar;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getLogonName() {
        return logonName;
    }

    public void setLogonName(String logonName) {
        this.logonName = logonName;
    }

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }
}
