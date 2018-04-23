package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "res_solr")
@ApiModel(description = "solr异常数据")
public class ResSolr {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "资源ID",required = true)
    @Column(name = "res_id")
    private String resId;

    @ApiModelProperty(value = "异常信息",required = true)
    @Column(name = "exception_info")
    private String exceptionInfo;

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

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }
}