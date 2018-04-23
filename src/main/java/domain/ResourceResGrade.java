package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "res_grade_new")
@ApiModel(description = "资源打分数据表")
public class ResourceResGrade extends BaseExtDomain{

    @Column(name = "res_id")
    @ApiModelProperty(value ="资源id" ,required = true)
    private String resId;

    @ApiModelProperty(value ="打分项键值" ,required = true)
    @Column(name = "string_id")
    private String stringId;

    @ApiModelProperty(value ="分数" ,required = true)
    private BigDecimal score;

    @ApiModelProperty(value ="评论表id" ,required = true)
    @Column(name = "comment_id")
    private String commentId;

    @ApiModelProperty(value ="打分类型" ,required = true)
    @Column(name = "grade_type")
    private Integer gradeType;


    //========扩展属性======//
    @Transient
    @ApiModelProperty(value = "评论内容")
    private String commentContent;

    @Transient
    @ApiModelProperty(value = "回复")
    private List<ResourceResComment> comments;



    @Transient
    @ApiModelProperty(value = "父评论id")
    private String parentId;

    @Transient
    @ApiModelProperty(value = "用户头像")
    private String userPhoto;



    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId == null ? null : stringId.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public Integer getGradeType() {
        return gradeType;
    }

    public void setGradeType(Integer gradeType) {
        this.gradeType = gradeType;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<ResourceResComment> getComments() {
        return comments;
    }

    public void setComments(List<ResourceResComment> comments) {
        this.comments = comments;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }
}