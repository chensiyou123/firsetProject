package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "res_file_format_group_new")
@ApiModel(description = "文件格式分组")
public class ResourceFileFormatGroup extends BaseExtDomain  {

    @ApiModelProperty(value ="组名称",required = true)
    @Column(name = "group_name")
    private String groupName;

    @ApiModelProperty(value ="分组编码",required = true)
    @Column(name = "group_code")
    private String groupCode;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
}