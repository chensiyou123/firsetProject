package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Table(name="res_manager_school")
@ApiModel(description = "合作学校")
public class ManagerSchool extends BaseExtDomain {

    @ApiModelProperty(value = "学校id",required = true)
    @Column(name = "school_id")
    private String schoolId;

    @ApiModelProperty(value = "学校code")
    @Column(name = "school_code")
    private String schoolCode;

    @ApiModelProperty(value = "学校名称")
    @Column(name = "school_name")
    private String schoolName;

    @ApiModelProperty(value = "开始时间",required = true)
    @Column(name = "start_date")
    private Date startDate;

    @ApiModelProperty(value = "结束时间",required = true)
    @Column(name = "end_date")
    private Date endDate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "学校地址")
    @Transient
    private String schoolAddress;

    @ApiModelProperty(value = "学校电话")
    @Transient
    private String telephone;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}