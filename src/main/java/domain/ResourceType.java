package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="res_resource_type_new")
@ApiModel(description = "资源类型数据表")
public class ResourceType extends BaseExtDomain {

    @ApiModelProperty(value = "排序",required = true)
    @Column(name = "sorted")
    private Long sorted;



    @ApiModelProperty(value = "父id")
    @Column(name = "parent_id")
    private String parentId;

    @ApiModelProperty(value = "内部编码",required = true)
    private String code;

    @ApiModelProperty(value = "类型名称",required = true)
    private String name;

    @ApiModelProperty(value = "组织机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

    @ApiModelProperty(value = "层级",required = true)
    private Long grade;

    @Transient
    private List<ResourceType> resourceTypes = new ArrayList<>();//子类

    @Transient
    private String createName;//创建人名称


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public List<ResourceType> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<ResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Long getSorted() {
        return sorted;
    }

    public void setSorted(Long sorted) {
        this.sorted = sorted;
    }
}