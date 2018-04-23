package domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;


@Entity
@Table(name = "activity_comparison_gauge_new")
public class ActivityComparisonGauge {
    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "活动id",required = true)
    @Column(name = "activity_id")
    private String activityId;

    @ApiModelProperty(value = "量规名称",required = true)
    @Column(name = "gauge_name")
    private String gaugeName;

    @ApiModelProperty(value = "量规占比",required = true)
    @Column(name = "gauge_accounted")
    private BigDecimal gaugeAccounted;

    @ApiModelProperty(value = "量规名称最低分数",required = true)
    @Column(name = "gauge_min_score")
    private BigDecimal gaugeMinScore;

    @ApiModelProperty(value = "量规名称最大分数",required = true)
    @Column(name = "gauge_max_score")
    private BigDecimal gaugeMaxScore;

    @ApiModelProperty(value = "量规分数",required = true)
    @Transient
    private BigDecimal gaugeScore;


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

    public String getGaugeName() {
        return gaugeName;
    }

    public void setGaugeName(String gaugeName) {
        this.gaugeName = gaugeName == null ? null : gaugeName.trim();
    }

    public BigDecimal getGaugeAccounted() {
        return gaugeAccounted;
    }

    public void setGaugeAccounted(BigDecimal gaugeAccounted) {
        this.gaugeAccounted = gaugeAccounted;
    }

    public BigDecimal getGaugeMinScore() {
        return gaugeMinScore;
    }

    public void setGaugeMinScore(BigDecimal gaugeMinScore) {
        this.gaugeMinScore = gaugeMinScore;
    }

    public BigDecimal getGaugeMaxScore() {
        return gaugeMaxScore;
    }

    public void setGaugeMaxScore(BigDecimal gaugeMaxScore) {
        this.gaugeMaxScore = gaugeMaxScore;
    }

    public BigDecimal getGaugeScore() {
        return gaugeScore;
    }

    public void setGaugeScore(BigDecimal gaugeScore) {
        this.gaugeScore = gaugeScore;
    }
}