/**
 * 组织机构
 */
package domain.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description = "组织机构对象")
public class OrganizationView implements Serializable {

    @ApiModelProperty(value = "主键id", required = true)
    private String id;

    @ApiModelProperty(value = "编码", required = true)
    private String orgCode;

    @ApiModelProperty("编码路径")
    private String orgCodePath;
    private Integer orgCodePathLenth;

    @ApiModelProperty(value = "名称", required = true)
    private String orgName;

    @ApiModelProperty("名称路径")
    private String orgNamePath;


    @ApiModelProperty("简称")
    private String orgShortName;

    @ApiModelProperty(value = "层级", required = true)
    private Byte orgLevel;

    @ApiModelProperty(value = "排序号", required = true)
    private Byte orgSort;

    @ApiModelProperty(value = "状态 (1 启用 0 停用) 默认1", required = true)
    private Byte status;

    @ApiModelProperty(value = "创建人id", required = true)
    private String creatorId;

    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    @ApiModelProperty(value = "学校id", required = false)
    private String entityId;

    @ApiModelProperty(value = "组织机构LOGO", required = false)
    private String orgLogo;

    @ApiModelProperty(value = "组织机构级别（0 系统 1 区 2 校）", required = true)
    private Byte orgGrade;

    @ApiModelProperty(value = "父级id", required = true)
    private String orgParentId;

    @ApiModelProperty(value = "父级编码", required = true)
    private String orgParentName;

    public Integer getOrgCodePathLenth() {
        return orgCodePath.length();
    }


    public OrganizationView() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrgParentId() {
        return this.orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId == null ? null : orgParentId.trim();
    }

    public String getOrgParentName() {
        return this.orgParentName;
    }

    public void setOrgParentName(String orgParentName) {
        this.orgParentName = orgParentName;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgCodePath() {
        return this.orgCodePath;
    }

    public void setOrgCodePath(String orgCodePath) {
        this.orgCodePath = orgCodePath == null ? null : orgCodePath.trim();
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgNamePath() {
        return this.orgNamePath;
    }

    public void setOrgNamePath(String orgNamePath) {
        this.orgNamePath = orgNamePath == null ? null : orgNamePath.trim();
    }

    public String getOrgShortName() {
        return this.orgShortName;
    }

    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName == null ? null : orgShortName.trim();
    }

    public Byte getOrgLevel() {
        return this.orgLevel;
    }

    public void setOrgLevel(Byte orgLevel) {
        this.orgLevel = orgLevel;
    }

    public Byte getOrgSort() {
        return this.orgSort;
    }

    public void setOrgSort(Byte orgSort) {
        this.orgSort = orgSort;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId == null ? null : entityId.trim();
    }

    public String getOrgLogo() {
        return this.orgLogo;
    }

    public void setOrgLogo(String orgLogo) {
        this.orgLogo = orgLogo;
    }

    public Byte getOrgGrade() {
        return this.orgGrade;
    }

    public void setOrgGrade(Byte orgGrade) {
        this.orgGrade = orgGrade;
    }
}
