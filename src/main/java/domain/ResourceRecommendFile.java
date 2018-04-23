package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "res_recommend_file_new")
@ApiModel(description = "推荐资源数据表")
public class ResourceRecommendFile extends BaseDomain {


    @ApiModelProperty(value = "资源id",required = true)
    @Column(name="res_id")
    private String resId;

    @ApiModelProperty(value = "推荐分数")
    @Column(name="recommend_score")
    private BigDecimal recommendScore;

    @ApiModelProperty(value = "推优级别")
    @Column(name="recommend_type")
    private Integer recommendType;

    @ApiModelProperty(value = "推荐人id",required = true)
    @Column(name="recommend_id")
    private String recommendId;

    @ApiModelProperty(value = "推荐人名")
    private String recommend;

    @ApiModelProperty(value = "推荐时间",required = true)
    @Column(name="recommend_time")
    private Timestamp recommendTime;


    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public BigDecimal getRecommendScore() {
        return recommendScore;
    }

    public void setRecommendScore(BigDecimal recommendScore) {
        this.recommendScore = recommendScore;
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId == null ? null : recommendId.trim();
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend == null ? null : recommend.trim();
    }

    public Timestamp getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Timestamp recommendTime) {
        this.recommendTime = recommendTime;
    }
}