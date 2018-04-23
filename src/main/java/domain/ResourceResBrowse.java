package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "res_record_browse_new")
@ApiModel(description = "业务实体")
public class ResourceResBrowse extends BaseExtDomain {

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "res_id")
    private String resId;

    @ApiModelProperty(value = "浏览类型")
    @Column(name = "browse_type")
    private Integer browseType;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public Integer getBrowseType() {
        return browseType;
    }

    public void setBrowseType(Integer browseType) {
        this.browseType = browseType;
    }
}