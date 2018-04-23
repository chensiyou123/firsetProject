package domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 实体域扩展基类
 */
@MappedSuperclass
public class BaseExtDomain extends BaseDomain implements Serializable {

    @ApiModelProperty(value = "状态")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
