package domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity_scope_new")
@ApiModel(description = "范围")
public class ActivityScope {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动ID",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "范围ID",required = true)
    @Column(name = "scope_id")
    private String scopeId;

    @ApiModelProperty(value = "范围类型",required = true)
    @Column(name = "scope_type")
    private Byte scopeType;

    @ApiModelProperty(value = "父级ID",required = true)
    @Column(name = "parent_id")
    private String parentId;

    @ApiModelProperty(value = "父级类型",required = true)
    @Column(name = "parent_type")
    private Byte parentType;


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

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId == null ? null : scopeId.trim();
    }

    public Byte getScopeType() {
        return scopeType;
    }

    public void setScopeType(Byte scopeType) {
        this.scopeType = scopeType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Byte getParentType() {
        return parentType;
    }

    public void setParentType(Byte parentType) {
        this.parentType = parentType;
    }
}