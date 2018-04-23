package domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;

@ApiModel(description = "作品资源文件")
@Entity
@Table(name = "activity_resource_new")
public class ActivityResource {


    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "作品id",required = true)
    @Column(name = "work_id")
    private String workId;

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "resource_id")
    private String resourceId;

    @ApiModelProperty(value = "资源类型",required = true)
    @Column(name = "resource_type_id")
    private String resourceTypeId;

    @ApiModelProperty(value = "是否推优到资源平台",required = true)
    @Column(name = "is_to_resource")
    private String isToResource;

    @ApiModelProperty(value = "状态",required = true)
    @Column(name = "status")
    private Integer status;

    @ApiModelProperty(value = "资源名称")
    @Transient
    private String title;


    @ApiModelProperty(value = "资源名称")
    @Transient
    private String levelId;

    @ApiModelProperty(value = "资源类型")
    @Transient
    private String typeName;

    @ApiModelProperty(value = "推优分数")
    @Transient
    private BigDecimal score;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(String resourceTypeId) {
        this.resourceTypeId = resourceTypeId == null ? null : resourceTypeId.trim();
    }

    public String getIsToResource() {
        return isToResource;
    }

    public void setIsToResource(String isToResource) {
        this.isToResource = isToResource == null ? null : isToResource.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }
}