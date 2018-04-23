package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;

@Entity
@Table(name = "res_manager_discount_record")
@ApiModel(description = "积分使用折扣修改记录数据表")
public class ManagerDiscountRecord extends BaseExtDomain {

    @ApiModelProperty(value = "积分id",required = true)
    @Column(name = "integral_id")
    private String integralId;

    @ApiModelProperty(value = "原始折扣")
    @Column(name = "old_discount")
    private BigDecimal oldDiscount;

    @ApiModelProperty(value = "现在折扣")
    private BigDecimal discount;

    @Transient
    @ApiModelProperty(value = "积分")
    private BigDecimal addScore;

    public String getIntegralId() {
        return integralId;
    }

    public void setIntegralId(String integralId) {
        this.integralId = integralId == null ? null : integralId.trim();
    }

    public BigDecimal getOldDiscount() {
        return oldDiscount;
    }

    public void setOldDiscount(BigDecimal oldDiscount) {
        this.oldDiscount = oldDiscount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getAddScore() {
        return addScore;
    }

    public void setAddScore(BigDecimal addScore) {
        this.addScore = addScore;
    }
}