package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 文件格式实体
 */
@Entity
@Table(name = "res_file_format_new")
@ApiModel(description = "文件格式")
public class ResourceFileFormat extends BaseExtDomain {

    @ApiModelProperty(value = "后缀",required = true)
    private String suffix;

    @ApiModelProperty(value = "图标名称")
    private String icon;

    @ApiModelProperty(value = "组织结构id" ,required = true)
    @Column(name = "group_id")
    private String groupId;

    @ApiModelProperty(value = "组织结构Code" ,required = true)
    @Transient
    private String groupCode;

    @ApiModelProperty(value = "播放器编号")
    @Column(name = "player_id")
    private Long playerId;

    @ApiModelProperty(value = "组名称")
    @Transient
    private String groupName;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}