package domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "activity_level_new")
public class ActivityLevel {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "等级名称",required = true)
    @Column(name = "level_name")
    private String levelName;

    @ApiModelProperty(value = "分数上线",required = true)
    @Column(name = "up_number")
    private BigDecimal upNumber;

    @ApiModelProperty(value = "分数下线",required = true)
    @Column(name = "lown_number")
    private BigDecimal lownNumber;

    @ApiModelProperty(value = "描述",required = true)
    @Column(name = "level_desc")
    private String levelDesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public BigDecimal getUpNumber() {
        return upNumber;
    }

    public void setUpNumber(BigDecimal upNumber) {
        this.upNumber = upNumber;
    }

    public BigDecimal getLownNumber() {
        return lownNumber;
    }

    public void setLownNumber(BigDecimal lownNumber) {
        this.lownNumber = lownNumber;
    }

    public String getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc == null ? null : levelDesc.trim();
    }
}