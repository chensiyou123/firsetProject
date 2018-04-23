package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@ApiModel(description = "新闻管理")
@Entity
@Table(name = "res_manager_news")
public class ManagerNews extends BaseExtDomain {

    @ApiModelProperty(value = "排序",required = true)
    private Long sort;

    @ApiModelProperty(value = "标题",required = true)
    private String title;

    @ApiModelProperty(value = "封面id")
    @Column(name="cover_id")
    private String coverId;

    @ApiModelProperty(value = "内容")
    @Transient
    private String content;


    @ApiModelProperty(value = "创建人")
    @Transient
    private String createName;

    @ApiModelProperty(value = "浏览次数")
    @Transient
    private Integer browseCount;

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCoverId() {
        return coverId;
    }

    public void setCoverId(String coverId) {
        this.coverId = coverId == null ? null : coverId.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }
}