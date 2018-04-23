package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "res_keyvalue_new")
@ApiModel(description = "系统键值表")
public class ResourceKeyvalue extends BaseExtDomain {

    @ApiModelProperty(value = "编码",required = true)
    private String code;

    @ApiModelProperty(value = "名称",required = true)
    private String name;

    @ApiModelProperty(value ="值",required = true)
    private String value;

    @ApiModelProperty(value = "机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}