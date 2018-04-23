package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 *
 */
@Entity
@Table(name = "res_org_resource_new")
@ApiModel(description = "机构资源数据表")
public class ResourceOrgResource extends BaseExtDomain {

    @ApiModelProperty(value = "机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "res_id")
    private String resId;

    @ApiModelProperty(value = "审核人id")
    @Column(name = "approver_id")
    private String approverId;

    @ApiModelProperty(value = "审核人")
    private String approver;

    @ApiModelProperty
    @Column(name = "approver_time")
    private Timestamp approverTime;//审核时间

    @ApiModelProperty(value = "审核级别")
    @Column(name = "org_grade")
    private Integer orgGrade;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getApproverId() {
        return approverId;
    }

    public void setApproverId(String approverId) {
        this.approverId = approverId == null ? null : approverId.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public Timestamp getApproverTime() {
        return approverTime;
    }

    public void setApproverTime(Timestamp approverTime) {
        this.approverTime = approverTime;
    }

    public Integer getOrgGrade() {
        return orgGrade;
    }

    public void setOrgGrade(Integer orgGrade) {
        this.orgGrade = orgGrade;
    }
}