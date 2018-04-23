package domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="res_share")
@ApiModel(description = "资源分享表")
public class ResShare {

    @ApiModelProperty(value = "ID",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "资源ID",required = true)
    @Column(name = "res_id")
    private String resId;

    @ApiModelProperty(value = "创建人id" ,required = true)
    @Column(name = "creator_id")
    private String creatorId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间",required = true)
    @Column(name = "create_time")
    private Timestamp createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "修改时间")
    @Column(name = "modify_time")
    private Timestamp modifyTime;

    @ApiModelProperty(value = "分享类型 1 网盘 2 动态 3 好友",required = true)
    @Column(name = "share_type")
    private Integer shareType;

    @ApiModelProperty(value = "分享业务关联ID",required = true)
    @Column(name = "business_id")
    private String businessId;

    @ApiModelProperty(value = "是否删除")
    @Column(name = "is_delete")
    private Boolean isDelete;


    @ApiModelProperty(value = "网盘父级目录ID")
    @Transient
    private String wpDocId;

    @ApiModelProperty(value = "网盘账号")
    @Transient
    private String wpAccount;

    public String getWpDocId() {
        return wpDocId;
    }

    public void setWpDocId(String wpDocId) {
        this.wpDocId = wpDocId;
    }

    public String getWpAccount() {
        return wpAccount;
    }

    public void setWpAccount(String wpAccount) {
        this.wpAccount = wpAccount;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getShareType() {
        return shareType;
    }

    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}