package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApiModel(description = "资源评比活动对应资源类型配置")
@Entity
@Table(name = "activity_type_config_new")
public class ActivityTypeConfig {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "资源类型ID",required = true)
    @Column(name = "resource_type_id")
    private String resourceTypeId;

    @ApiModelProperty(value = "是否必须上传",required = true)
    @Column(name = "is_must_upload")
    private Boolean isMustUpload;

    @ApiModelProperty(value = "最低个数",required = true)
    @Column(name = "min_number")
    private Integer minNumber;

    @ApiModelProperty(value = "最大个数",required = true)
    @Column(name = "max_number")
    private Integer maxNumber;

    @ApiModelProperty(value = "文件大小",required = true)
    @Column(name = "file_size")
    private BigDecimal fileSize;

    @ApiModelProperty(value = "文件类型",required = true)
    @Column(name = "suffix")
    private String suffix;

    @ApiModelProperty(value = "类型选取时间",required = true)
    @Column(name = "choose_time")
    private Date chooseTime;

    @ApiModelProperty(value = "类型名称")
    @Transient
    private String typeName;

    @ApiModelProperty(value = "资源文件")
    @Transient
    private List<ResourceInfo>resources=new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(String resourceTypeId) {
        this.resourceTypeId = resourceTypeId == null ? null : resourceTypeId.trim();
    }

    public Boolean getIsMustUpload() {
        return isMustUpload;
    }

    public void setIsMustUpload(Boolean isMustUpload) {
        this.isMustUpload = isMustUpload;
    }

    public Integer getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public Date getChooseTime() {
        return chooseTime;
    }

    public void setChooseTime(Date chooseTime) {
        this.chooseTime = chooseTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<ResourceInfo> getResources() {
        return resources;
    }

    public void setResources(List<ResourceInfo> resources) {
        this.resources = resources;
    }
}