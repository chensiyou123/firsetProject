package domain;

import com.hanboard.educloud.resource.domain.view.SubscribeDeployView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@ApiModel(description = "订阅分组学校")
@Entity
@Table(name = "res_manager_subscribe_school")
public class ManagerSubscribeSchool extends BaseExtDomain {

    @ApiModelProperty(value = "学校名称",required = true)
    @Column(name = "school_name")
    private String schoolName;

    @ApiModelProperty(value = "学校id",required = true)
    @Column(name = "school_id")
    private String schoolId;

    @ApiModelProperty(value = "学校code")
    @Column(name = "school_code")
    private String schoolCode;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "组id",required = true)
    @Column(name = "group_id")
    private String groupId;

    @ApiModelProperty(value = "配置")
    @Transient
    private List<SubscribeDeployView> subscribeDeployViewList;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode == null ? null : schoolCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public List<SubscribeDeployView> getSubscribeDeployViewList() {
        return subscribeDeployViewList;
    }

    public void setSubscribeDeployViewList(List<SubscribeDeployView> subscribeDeployViewList) {
        this.subscribeDeployViewList = subscribeDeployViewList;
    }
}