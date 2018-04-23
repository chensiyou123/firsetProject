package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "activity_participant_new")
@ApiModel(description = "参与人")
public class ActivityParticipant {

    @ApiModelProperty(value = "id", required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id", required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "参与人id", required = true)
    @Column(name = "participant_id")
    private String participantId;

    @ApiModelProperty(value = "参与人名称")
    @Transient
    private String userName;

    @ApiModelProperty(value = "参与人登录名")
    @Transient
    private String logName;

    @ApiModelProperty(value = "参与类型", required = true)
    @Column(name = "part_type")
    private Integer partType;

    @ApiModelProperty(value = "参与时间", required = true)
    @Column(name = "part_time")
    private Date partTime;

    @ApiModelProperty(value = "审核状态", required = true)
    @Column(name = "audit_status")
    private Integer auditStatus;

    @ApiModelProperty(value = "审核人id", required = true)
    @Column(name = "auditor_id")
    private String auditorId;

    @ApiModelProperty(value = "审核时间", required = true)
    @Column(name = "audit_time")
    private Date auditTime;

    @ApiModelProperty(value = "活动名称", required = true)
    @Column(name = "remark")
    private String remark;

    @ApiModelProperty(value = "状态", required = true)
    @Column(name = "status")
    private Integer status;

    @ApiModelProperty(value = "学校")
    @Transient
    private String schoolName;

    @ApiModelProperty(value = "参与人数")
    @Transient
    private Integer actCount;

    @ApiModelProperty(value = "学段")
    @Transient
    private String gradationName;

    @ApiModelProperty(value = "年级")
    @Transient
    private String gradeName;


    @ApiModelProperty(value = "课程")
    @Transient
    private String courseName;

    @ApiModelProperty(value = "联系方式")
    @Transient
    private String contactNumber;

    @ApiModelProperty(value = "性别")
    @Transient
    private String sex;

    @ApiModelProperty(value = "性别")
    @Transient
    private Integer workNum;

    @ApiModelProperty(value = "获奖次数")
    @Transient
    private Integer levelNum;

    @ApiModelProperty(value = "组织机构")
    @Transient
    private String OrgName;

    @ApiModelProperty(value = "头像")
    @Transient
    private String accountAvatar;

    @ApiModelProperty(value = "专家需要评审的作品")
    @Transient
    private List<ActivityWork> fileList = new ArrayList<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId == null ? null : participantId.trim();
    }

    public Integer getPartType() {
        return partType;
    }

    public void setPartType(Integer partType) {
        this.partType = partType;
    }

    public Date getPartTime() {
        return partTime;
    }

    public void setPartTime(Date partTime) {
        this.partTime = partTime;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<ActivityWork> getFileList() {
        return fileList;
    }

    public void setFileList(List<ActivityWork> fileList) {
        this.fileList = fileList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getWorkNum() {
        return workNum;
    }

    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    public Integer getActCount() {
        return actCount;
    }

    public void setActCount(Integer actCount) {
        this.actCount = actCount;
    }

    public Integer getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(Integer levelNum) {
        this.levelNum = levelNum;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public String getAccountAvatar() {
        return accountAvatar;
    }

    public void setAccountAvatar(String accountAvatar) {
        this.accountAvatar = accountAvatar;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }
}
