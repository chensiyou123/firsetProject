package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "activity_gauge_scores_new")
@ApiModel(description = "评分人量规")
public class ActivityGaugeScores implements Serializable{

    private static final long serialVersionUID = -5031184801116387947L;
    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;


    @ApiModelProperty(value = "评分表ID",required = true)
    @Column(name = "grade_id")
    private String gradeId;

    @ApiModelProperty(value = "量规ID",required = true)
    @Column(name = "gauge_id")
    private String gaugeId;

    @ApiModelProperty(value = "量规分数",required = true)
    @Column(name = "gauge_score")
    private BigDecimal gaugeScore;

    @ApiModelProperty(value = "作品标题")
    @Transient
    private String workTitle;

    @ApiModelProperty(value = "量规名称")
    @Transient
    private String gaugeName;

    @ApiModelProperty(value = "评分人Id")
    @Transient
    private String gradingPeopleId;
    /**
     * 评分人名称
     */
    @ApiModelProperty(value = "评分人名称")
    @Transient
    private String gradingPeopleName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public String getGaugeId() {
        return gaugeId;
    }

    public void setGaugeId(String gaugeId) {
        this.gaugeId = gaugeId == null ? null : gaugeId.trim();
    }

    public BigDecimal getGaugeScore() {
        return gaugeScore;
    }

    public void setGaugeScore(BigDecimal gaugeScore) {
        this.gaugeScore = gaugeScore;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getGaugeName() {
        return gaugeName;
    }

    public void setGaugeName(String gaugeName) {
        this.gaugeName = gaugeName;
    }

    public String getGradingPeopleId() {
        return gradingPeopleId;
    }

    public void setGradingPeopleId(String gradingPeopleId) {
        this.gradingPeopleId = gradingPeopleId;
    }

    public String getGradingPeopleName() {
        return gradingPeopleName;
    }

    public void setGradingPeopleName(String gradingPeopleName) {
        this.gradingPeopleName = gradingPeopleName;
    }
}