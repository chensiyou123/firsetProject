package domain.view;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 积分规则
 */
public class IntegralRuleView extends BaseExtDomainVie implements Serializable {

    @ApiModelProperty(value = "模块ID")
    private String moduleId;

    @ApiModelProperty(value = "功能ID")
    private String functionId;

    @ApiModelProperty(value = "功能代码")
    private String functionCode;

    @ApiModelProperty(value = "规则标题")
    private String title;

    @ApiModelProperty(value = "规则类型")
    private Integer ruleType;

    @ApiModelProperty(value = "优先级")
    private Integer priority;

    @ApiModelProperty(value = "是否全局")
    private Boolean isGlobe;

    @ApiModelProperty(value = "是否活动使用")
    private Boolean isActivityUse;

    @ApiModelProperty(value = "积分")
    private BigDecimal score;

    @ApiModelProperty(value = "是否应用公式")
    private Boolean isFormulaUse;

    @ApiModelProperty(value = "公式")
    private String formula;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "日上限")
    private BigDecimal dayLimit;

    @ApiModelProperty(value = "月上限")
    private BigDecimal monthLimit;

    @ApiModelProperty(value = "总上限")
    private BigDecimal totalLimit;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getGlobe() {
        return isGlobe;
    }

    public void setGlobe(Boolean globe) {
        isGlobe = globe;
    }

    public Boolean getActivityUse() {
        return isActivityUse;
    }

    public void setActivityUse(Boolean activityUse) {
        isActivityUse = activityUse;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Boolean getFormulaUse() {
        return isFormulaUse;
    }

    public void setFormulaUse(Boolean formulaUse) {
        isFormulaUse = formulaUse;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(BigDecimal dayLimit) {
        this.dayLimit = dayLimit;
    }

    public BigDecimal getMonthLimit() {
        return monthLimit;
    }

    public void setMonthLimit(BigDecimal monthLimit) {
        this.monthLimit = monthLimit;
    }

    public BigDecimal getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(BigDecimal totalLimit) {
        this.totalLimit = totalLimit;
    }



}