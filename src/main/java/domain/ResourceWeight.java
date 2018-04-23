package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 权重
 */
@Entity
@Table(name="res_weight_new")
@ApiModel(description = "权重数据表")
public class ResourceWeight extends BaseExtDomain{

    @ApiModelProperty(value = "编码",required = true)
    private String code;

    @ApiModelProperty(value = "权重名称" ,required = true)
    private String name;

    @ApiModelProperty(value="权重值",required = true)
    private BigDecimal value;

    @ApiModelProperty(value = "机构id",required = true)
    @Column(name = "org_id")
    private String orgId;//机构id

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}