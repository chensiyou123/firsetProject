package domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "res_manager_subscribe_group")
@ApiModel(description = "学校分组数据表")
public class ManagerSubscribeGroup extends BaseExtDomain{

    @ApiModelProperty(value = "分组名",required = true)
    private String name;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "分组对应的学校")
    @Transient
    private List<ManagerSubscribeSchool> managerSubscribeSchoolList = new ArrayList<>();//分组学校
    @Transient
    private String schooName;//显示学校名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public List<ManagerSubscribeSchool> getManagerSubscribeSchoolList() {
        return managerSubscribeSchoolList;
    }

    public void setManagerSubscribeSchoolList(List<ManagerSubscribeSchool> managerSubscribeSchoolList) {
        this.managerSubscribeSchoolList = managerSubscribeSchoolList;
    }

    public String getSchooName() {
        return schooName;
    }

    public void setSchooName(String schooName) {
        this.schooName = schooName;
    }

}