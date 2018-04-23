package domain.view;

import java.util.List;

public class SocialDynamicInfoView {
    private String id;
    private String classId;
    private String introducedText;
    private String userId;
    private Byte dynamicType;
    private Byte sendType;
    private Byte attachmentType;
    private String userOrgId;
    private String schoolId;
    private String userType;
    List<SocialDynamicAttachmentView> dynamicAttachmentList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getIntroducedText() {
        return introducedText;
    }

    public void setIntroducedText(String introducedText) {
        this.introducedText = introducedText;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Byte getDynamicType() {
        return dynamicType;
    }

    public void setDynamicType(Byte dynamicType) {
        this.dynamicType = dynamicType;
    }

    public Byte getSendType() {
        return sendType;
    }

    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    public Byte getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(Byte attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(String userOrgId) {
        this.userOrgId = userOrgId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<SocialDynamicAttachmentView> getDynamicAttachmentList() {
        return dynamicAttachmentList;
    }

    public void setDynamicAttachmentList(List<SocialDynamicAttachmentView> dynamicAttachmentList) {
        this.dynamicAttachmentList = dynamicAttachmentList;
    }
}
