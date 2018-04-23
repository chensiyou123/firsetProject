package domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "res_reference_record")
@ApiModel(description = "资源引用记录")
public class ResourceReferenceRecord {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "res_id")
    private String resId;

    @ApiModelProperty(value = "应用业务id")
    @Column(name = "business_id")
    private String businessId;

    @ApiModelProperty(value = "应用业务类型")
    @Column(name = "business_type")
    private Integer businessType;

    @ApiModelProperty(value = "创建人id",required = true)
    @Column(name = "creator_id")
    private String creatorId;

    @ApiModelProperty(value = "创建时间",required = true)
    @Column(name = "create_time")
    private Timestamp createTime;


    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}