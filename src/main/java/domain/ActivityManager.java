package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "activity_manager_new")
@ApiModel(description = "资源评比活动负责人")
public class ActivityManager {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id")
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "负责人id")
    @Column(name = "manager_id")
    private String managerId;

    @ApiModelProperty(value = "0 负责人")
    @Column(name = "part_type")
    private Byte partType;

    @ApiModelProperty(value = "备注")
    @Column(name = "remark")
    private String remark;

    /////==============扩展属性================//


    @ApiModelProperty(value = "负责人名")
    @Transient
    private String userName;

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

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public Byte getPartType() {
        return partType;
    }

    public void setPartType(Byte partType) {
        this.partType = partType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}