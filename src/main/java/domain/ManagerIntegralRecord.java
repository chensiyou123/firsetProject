package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "resource_manager_integral_record")
@ApiModel(description = "学校积分使用记录数据表")
public class ManagerIntegralRecord extends BaseExtDomain {

    @ApiModelProperty(value = "学校id",required = true)
    @Column(name = "school_id")
    private String schoolId;

    @ApiModelProperty(value = "学校code")
    @Column(name = "school_code")
    private String schoolCode;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "积分")
    private BigDecimal score;

    @ApiModelProperty(value = "创建人",required = true)
    private String creator;

    @ApiModelProperty(value = "使用类型",required = true)
    private Integer type;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "resource_id")
    private String resourceId;

    @ApiModelProperty(value = "剩余积分")
    @Column(name = "residue_score")
    private BigDecimal residueScore;

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

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public BigDecimal getResidueScore() {
        return residueScore;
    }

    public void setResidueScore(BigDecimal residueScore) {
        this.residueScore = residueScore;
    }
}