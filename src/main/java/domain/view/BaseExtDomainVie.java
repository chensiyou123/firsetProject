package domain.view;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 实体域扩展基类
 */

public class BaseExtDomainVie extends DomainView implements Serializable {

    @ApiModelProperty(value = "状态")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
