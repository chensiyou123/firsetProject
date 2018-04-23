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
@Table(name = "res_category_new")
@ApiModel(description = "自定义分类数据表")
public class ResourceCategory extends BaseExtDomain{

    @ApiModelProperty(value ="父类id")
    @Column(name = "parent_id")
    private String parentId;

    @ApiModelProperty(value ="父编码")
    private String code;

    @ApiModelProperty(value ="名称",required = true)
    private String name;

    @ApiModelProperty(value ="机构id",required = true)
    @Column(name = "org_id")
    private String orgId;

    @ApiModelProperty(value ="grade",required = true)
    private Long grade;//等级

    @ApiModelProperty(value ="type",required = true)
    private Integer type;//类型

    @ApiModelProperty(value ="创建人名称")
    @Transient
    private String creatorName;//类型

    @Transient
    private List<ResourceCategory> categories = new ArrayList<>();//子类

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<ResourceCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ResourceCategory> categories) {
        this.categories = categories;
    }

    @Override
    public String getCreatorName() {
        return creatorName;
    }

    @Override
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
}