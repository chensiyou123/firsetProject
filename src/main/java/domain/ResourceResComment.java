package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@ApiModel(description = "资源评论")
@Entity
@Table(name = "res_comment_new")
public class ResourceResComment extends BaseExtDomain {

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name = "res_id")
    private String resId;


    @ApiModelProperty(value = "评论内容")
    @Column(name = "comment_content")
    private String commentContent;

    @ApiModelProperty(value = "父评论id")
    @Column(name = "parent_id")
    private String parentId;

    @ApiModelProperty(value = "评论类型")
    @Column(name = "comment_type")
    private Integer commentType;

    @Transient
    @ApiModelProperty(value = "回复")
    private List<ResourceResComment> comments;

    @Transient
    @ApiModelProperty(value = "头像")
    private String userPhoto;

    @Transient
    @ApiModelProperty(value = "资源标题")
    private String resTitle;

    @Transient
    @ApiModelProperty(value = "资源文件id")
    private String fileId;

    @Transient
    @ApiModelProperty(value = "评论人")
    private String userName;

    @Transient
    @ApiModelProperty(value = "作者Id")
    private String authorId;

    @Transient
    @ApiModelProperty(value = "作者Name")
    private String authorName;



    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
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

    public String getResTitle() {
        return resTitle;
    }

    public void setResTitle(String resTitle) {
        this.resTitle = resTitle;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}