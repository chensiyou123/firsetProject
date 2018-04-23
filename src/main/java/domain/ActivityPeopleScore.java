package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "activity_people_score_new")
@ApiModel(description = "评分人表")
public class ActivityPeopleScore {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "work_id")
    private String workId;

    @ApiModelProperty(value = "评分人id",required = true)
    @Column(name = "grading_people_id")
    private String gradingPeopleId;

    @ApiModelProperty(value = "量规总分",required = true)
    @Column(name = "gauge_scores")
    private BigDecimal gaugeScores;

    @ApiModelProperty(value = "评语",required = true)
    @Column(name = "grading_mark")
    private String gradingMark;

    @Transient
    @ApiModelProperty(value = "评分人量规",required = true)
    private List<ActivityGaugeScores>  actGaugeScores;

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

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getGradingPeopleId() {
        return gradingPeopleId;
    }

    public void setGradingPeopleId(String gradingPeopleId) {
        this.gradingPeopleId = gradingPeopleId == null ? null : gradingPeopleId.trim();
    }

    public BigDecimal getGaugeScores() {
        return gaugeScores;
    }

    public void setGaugeScores(BigDecimal gaugeScores) {
        this.gaugeScores = gaugeScores;
    }

    public String getGradingMark() {
        return gradingMark;
    }

    public void setGradingMark(String gradingMark) {
        this.gradingMark = gradingMark == null ? null : gradingMark.trim();
    }

    public List<ActivityGaugeScores> getActGaugeScores() {
        return actGaugeScores;
    }

    public void setActGaugeScores(List<ActivityGaugeScores> actGaugeScores) {
        this.actGaugeScores = actGaugeScores;
    }
}