package domain.view;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 流水记录
 */
public class IntegralFlowRecordView extends DomainView {

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "规则ID")
    private String ruleId;

    @ApiModelProperty(value = "功能代码")
    private String functionCode;

    @ApiModelProperty(value = "业务ID")
    private String businessId;

    @ApiModelProperty(value = "本次分值")
    private BigDecimal score;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode == null ? null : functionCode.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}