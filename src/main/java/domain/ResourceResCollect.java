package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="res_record_collect_new")
@ApiModel(description = "收藏数据表")
public class ResourceResCollect extends BaseExtDomain{

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name="res_id")
    private String resId;

    @ApiModelProperty(value = "收藏类型")
    @Column(name="collect_type")
    private Integer collectType;

    @ApiModelProperty(value = "资源标题")
    @Transient
    private  String title;

    @ApiModelProperty(value = "类型id")
    @Transient
    private String typeId;

    @ApiModelProperty(value = "作者")
    @Transient
    private String author;


    @ApiModelProperty(value = "收藏数量")
    @Transient
    private Long collectCount;

    public Long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }


    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public Integer getCollectType() {
        return collectType;
    }

    public void setCollectType(Integer collectType) {
        this.collectType = collectType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}