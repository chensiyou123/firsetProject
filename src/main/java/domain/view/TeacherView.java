package domain.view;

import java.util.List;

/**
 * @author F.S.Zhang
 * @date 2017-11-03
 * Copyright Hanboard
 * Created by F.S.Zhang on 2017-11-03
 * 教师-基本信息-实体域
 */
public class TeacherView extends DomainView {

    private static final long serialVersionUID = -9069831763847131013L;

    /**
     * 性别汉语描述
     */

    private String sexCodeStr;
    /**
     * 任教信息
     */

    List<TeachView> systemTeaches;
    /**
     * 校区名称
     */
    private String campusName;
    /**
     * 学校名称
     */

    private String schoolName;
    /**
     * 密码
     */

    private String password;

    //学段
    private String gradationName;

    //联系方式
    private String contactNumber;

    //性别
    private String sexCode;

    //用户id
    private String userId;

    public String getSexCodeStr() {
        return sexCodeStr;
    }

    public void setSexCodeStr(String sexCodeStr) {
        this.sexCodeStr = sexCodeStr;
    }



    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TeachView> getSystemTeaches() {
        return systemTeaches;
    }

    public void setSystemTeaches(List<TeachView> systemTeaches) {
        this.systemTeaches = systemTeaches;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

