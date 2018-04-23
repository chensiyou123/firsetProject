package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "activity_attachment_new")
@ApiModel(description = "活动附件")
public class ActivityAttachment {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "附件id",required = true)
    @Column(name = "schedule_id")
    private String scheduleId;

    @ApiModelProperty(value = "附件大小",required = true)
    @Column(name = "schedule_size")
    private BigDecimal scheduleSize;

    @ApiModelProperty(value = "附件文件名",required = true)
    @Column(name = "schedule_name")
    private String scheduleName;

    @ApiModelProperty(value = "附件后缀",required = true)
    @Column(name = "suffix")
    private String suffix;


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

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId == null ? null : scheduleId.trim();
    }

    public BigDecimal getScheduleSize() {
        return scheduleSize;
    }

    public void setScheduleSize(BigDecimal scheduleSize) {
        this.scheduleSize = scheduleSize;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName == null ? null : scheduleName.trim();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }
}