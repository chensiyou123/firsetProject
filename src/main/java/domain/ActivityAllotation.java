package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "activity_allotation_new")
@ApiModel(description = "作品专家评审关系")
public class ActivityAllotation {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "参与人id",required = true)
    @Column(name = "participant_id")
    private String participantId;

    @ApiModelProperty(value = "作品id",required = true)
    @Column(name = "work_id")
    private String workId;

    @ApiModelProperty(value = "参与人Name")
    @Transient
    private String userName;

    @ApiModelProperty(value = "作品标题")
    @Transient
    private String workTitle;

    @ApiModelProperty(value = "统计人数")
    @Transient
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId == null ? null : participantId.trim();
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }
}